package com.example.javabasic.DTO;

/**
 * packageName: com.example.javabasic
 * fileName   : BmiDTO
 * author     : HAJINHEE
 * date       : 2022-01-30
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-01-30   HAJINHEE    최초 생성
 */
public class BmiDTO {
    public static String TITLE = "BMI";
    private String name;
    private double height;
    private double weight;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}
