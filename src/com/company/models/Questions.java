package com.company.models;

import java.util.Arrays;

public class Questions {
    int id;
    String question;
    Options[] options;


    public Questions(int id, String question, Options[] options) {
        this.id = id;
        this.question = question;
        this.options = options;
    }

    public Questions() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {

        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Options getOptions() {
        for (Options o : options)
            return o;
        return null;
    }

    public void setOptions(Options[] options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", options=" + Arrays.toString(options) +
                '}';
    }
}
