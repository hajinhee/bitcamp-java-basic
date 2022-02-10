package com.example.javabasic.oop.service;

import com.example.javabasic.auth.domain.CalcDTO;
import com.example.javabasic.oop.domain.CelPhone;
import com.example.javabasic.oop.domain.GalPhone;
import com.example.javabasic.oop.domain.IPhone;
import com.example.javabasic.oop.domain.Phone;

import java.util.Scanner;

/**
 * packageName: com.example.javabasic.oop.service
 * fileName   : MemberService
 * author     : HAJINHEE
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-08   HAJINHEE    최초 생성
 */
public interface PhoneService {
    void usePhone(Phone phone);
    void useCelPhone(CelPhone celPhone);
    void useIPhone(IPhone iPhone);
    void useGalPhone(GalPhone galPhone);
}
