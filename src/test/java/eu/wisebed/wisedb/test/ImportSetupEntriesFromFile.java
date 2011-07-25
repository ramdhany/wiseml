package eu.wisebed.wisedb.test;

import eu.wisebed.wisedb.HibernateUtil;
import eu.wisebed.wisedb.importer.CapabilityImporter;
import eu.wisebed.wisedb.importer.NodeImporter;
import eu.wisebed.wisedb.importer.SetupImporter;
import org.apache.log4j.Logger;

public class ImportSetupEntriesFromFile {

    /**
     * a log4j logger to print messages.
     */
    private static final Logger LOGGER = Logger.getLogger(ImportSetupEntriesFromFile.class);

    public static void main(String[] args) {
        try{
            // Initialize hibernate
            HibernateUtil.connectEntityManagers();

            // Construct a SetupImporter
            final SetupImporter sImp = new SetupImporter();

            // open local file
            try{
                sImp.open("/Developer/whantana.Projects/github/wiseml/src/test/resources/telosB_short.wiseml");
            }catch(Exception e){
                LOGGER.fatal(e);
                System.err.println(e.getMessage());
                System.exit(-1);
            }

            // import to db
            sImp.convert();
        }finally{
            // always close session
            HibernateUtil.getInstance().closeSession();
        }
    }
}
