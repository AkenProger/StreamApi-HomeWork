package com.company;

import java.util.List;

public class SeedlingsInformation {
    private String seedlingName;
    private int seedlingLifeTime;
    private SeedlingTypes seedlingTypes;
    private BirthplaceOfSeedling birthplaceOfSeedling;
    private double price;
    private List<String> comments;

    public SeedlingsInformation(String seedlingName, int seedlingLifeTime, SeedlingTypes seedlingTypes, BirthplaceOfSeedling birthplaceOfSeedling, double price,List<String> comments) {
        this.seedlingName = seedlingName;
        this.seedlingLifeTime = seedlingLifeTime;
        this.seedlingTypes = seedlingTypes;
        this.birthplaceOfSeedling = birthplaceOfSeedling;
        this.price = price;
        this.comments = comments;
    }

    public String getSeedlingName() {
        return seedlingName;
    }

    public void setSeedlingName(String seedlingName) {
        this.seedlingName = seedlingName;
    }

    public int getSeedlingLifeTime() {
        return seedlingLifeTime;
    }

    public void setSeedlingLifeTime(int seedlingLifeTime) {
        this.seedlingLifeTime = seedlingLifeTime;
    }

    public SeedlingTypes getSeedlingTypes() {
        return seedlingTypes;
    }

    public void setSeedlingTypes(SeedlingTypes seedlingTypes) {
        this.seedlingTypes = seedlingTypes;
    }

    public BirthplaceOfSeedling getBirthplaceOfSeedling() {
        return birthplaceOfSeedling;
    }

    public void setBirthplaceOfSeedling(BirthplaceOfSeedling birthplaceOfSeedling) {
        this.birthplaceOfSeedling = birthplaceOfSeedling;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "SeedlingsInformation{" +
                "seedlingName='" + seedlingName + '\'' +
                ", seedlingLifeTime=" + seedlingLifeTime +
                ", seedlingTypes=" + seedlingTypes +
                ", birthplaceOfSeedling=" + birthplaceOfSeedling +
                ", price=" + price +
                '}';
    }
}
