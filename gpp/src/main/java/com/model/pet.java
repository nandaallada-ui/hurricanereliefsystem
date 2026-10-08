package com.model;

public class pet {
    private String type;
    private String specialNeeds;
    private boolean medicationRequired;
    private boolean mobilityIssues;

    public pet(String type, String specialNeeds, boolean medicationRequired, boolean mobilityIssues) {
        this.type = type;
        this.specialNeeds = specialNeeds;
        this.medicationRequired = medicationRequired;
        this.mobilityIssues = mobilityIssues;
    }

    public String getType() { //made into String to match the type of the variable
        return type;
    }

    public String getSpecialNeeds() { //made into String to match the type of the variable
        return specialNeeds;
    }

    public boolean isMedicationRequired() {
        if (medicationRequired) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMobilityIssues() {
        if (mobilityIssues) {
            return true;
        } else {
            return false;
        }
    }
}
