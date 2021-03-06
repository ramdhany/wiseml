package eu.wisebed.wiseml.model.trace;

import java.io.Serializable;

/**
 * Message class.
 */
public class Message implements Serializable {

    /**
     * Serial version unique ID.
     */
    private static final long serialVersionUID = -1028564077315177787L;

    /**
     * timestamp.
     */
    private long timestamp;

    /**
     * id.
     */
    private String id;

    /**
     * data.
     */
    private String data;

    /**
     * this method returns the timestamp.
     *
     * @return timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * this method sets the timestamp.
     *
     * @param timestamp timestamp.
     */
    public void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * this method returns the id.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * this method sets the id.
     *
     * @param id id.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * this method returns data.
     *
     * @return data
     */
    public String getData() {
        return data;
    }

    /**
     * this method sets data.
     *
     * @param data data.
     */
    public void setData(final String data) {
        this.data = data;
    }
}
