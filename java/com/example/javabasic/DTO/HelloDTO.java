package com.example.javabasic.DTO;

public class HelloDTO {
    public static String TITLE = "HELLO";
    private String id;
    private int pw;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPw(){
        return pw;
    }

    public void setPw(int pw){
        this.pw = pw;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
    }
