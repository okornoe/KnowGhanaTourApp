package com.sourcecodeinc.knowghana;

public class ItemsOnListView {
    private String regionName;
    private String regionCapital;
    private String location;
    private String hotelName;
    private String attractionName;
    private String ratings;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public ItemsOnListView(String regionName, String regionCapital, int imageResourceId) {
        this.regionName = regionName;
        this.regionCapital = regionCapital;
        this.imageResourceId = imageResourceId;
    }

    public ItemsOnListView(String regionName, String regionCapital) {
        this.regionName = regionName;
        this.regionCapital = regionCapital;
    }

    public ItemsOnListView(String hotelName, String location, String ratings, int imageResourceId) {
        this.hotelName = hotelName;
        this.location = location;
        this.ratings = ratings;
        this.imageResourceId = imageResourceId;

    }

    public ItemsOnListView(String attractionName, int imageResourceId) {
        this.attractionName = attractionName;
        this.imageResourceId = imageResourceId;
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

    public String getAttractionName() {
        return attractionName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
