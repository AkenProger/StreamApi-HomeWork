package com.company;

import java.util.List;
import java.util.Objects;

public class SeedlingsInformation implements Comparable {
    private String seedlingName;
    private int seedlingLifeTime;
    private SeedlingTypes seedlingTypes;
    private BirthplaceOfSeedling birthplaceOfSeedling;
    private double price;
    private List<String> comments;
    private Certificate certificate;

    public SeedlingsInformation(String seedlingName, int seedlingLifeTime, SeedlingTypes seedlingTypes, BirthplaceOfSeedling birthplaceOfSeedling, double price,List<String> comments,Certificate certificate) {
        this.seedlingName = seedlingName;
        this.seedlingLifeTime = seedlingLifeTime;
        this.seedlingTypes = seedlingTypes;
        this.birthplaceOfSeedling = birthplaceOfSeedling;
        this.price = price;
        this.comments = comments;
        this.certificate = certificate;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeedlingsInformation that = (SeedlingsInformation) o;
        return seedlingLifeTime == that.seedlingLifeTime &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(seedlingName, that.seedlingName) &&
                seedlingTypes == that.seedlingTypes &&
                birthplaceOfSeedling == that.birthplaceOfSeedling &&
                Objects.equals(comments, that.comments);
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(seedlingName, seedlingLifeTime, seedlingTypes, birthplaceOfSeedling, price, comments);
    }

    @Override
    public String toString() {
        return "SeedlingsInformation{" +
                "seedlingName='" + seedlingName + '\'' +
                ", seedlingLifeTime=" + seedlingLifeTime +
                ", seedlingTypes=" + seedlingTypes +
                ", birthplaceOfSeedling=" + birthplaceOfSeedling +
                ", price=" + price +
                ", comments=" + comments +
                ", certificate=" + certificate +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
