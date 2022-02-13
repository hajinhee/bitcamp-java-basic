package com.example.javabasic.quiz.controller;

import com.example.javabasic.quiz.service.*;

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
public class QuizController {
    public void execute(Scanner scanner) {
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();
        Feb10Service feb10Service = new Feb10ServiceImpl();
        while (true) {
            System.out.println("\n[서브메뉴]\n" +
                    "0.Exit\n" +
                    "1.2월 6일\n" +
                    "2.2월 7일\n" +
                    "3.2월 8일\n" +
                    "4.2월 10일\n");
            switch (scanner.next()) {
                case "0":
                    System.out.println("Exit");
                    return;
                case "1":
                    String[] arr = {"김지혜", "최은아", "심민혜", "권솔이", "하진희",
                                     "Sort", "Stack", "Hash", "Heap", "Greedy",
                                     "DFS", "Queue", "DP", "Brute Force", "Bin Search",
                                      "BFS", "Graph"};
                    System.out.println("\n[소메뉴] \n" +
                            "0.종료 \n" +
                            "1.팀별 과제를 출력하기 \n" +
                            "2.팀장이 맡은 과제만 출력하기 \n" +
                            "3.큐를 담당한 사람을 출력하기 \n" +
                            "4.팀원별 과제 수 출력하기 \n");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("종료");
                            return;
                        case "1":
                            System.out.println("1.팀별 과제");
                            feb06Service.quiz1(arr);
                            break;
                        case "2":
                            System.out.println("2.팀장이 맡은 과제");
                            feb06Service.quiz2(arr);
                            break;
                        case "3":
                            System.out.println("3.큐를 담당한 사람");
                            feb06Service.quiz3(arr);
                            break;
                        case "4":
                            System.out.println("4.팀원별 과제 수");
                            feb06Service.quiz4(arr);
                            break;
                        default:
                            System.out.println("Wrong Number");
                            break;
                    }
                    break;
                case "2":
                    System.out.println("\n[소메뉴] \n" +
                            "0. 종료 \n" +
                            "1. 주사위 \n" +
                            "2. 가위바위보 \n" +
                            "3. 소수구하기 \n" +
                            "4. 윤년/평년 \n" +
                            "5. 숫자골프 \n");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("종료");
                            return;
                        case "1":
                            System.out.println("주사위");
                            feb07Service.dice(scanner);
                            break;
                        case "2":
                            System.out.println("가위바위보\n 숫자를 입력해주세요. 1.주먹 2.가위 3.보");
                            feb07Service.rsp(scanner);
                            break;
                        case "3":
                            System.out.println("소수구하기");
                            feb07Service.getPrime(scanner);
                            break;
                        case "4":
                            System.out.println("윤년/평년");
                            feb07Service.leapYear(scanner);
                            break;
                        case "5":
                            System.out.println("5.숫자골프");
                            feb07Service.numberGolf(scanner);
                            break;
                        default:
                            System.out.println("Wrong Number");
                            break;
                    }break;
                case "3":
                    System.out.println("\n[소메뉴]\n" +
                            "0.종료 \n" +
                            "1.로또 \n" +
                            "2.야구 \n" +
                            "3.좌석예약 \n" +
                            "4.은행입출금 \n" +
                            "5.구구단 \n");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("종료");
                            return;
                        case "1":
                            System.out.println("1.로또");
                            feb08Service.lotto(scanner);
                            break;
                        case "2":
                            System.out.println("2.야구");
                            feb08Service.baseball(scanner);
                            break;
                        case "3":
                            System.out.println("3.좌석예약");
                            feb08Service.booking(scanner);
                            break;
                        case "4":
                            System.out.println("4.은행입출금");
                            feb08Service.bank(scanner);
                            break;
                        case "5":
                            System.out.println("5.구구단");
                            feb08Service.gugudan(scanner);
                            break;
                        default:
                            System.out.println("Wrong Number");
                            break;
                    }
                    break;
                case "4" :
                    System.out.println("\n[소메뉴] \n" +
                            "0.종료 \n" +
                            "1.bubble sort \n" +
                            "2.insertion sort \n" +
                            "3.selection sort \n" +
                            "4.quick sort \n" +
                            "5.merge sort \n");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("0.Exit");
                            return;
                        case "1":
                            System.out.println("1.bubble sort\n");
                            feb10Service.bubbleSort();
                            break;
                        case "2":
                            System.out.println("2.insertion sort\n");
                            feb10Service.insertionSort();
                            break;
                        case "3":
                            System.out.println("3.selection sort\n");
                            feb10Service.selectionSort();
                            break;
                        case "4":
                            System.out.println("4.");
                            break;
                        case "5":
                            System.out.println("5.");
                            break;
                        default:
                            System.out.println("Wrong Number");
                            break;
                    }

                    break;
            }
        }
    }
}