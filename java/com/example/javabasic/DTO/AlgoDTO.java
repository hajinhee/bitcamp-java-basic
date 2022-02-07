package com.example.javabasic.DTO;

/**
 * packageName: com.example.javabasic.DTO
 * fileName   : GradeDTO
 * author     : HAJINHEE
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-03   HAJINHEE    최초 생성
 */
public class AlgoDTO {
    private String name;
    private String subject1;
    private String subject2;
    private String subject3;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSubject1(){
        return subject1;
    }

    public void setSubject1(String subject1){
        this.subject1 = subject1;
    }


    public String getSubject2(){
        return subject2;
    }

    public void setSubject2(String subject2){
        this.subject2 = subject2;
    }


    public String getSubject3(){
        return subject3;
    }

    public void setSubject3(String subject3){
        this.subject3 = subject3;
    }
}
