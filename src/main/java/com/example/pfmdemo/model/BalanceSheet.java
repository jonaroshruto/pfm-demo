package com.example.pfmdemo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(
        value ="balancesheet"
)
public class BalanceSheet {

    private  String userID;

    private IlliquidAssets illiquidAssets;
    private LiquidAssets liquidAssets;
    private Liabilities liabilities;

    public  BalanceSheet(String userID,IlliquidAssets illiquidAssets, LiquidAssets liquidAssets, Liabilities liabilities){
        this.userID=userID;
        this.illiquidAssets = illiquidAssets;
        this.liquidAssets = liquidAssets;
        this.liabilities = liabilities;
    }

    public void getNetWorth(IlliquidAssets illiquidAssets, LiquidAssets liquidAssets, Liabilities liabilities) {
           int netWorth= illiquidAssets.getTotal()+liquidAssets.getTotal()- liabilities.getTotal();
    }


    public IlliquidAssets getIlliquidAssets() {
        return illiquidAssets;
    }

    public void setIlliquidAssets(IlliquidAssets illiquidAssets) {
        this.illiquidAssets = illiquidAssets;
    }

    public LiquidAssets getLiquidAssets() {
        return liquidAssets;
    }

    public void setLiquidAssets(LiquidAssets liquidAssets) {
        this.liquidAssets = liquidAssets;
    }

    public Liabilities getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(Liabilities liabilities) {
        this.liabilities = liabilities;
    }
}
