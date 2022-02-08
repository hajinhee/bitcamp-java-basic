package com.example.javabasic.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.javabasic.quiz.service
 * fileName   : Feb08ServiceImpl
 * author     : HAJINHEE
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-08   HAJINHEE    최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{

    @Override
    public void lotto(Scanner scanner) {
        int[] comNumbers = new int[6];
        int[] userNumbers = new int[6];
        int count = 0;

        System.out.println("1~45까지의 숫자 6개를 입력하세요.");
        for (int i=0; i<userNumbers.length; i++) {
            userNumbers[i] = scanner.nextInt();
        }
        System.out.println("추첨번호");
        for (int i=0; i<comNumbers.length; i++) {
            comNumbers[i] = (int)(Math.random()*45)+1;
            System.out.print("[" +comNumbers[i]+ "] ");
        }
        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                if (comNumbers[i]==userNumbers[j]) {
                    count++;
                }
            }
        }
        switch (count) {
            case 6:
                System.out.print(" 1등에 당첨되었습니다.");
                break;
            case 5:
                System.out.print(" 2등에 당첨되었습니다.");
                break;
            case 4:
                System.out.print(" 3등에 당첨되었습니다.");
                break;
            default:
                System.out.print(" 당첨되지 않았습니다."); break;
        }
    }



    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {

    }
}
