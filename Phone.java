package com.company;

public class Phone {
    public java.lang.System System;
    private long id;
    private String name;
    private String second_name;
    private String father_name;
    private int number_score;
    private int time_local_calls;
    private int time_abroad_calls;

    public long getId() {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public int getNumber_score() {
        return number_score;
    }

    public void setNumber_score(int number_score) {
        this.number_score = number_score;
    }

    public int getTime_abroad_calls() {
        return time_abroad_calls;
    }

    public void setTime_abroad_calls(int time_abroad_calls) {
        this.time_abroad_calls = time_abroad_calls;
    }

    public int getTime_local_calls() {
        return time_local_calls;
    }

    public void setTime_local_calls(int time_local_calls) {
        this.time_local_calls = time_local_calls;
    }
}
