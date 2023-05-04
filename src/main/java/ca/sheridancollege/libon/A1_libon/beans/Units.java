/*
 * Name: Bonita Li
 * File: Units.java
 * Other Files in this Project:
 * 		index.html
 * 		order.html
 * 		main.css
 * 		Cheese.java
 * 		MainController.java
 */
package ca.sheridancollege.libon.A1_libon.beans;

/**
 * Units for measuring cheese.
 * 
 * @author Wendi Jollymore
 *
 */
public enum Units {
    
    /** lb. Wheel */
    WHEEL ("lb. Wheel"),
    /** lb. Half Wheel */
    HALF_WHEEL ("lb. Half Wheel"),
    /** lb. Quarter Wheel */
    QUARTER_WHEEL ("lb. Quarter Wheel"),
    /** lb. Eighth Wheel */
    EIGHTH_WHEEL ("lb. Eighth Wheel"),
    /** lb. Square */
    SQUARE ("lb. Square"),
    /** lb. Tomme */
    TOMME ("lb. Tomme");
    
    private String unitDesc;
    
    private Units(String desc) {
        unitDesc = desc;
    }
    
    /**
     * Retrieve the description of the units.
     * 
     * @return the units description
     */
    public String getUnitDesc() {
        return unitDesc;
    }
    
    /**
     * Retrieves this unit as a string (the units description).
     * 
     * @return the unit as a string
     */
    public String toString() {
        return unitDesc;
    }
}
