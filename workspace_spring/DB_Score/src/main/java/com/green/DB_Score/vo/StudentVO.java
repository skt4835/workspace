package com.green.DB_Score.vo;

import lombok.Data;

@Data
public class StudentVO {
    private int StuNum;
    private String StuName;
    private int KorScore;
    private int EngScore;
    private String Intro;
}
