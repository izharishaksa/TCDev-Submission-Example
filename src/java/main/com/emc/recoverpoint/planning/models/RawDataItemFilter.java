/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.emc.recoverpoint.planning.models;

import java.io.Serializable;

/**
 * <p>
 * This class represents filter for raw data items. It has one no-parameter constructor that is empty.
 * Each field of this class has a getter and setter. There is no validation done in the setters. The properties just set
 * and get the values.
 * </p>
 *
 * <p>
 * <strong>Thread Safety:</strong> This class is mutable and not thread safe.
 * </p>
 *
 * @author albertwang, TCSDEVELOPER
 * @version 1.0
 */
public class RawDataItemFilter extends BaseFilter implements Serializable {

    /**
     * <p>
     * The serial version UID.
     * </p>
     */
    private static final long serialVersionUID = 22344119154L;
    /**
     * <p>
     * Represents the name.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Represents the data type.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * Represents the status.
     * </p>
     *
     * <p>
     * Fully mutable, has getter and setter. Setter performs no validation. Not initialized. Can be any value.
     * </p>
     */
    private String status;

    /**
     * Creates an instance of RawDataItemFilter.
     */
    public RawDataItemFilter() {
        //empty
    }

    /**
     * Gets the name.
     *
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *              The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the data type.
     *
     * @return the data type.
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the data type.
     *
     * @param dataType
     *              The data type to set.
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Gets the status.
     *
     * @return the status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     *
     * @param status
     *              The status to set.
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
