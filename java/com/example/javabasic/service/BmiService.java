package com.example.javabasic.service;

import com.example.javabasic.DTO.BmiDTO;

/**
 * packageName: com.example.javabasic
 * fileName   : BmiService
 * author     : HAJINHEE
 * date       : 2022-01-30
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-01-30   HAJINHEE    최초 생성
 */
public class BmiService {
    public String execute(BmiDTO bmi){
        return String.format("%s님 키 %.2fcm 몸무게 %.2fkg 정상입니다.",
                bmi.getName(), bmi.getHeight(), bmi.getWeight());
    }
}
