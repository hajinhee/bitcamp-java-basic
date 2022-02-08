package com.example.javabasic.oop.controller;

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
        PhoneService phoneService = new PhoneServiceImpl();
        while (true) {
            System.out.println("\n[MENU] \n" +
                    "0.Exit \n" +
                    "1.집전화 \n" +
                    "2.휴대폰 \n" +
                    "3.아이폰 \n" +
                    "4.갤럭시노트");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit");
                    return;
                case "1" :
                    System.out.println("집전화");
                    phoneService.usePhone(scanner);
                    break;
                case "2" :
                    System.out.println("휴대폰");
                    phoneService.useCelPhone(scanner);
                    break;
                case "3" :
                    System.out.println("아이폰");
                    phoneService.useIPhone(scanner);
                    break;
                case "4" :
                    System.out.println("갤럭시노트");
                    phoneService.useGalPhone(scanner);
                    break;
                default :
                    System.out.println("Wrong Number");
                    break;
            }
        }
    }
}
