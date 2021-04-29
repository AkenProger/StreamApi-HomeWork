package com.company.models;

public class Options {
    int id;
    String option;
    int key;

    public Options(int id, String option, int key) {
        this.id = id;
        this.option = option;
        this.key = key;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Options{" +
                "id=" + id +
                ", option='" + option + '\'' +
                ", key=" + key +
                '}';
    }
}
