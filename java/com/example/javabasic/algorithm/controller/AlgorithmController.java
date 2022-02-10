package com.example.javabasic.algorithm.controller;

import com.example.javabasic.algorithm.service.BinService;
import com.example.javabasic.algorithm.service.BinServiceImpl;
import com.example.javabasic.algorithm.service.GreedyService;
import com.example.javabasic.algorithm.service.GreedyServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.javabasic.algorithm.controller
 * fileName   : AlgorithmController
 * author     : HAJINHEE
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-08   HAJINHEE    최초 생성
 */
public class AlgorithmController {
    public void execute(Scanner scanner) {
        GreedyService greedyService = new GreedyServiceImpl();
        BinService binService = new BinServiceImpl();
        while (true){
            System.out.println("[담당] 0.종료 1.김지혜 2.최은아 3.권솔이 4.심민혜 5.하진희");
            switch(scanner.next()){
                case "0" :
                    System.out.println("종료"); return;
                case "1" :
                    System.out.println("0.Exit 1.Sort 2.DFS 3.BFS");
                    switch (scanner.next()){
                        case "0" :
                            System.out.println("Exit"); return;
                        case "1" :
                            /*int[] array = new int[10];
                            int[][] commands = new int[10][10];
                            sortService.kNumber(array, commands);
                            int[] numbers = new int[10];
                            sortService.lNumber(numbers);
                            int[] citations = new int[10];
                            sortService.hIndex(citations); break;*/
                        case "2" : break;
                        case "3" : break;
                    } break;
                case "2" :
                    System.out.println("0.Exit 1.Stack 2.Queue 3.Graph");
                    switch (scanner.next()){
                        case "0" :
                            System.out.println("Exit"); return;
                        case  "1" :
                    }
                case "3" :
                    System.out.println("권솔이");break;
                case "4" :
                    System.out.println("심민혜"); break;
                case "5" :
                    System.out.println("0.Exit 1.Greedy 2.Binary Search");
                    switch (scanner.next()){
                        case "0" :
                            System.out.println("Exit"); return;
                        case "1" :
                            int n =0;
                            int[] lost = new int[10];
                            int[] reserve = new int[10];
                            greedyService.solution(n, lost, reserve);
                            String name = "";
                            greedyService.joyStick(name);
                            String number = "";
                            int k =0;
                            greedyService.makeNumber(number, k);
                            int[] people = new int[10];
                            int limit =0;
                            greedyService.solution2(people, limit);
                            int n1 = 0;
                            int[][] costs = new int[10][10];
                            greedyService.solution3(n, costs);
                            int[][] routes = new int[10][10];
                            greedyService.solution4(routes); break;
                        case "2" :
                            int n2 = 0;
                            int[] times = new int[10];
                            binService.immigration(n2, times);
                            int distance = 0;
                            int[] rocks = new int[10];
                            int n3 = 0;
                            binService.stepStones(distance, rocks, n3); break;
                    } default: break;
            }

        }
    }}
