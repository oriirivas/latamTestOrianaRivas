package com.testLatam.orianaRivas.dto;

public class PersonResponse {
    private String name;
    private int age;
    private int nextBirthdayMonths;
    private int nextBirthdayDays;
    private String poems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNextBirthdayMonths() {
        return nextBirthdayMonths;
    }

    public void setNextBirthdayMonths(int nextBirthdayMonths) {
        this.nextBirthdayMonths = nextBirthdayMonths;
    }

    public int getNextBirthdayDays() {
        return nextBirthdayDays;
    }

    public void setNextBirthdayDays(int nextBirthdayDays) {
        this.nextBirthdayDays = nextBirthdayDays;
    }

    public String getPoems() {
        return poems;
    }

    public void setPoems(String poems) {
        this.poems = poems;
    }
}
