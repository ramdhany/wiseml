package eu.wisebed.wisedb.controller;

import eu.wisebed.wisedb.model.LinkCapabilities;
import eu.wisebed.wiseml.model.setup.Capability;
import eu.wisebed.wiseml.model.setup.Link;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

/**
 * CRUD operations for LinkCapabilites entities.
 */
@SuppressWarnings("unchecked")
public class LinkCapabilitiesController extends AbstractController<LinkCapabilities> {


    /**
     * static instance(ourInstance) initialized as null.
     */
    private static LinkCapabilitiesController ourInstance = null;

    /**
     * Source literal.
     */
    private static final String SOURCE = "source";
    /**
     * Target literal.
     */
    private static final String TARGET = "target";

    /**
     * Capabilities literal.
     */
    private static final String CAPABILITY = "capability_id";

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(LinkCapabilitiesController.class);


    /**
     * Public constructor .
     */
    public LinkCapabilitiesController() {
        // Does nothing
        super();
    }

    /**
     * LinkController is loaded on the first execution of
     * LinkController.getInstance() or the first access to
     * LinkController.ourInstance, not before.
     *
     * @return ourInstance
     */
    public static LinkCapabilitiesController getInstance() {
        synchronized (LinkCapabilitiesController.class) {
            if (ourInstance == null) {
                ourInstance = new LinkCapabilitiesController();
            }
        }

        return ourInstance;
    }

    public void delete(final Link link, final Capability capability) {

        LOGGER.info("delete(" + link.getSource() + "--" + link.getTarget() + "," + capability.getName() + ")");

        final Session session = this.getSessionFactory().getCurrentSession();
        final LinkCapabilities linkCapabilities = new LinkCapabilities();
        linkCapabilities.setCapabilityId(capability.getName());
        linkCapabilities.setSource(link.getSource());
        linkCapabilities.setTarget(link.getTarget());
        session.delete(linkCapabilities);
    }

    public void add(Link link, Capability capability) {

        LOGGER.info("add(" + link.getSource() + "--" + link.getTarget() + "," + capability.getName() + ")");

        final Session session = this.getSessionFactory().getCurrentSession();
        final LinkCapabilities linkCapabilities = new LinkCapabilities();
        linkCapabilities.setCapabilityId(capability.getName());
        linkCapabilities.setSource(link.getSource());
        linkCapabilities.setTarget(link.getTarget());
        session.delete(linkCapabilities);
    }

    public List<Capability> list(Link link) {
        LOGGER.info("list(" + link.getSource() + "--" + link.getTarget() + ")");
        final Session session = getSessionFactory().getCurrentSession();
        final Criteria criteria = session.createCriteria(LinkCapabilities.class);
        criteria.add(Restrictions.eq(SOURCE, link.getSource()));
        criteria.add(Restrictions.eq(TARGET, link.getTarget()));
        List<Capability> capabilities = new ArrayList<Capability>();
        for (Object obj : criteria.list()) {
            if (obj instanceof String) {
                final String capStr = (String) obj;
                final Capability capability = CapabilityController.getInstance().getByID(capStr);
                if (capability != null) {
                    capabilities.add(capability);
                }
            }
        }
        return capabilities;
    }
}
