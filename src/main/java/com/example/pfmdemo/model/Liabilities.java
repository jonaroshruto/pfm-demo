package com.example.pfmdemo.model;


public class Liabilities {



    private int mortgageCost;
    private int taxCost;
    private int carLoan;
    private int studentLoan;
    private int creditCost;
    private int total;

    public Liabilities(int mortgageCost, int taxCost, int carLoan, int studentLoan, int creditCost) {
        this.mortgageCost= mortgageCost;
        this.taxCost= taxCost;
        this.carLoan= carLoan;
        this.studentLoan= studentLoan;
        this.creditCost= creditCost;

    }


    public int getTaxCost() {
        return taxCost;
    }

    public void setTaxCost(int taxCost) {
        this.taxCost = taxCost;
    }

    public int getMortgageCost() {
        return mortgageCost;
    }

    public void setMortgageCost(int mortgageCost) {
        this.mortgageCost = mortgageCost;
    }
    public int getCarLoan(){
        return carLoan;
    }
    public void setCarLoan(int carLoan){
        this.carLoan=carLoan;
    }
    public int getStudentLoan(){
        return studentLoan;
    }
    public void setStudentLoan(int studentLoan){
        this.studentLoan=studentLoan;
    }
    public int getCreditCost(){
        return creditCost;
    }
    public void setCreditCost(int creditCost){
        this.creditCost=creditCost;
    }

    public int getTotal() {
        return total=taxCost+mortgageCost+carLoan+studentLoan+creditCost;
    }
}
