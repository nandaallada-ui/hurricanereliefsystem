package com.model;

public class pet {
    private String type;
    private String specialNeeds;
    private boolean medicationRequired;
    private boolean mobilityIssues;

    /* i think we should have a constructor for this class
    public pet(String type, String specialNeeds, boolean medicationRequired, boolean mobilityIssues) {
        this.type = type;
        this.specialNeeds = specialNeeds;
        this.medicationRequired = medicationRequired;
        this.mobilityIssues = mobilityIssues;
    }
    */

    public String getType() { //made into String to match the type of the variable
        return type;
    }

    public String getSpecialNeeds() { //made into String to match the type of the variable
        return specialNeeds;
    }

    public updateSpecialNeeds(String needs) {
        specialNeeds = needs;
    }
    
}
