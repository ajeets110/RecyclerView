package com.example.recyclerviewexample;

public class Country
{

    private String title;
    private int flag;

    public Country(String title, int flag) {
        this.title = title;
        this.flag = flag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
