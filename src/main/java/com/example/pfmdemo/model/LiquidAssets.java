package com.example.pfmdemo.model;


public class LiquidAssets {

    private int cashValue;
    private int investmentsValue;
    private int otherLiquidCash;
    private int otherLiquidCash3;
    private  int total;

    public LiquidAssets(int cashValue, int investmentsValue, int otherLiquidCash, int otherLiquidCash3) {
       this.cashValue=cashValue;
       this.investmentsValue=investmentsValue;
       this.otherLiquidCash=otherLiquidCash;
       this.otherLiquidCash3=otherLiquidCash3;

    }

    public int getCashValue() {
        return cashValue;
    }

    public void setCashValue(int cashValue) {
        this.cashValue = cashValue;
    }

    public int getInvestmentsValue() {
        return investmentsValue;
    }

    public void setInvestmentsValue(int investmentsValue) {
        this.investmentsValue = investmentsValue;
    }

    public int getOtherLiquidCash() {
        return otherLiquidCash;
    }

    public void setOtherLiquidCash(int otherLiquidCash) {
        this.otherLiquidCash = otherLiquidCash;
    }

    public int getOtherLiquidCash3() {
        return otherLiquidCash3;
    }

    public void setOtherLiquidCash3(int otherLiquidCash3) {
        this.otherLiquidCash3 = otherLiquidCash3;
    }



    public int getTotal() {
        return total=cashValue+investmentsValue+otherLiquidCash+otherLiquidCash3;
    }
}
