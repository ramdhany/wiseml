package eu.wisebed.wiseconfig.model;


public class Application {


    private String factoryclass;
    private String name;

    private PortalApp portal;
    private wsnDevice wsnDev;

    public String getFactoryclass() {
        return factoryclass;
    }

    public void setFactoryclass(String factoryclass) {
        this.factoryclass = factoryclass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public wsnDevice getWsnDev() {
        return wsnDev;
    }

    public void setWsnDev(wsnDevice wsnDev) {
        this.wsnDev = wsnDev;
    }

    public PortalApp getPortal() {
        return portal;
    }

    public void setPortal(PortalApp portal) {
        this.portal = portal;
    }
}