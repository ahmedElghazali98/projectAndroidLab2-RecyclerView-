package com.example.mc_as2_20161776_recyclerview;

public class student {
    String id;
    String name;
    String level;
    float avg ;

    public student(String id, String name, String level, float avg) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.avg = avg;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public float getAvg() {
        return avg;
    }
}
