package com.green.DataPractice.vo;

import java.util.Arrays;

public class OrderVO {
    private String menu;
    private int count;
    private String[] sauce;
    private String text;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String[] getSauce() {
        return sauce;
    }

    public void setSauce(String[] sauce) {
        this.sauce = sauce;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "menu='" + menu + '\'' +
                ", count='" + count + '\'' +
                ", sauce=" + Arrays.toString(sauce) +
                ", text='" + text + '\'' +
                '}';
    }
}
