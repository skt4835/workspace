package com.green.DataPractice.vo;

import java.util.Arrays;

public class ScoreVO {
    private String name;
    private int year;
    private String[] tel;
    private String gender;
    private int korScore;
    private int mathScore;
    private int engScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getTel() {
        return tel;
    }

    public void setTel(String[] tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    @Override
    public String toString() {
        return "ScoreVO{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", tel=" + Arrays.toString(tel) +
                ", gender='" + gender + '\'' +
                ", korScore=" + korScore +
                ", mathScore=" + mathScore +
                ", engScore=" + engScore +
                '}';
    }
}
