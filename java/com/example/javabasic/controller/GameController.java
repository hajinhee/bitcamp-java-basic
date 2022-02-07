package com.example.javabasic.controller;

import com.example.javabasic.service.GameService;
import com.example.javabasic.service.GameServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.javabasic.controller
 * fileName   : GameController
 * author     : HAJINHEE
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-08   HAJINHEE    최초 생성
 */
public class GameController{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameService service = new GameServiceImpl();
        String res = "";
        while (true){
            System.out.println("메뉴선택 \n 0.Exit 1.dice 2.rsp 3.getPrime 4.leapYear 5.numberGolf");
            switch (scanner.next()){
                case "0" :
                    System.out.println("exit"); return;
                case "1" : res = "dice";
                    break;
                case "2" :
                    System.out.println("숫자를 입력하세요.\n1.주먹 2.가위 3.보");;
                    service.rsp(scanner);
                    break;
                case "3" : res = "getPrime";
                    break;
                case "4" : res = "leapYear";
                    break;
                case "5" : res = "numberGolf";
                    break;
                default: break;
            }System.out.println(res);
        }
    }
}
