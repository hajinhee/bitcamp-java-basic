package com.example.javabasic.oop.controller;

import com.example.javabasic.oop.domain.CelPhone;
import com.example.javabasic.oop.domain.GalPhone;
import com.example.javabasic.oop.domain.IPhone;
import com.example.javabasic.oop.domain.Phone;
import com.example.javabasic.oop.service.PhoneService;
import com.example.javabasic.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.javabasic.oop.controller
 * fileName   : OopController
 * author     : HAJINHEE
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-08   HAJINHEE    최초 생성
 */
public class OopController {
    public void execute(Scanner scanner) {

        while (true) {
            System.out.println("\n[MENU] \n" +
                    "0.Exit \n" +
                    "1.은닉화(Encapsulation) \n" +
                    "2.상속(Inheritance) \n" +
                    "3.추상화(Abstraction) \n" +
                    "4.다형성 Polymorphism");
            switch (scanner.next()){
                case "0" :
                    System.out.println("0.Exit");
                    return;
                case "1" :
                    System.out.println("1.은닉화(Encapsulation)");
                    break;
                case "2" :
                    System.out.println("2.상속(Inheritance) \nPOJO가 은닉화다.");
                    PhoneService phoneService = new PhoneServiceImpl();
                    Phone phone = new Phone("금성전화기", "금성전자");
                    CelPhone celPhone = new CelPhone("휴대폰", "블랙베리", "이동");
                    IPhone iPhone = new IPhone("애플");
                    GalPhone galPhone = new GalPhone("삼성");
                    System.out.println("[소메뉴]\n 0.Exit 1.Phone 2.CelPhone 3.IPhone 4.GalPhone");
                    switch (scanner.next()){
                        case "0" :
                            System.out.println("Exit"); return;
                        case "1" :
                            System.out.println("1.Phone");
                            phone.setCall("여보세요.");
                            phone.setMessage("하진희입니다.");
                            phoneService.usePhone(phone); break;
                        case "2" :
                            System.out.println("2.CelPhone");
                            celPhone.setCall("[안녕하세요.]");
                            phoneService.useCelPhone(celPhone); break;
                        case "3" :
                            System.out.println("3.IPhone");
                            iPhone.setSearch("뉴스");
                            phoneService.useIPhone(iPhone); break;
                        case  "4" :
                            System.out.println("4.GalPhone");
                            galPhone.setPay("삼성페이");
                            phoneService.useGalPhone(galPhone); break;
                        default:
                            System.out.println("Wrong Number"); break;
                    }
                    break;
                case "3" :
                    System.out.println("3.추상화(Abstraction) \n");
                    break;
                case "4" :
                    System.out.println("4.다형성 Polymorphism");
                    break;
                default :
                    System.out.println("Wrong Number");
                    break;
            }
        }
    }
}
