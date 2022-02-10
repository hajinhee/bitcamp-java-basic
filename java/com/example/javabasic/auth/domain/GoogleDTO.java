package com.example.javabasic.auth.domain;

/**
 * packageName: com.example.javabasic
 * fileName   : GoogleDTO
 * author     : HAJINHEE
 * date       : 2022-01-30
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-01-30   HAJINHEE    최초 생성
 */
public class GoogleDTO {
    public static String TITLE = "Google";
    private String search;

    public String getSearch(){
        return search;
    }

    public void setSearch(String search){
        this.search = search;
    }
    }
