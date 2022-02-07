package com.example.javabasic.controller;

/**
 * packageName: com.example.javabasic.controller
 * fileName   : TempController
 * author     : HAJINHEE
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-03   HAJINHEE    최초 생성
 */
public class TempController {
    public static void main(String[] args) {
        String[] arr = {"김지혜",   "최은아",   "권솔이",    "심민혜",    "하진희",
                         "BFS",   "Stack",    "Heep",     "Hash",    "Greedy",
                         "DFS",   "Queue", "Brute Force",  "DP",  "Binary Search",
                        "Sort",   "Graph",   "",  "",  ""};


        System.out.println("Q1. 팀별 과제를 출력하세요 ");
        String sub = "";
        for(int i=0; i<arr.length; i++){
            if(i%5==0){
                sub += "\n";
            }
            sub += i+ ". " +arr[i]+ "\t";
        }
        System.out.println(sub);


        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        String leader = "";
        String l = "하진희";
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(l)){
            for(int j=0; j<4; j++){
                leader += arr[i+j*5]+ ",";
            }
        }if(i==16){break;}
        }System.out.println(leader);


        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 권혜민 ");
        String qManager = "";
        String subject = "";
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("Queue")){
                qManager += arr[i]+ "(을)를 담당한 사람: " +arr[i%5];
            }
        }
        System.out.println(qManager);


    }
}