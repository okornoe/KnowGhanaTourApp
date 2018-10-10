package com.sourcecodeinc.knowghana;

public class ItemsOnListView {
    private String regionName;
    private String regionCapital;

    public ItemsOnListView (String regionName, String regionCapital) {
        this.regionName = regionName;
        this.regionCapital = regionCapital;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getRegionCapital() {
        return regionCapital;
    }
}
