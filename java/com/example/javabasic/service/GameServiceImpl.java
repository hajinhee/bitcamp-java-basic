package com.example.javabasic.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.javabasic.service
 * fileName   : GameServiceImpl
 * author     : HAJINHEE
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-08   HAJINHEE    최초 생성
 */
public class GameServiceImpl implements GameService{
    @Override
    public void dice(Scanner scanner) {

    }

    @Override
    public void rsp(Scanner scanner) {
        Random random = new Random();
        int com = random.nextInt(3)+1;
        int user = scanner.nextInt();
        int score = user-com;
        String[] str = { "", "주먹", "가위", "보"};
        String res = "";

        if(user>3){
            System.out.println("1~3까지의 숫자를 입력해주세요."); return;
        }else {
            if(score==0){
                res = "무승부입니다.";
            }else if(score==-1 || score==2){
                res = "이겼습니다.";
            }else {
                res = "졌습니다.";}
        }System.out.println("컴퓨터:" +str[com]+ " 유저:" +str[user]+ "\n" +res);
    }

    @Override
    public void getPrime(Scanner scanner) {

    }

    @Override
    public void leapYear(Scanner scanner) {

    }

    @Override
    public void numberGolf(Scanner scanner) {

    }
}
