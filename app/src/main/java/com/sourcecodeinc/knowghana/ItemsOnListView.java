package com.sourcecodeinc.knowghana;

public class ItemsOnListView {
    private String regionName;
    private String regionCapital;
    private String location;
    private String hotelName;
    private String ratings;

    public ItemsOnListView (String regionName, String regionCapital) {
        this.regionName = regionName;
        this.regionCapital = regionCapital;
    }

    public ItemsOnListView(String hotelName, String location, String ratings) {
        this.hotelName = hotelName;
        this.location = location;
        this.ratings = ratings;
    }


    public String getRegionName() {
        return regionName;
    }

    public String getRegionCapital() {
        return regionCapital;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getLocation() {
        return location;
    }

    public String getRatings() {
        return ratings;
    }
}
