package com.wib.garcipro;

public class title {
    String Title;
    String Desc;

    public title() {
    }

    @Override
    public String toString() {
        return "title{" +
                "Title='" + Title + '\'' +
                ", Desc='" + Desc + '\'' +
                '}';
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
