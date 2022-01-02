package com.company;

import java.util.ArrayList;

public class Question {
    private String name;
    private ArrayList<Answers> answers;
    private int points;
    private int i = 0;

    public Question(String name, ArrayList<Answers> answers, int points) {
        this.name = name;
        this.answers = answers;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answers> answers) {
        this.answers = answers;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return name;
    }

}
