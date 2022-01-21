package com.example.javabasic;

public class LoginApp {
    public static String webSite = "Naver";
    private String id;
    private String pw;
    private String name;

    public String login(String paramId, String paramPw, String paramName){
        id = paramId;
        pw = paramPw;
        name = paramName;

        return "ID: " +id+ " PW: " +pw+ " NAME: " +name;
    }
}
