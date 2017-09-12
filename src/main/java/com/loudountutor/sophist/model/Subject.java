package com.loudountutor.sophist.model;

public enum Subject {

    BIOLOGY("Biology"),
    CHESS("Chess"),
    CHEMISTRY("Chemistry"),
    ENGLISH("English"),
    MATH("Math"),
    PHYSICS("Physics"),
    PROGRAMMING("Programming"),
    SCIENCE("Science");

    private String subject;
    private double rating = 0;

    Subject(String subject){
        this.subject = subject;
    }

    public Subject setRating(double rating){
        this.rating = rating;
        return this;
    }

    public String getName(){
        return subject;
    }

    public double getRating(){
        return rating;
    }

    @Override
    public String toString(){
        return subject + " " + rating;
    }
}
