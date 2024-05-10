package com.example.pfmdemo.model;




public class IlliquidAssets {
    //@Id
    //private  int illAssetID;

    private int homeValue;
    private int autoValue;
    private int personalProperty;
    private int retirementAcct;
    private int realEstateValue;
    private int otherProperty;
    private int total;


    public IlliquidAssets(int homeValue, int autoValue, int personalProperty, int retirementAcct,int realEstateValue,
                          int otherProperty){
        this.homeValue=homeValue;
        this.autoValue=autoValue;
        this.personalProperty=personalProperty;
        this.retirementAcct=retirementAcct;
        this.realEstateValue=realEstateValue;
        this.otherProperty=otherProperty;

    }

    public int getAutoValue() {
        return autoValue;
    }


    public void setAutoValue(int autoValue) {
        this.autoValue = autoValue;
    }

    public int getHomeValue() {
        return homeValue;
    }

    public void setHomeValue(int homeValue) {
        this.homeValue = homeValue;
    }

    public int getPersonalProperty() {
        return personalProperty;
    }

    public void setPersonalProperty(int personalProperty) {
        this.personalProperty = personalProperty;
    }

    public int getRetirementAcct() {
        return retirementAcct;
    }

    public void setRetirementAcct(int retirementAcct) {
        this.retirementAcct = retirementAcct;
    }

    public int getRealEstateValue() {
        return realEstateValue;
    }

    public void setRealEstateValue(int realEstateValue) {
        this.realEstateValue = realEstateValue;
    }

    public int getOtherProperty() {
        return otherProperty;
    }

    public void setOtherProperty(int otherProperty) {
        this.otherProperty = otherProperty;
    }

    public int getTotal() {
        return total=homeValue+autoValue+personalProperty+retirementAcct+realEstateValue+otherProperty;
    }
}
