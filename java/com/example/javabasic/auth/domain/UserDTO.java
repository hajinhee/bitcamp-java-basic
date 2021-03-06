package com.example.javabasic.auth.domain;

public class UserDTO {
    public static String TITLE = "NAVER";
    private String id;
    private String pw;
    private String name;

    private final static UserDTO user = new UserDTO();
    private UserDTO(){}
    public static UserDTO getInstance(){return user;}


    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getPw(){
        return pw;
    }

    public void setPw(String pw){
        this.pw = pw;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    }

