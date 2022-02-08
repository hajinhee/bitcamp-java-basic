package com.example.javabasic.service;

import com.example.javabasic.auth.domain.GoogleDTO;

/**
 * packageName: com.example.javabasic
 * fileName   : GoogleService
 * author     : HAJINHEE
 * date       : 2022-01-30
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-01-30   HAJINHEE    최초 생성
 */
public class GoogleService {
    public String execute(GoogleDTO google){
        return String.format("%s을(를) 검색한 결과입니다.", google.getSearch());
    }
}
