package eu.wisebed.wiseml.model.scenario;

import eu.wisebed.wiseml.model.setup.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * This is a persistant class for the object scenario that has the
 * properties of a scenario. In the class there are
 * getter and setter methods for the properties.
 */

public class Scenario {

    /**
     * id for object scenario.
     */
    private int id;

    /**
     * timestamp for object scenario.
     */
    private List<Timestamp> timestamp;

    /**
     * node data.
     */
    private Data data;

    /**
     * elements of stream.
     */
    private List children;

    /**
     * construct a new list.
     *
     * @return a new list instance.
     */
    private static List listFactory() {
        return new LinkedList();
    }

    /**
     * returns a LinkedList of objects nested in the scenario section.
     *
     * @return
     */
    public List getChildren() {
        return children;
    }

    /**
     * this method returns scenario id.
     *
     * @return id scenario
     */
    public int getId() {
        return id;
    }

    /**
     * this method sets the scenario id.
     *
     * @param id scenario id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * this method returns a list of timestamps.
     *
     * @return list of timestamps
     */
    public List<Timestamp> getTimestamp() {
        return timestamp;
    }

    /**
     * this method sets a list of timestamps.
     *
     * @param timestamp
     */
    public void setTimestamp(List<Timestamp> timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * this method returns data.
     *
     * @return data
     */
    public Data getData() {
        return data;
    }

    /**
     * this method sets data.
     *
     * @param data
     */
    public void setData(Data data) {
        this.data = data;
    }
}
