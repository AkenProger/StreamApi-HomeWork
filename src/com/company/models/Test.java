package com.company.models;

import java.util.Arrays;

public class Test {
    private int id;
    private String testName;
    private Questions[] questions;
    private String testType;
    private String createDate;


    public Test(int id, Questions[] questions, String testType, String createDate, String testName) {
        this.id = id;
        this.questions = questions;
        this.testType = testType;
        this.createDate = createDate;
        this.testName = testName;
    }

    public Test() {

    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Questions[] getQuestions() {
        return questions;
    }

    public void setQuestions(Questions[] questions) {
        this.questions = questions;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", testName='" + testName + '\'' +
                ", questions=" + Arrays.toString(questions) +
                ", testType='" + testType + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
