package com.example.javabasic.oop.service;

import com.example.javabasic.oop.domain.CelPhone;
import com.example.javabasic.oop.domain.GalPhone;
import com.example.javabasic.oop.domain.IPhone;
import com.example.javabasic.oop.domain.Phone;

import java.util.Scanner;

/**
 * packageName: com.example.javabasic.oop.service
 * fileName   : MemberServiceImpl
 * author     : HAJINHEE
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-08   HAJINHEE    최초 생성
 */
public class PhoneServiceImpl implements PhoneService{
    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCelPhone(CelPhone celPhone) {
        System.out.println(celPhone.toString());
    }

    @Override
    public void useIPhone(IPhone iPhone) {
        System.out.println(iPhone.toString());
    }

    @Override
    public void useGalPhone(GalPhone galPhone) {
        System.out.println(galPhone.toString());
    }
}
