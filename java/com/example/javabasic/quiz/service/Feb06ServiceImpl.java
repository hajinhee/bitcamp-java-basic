package com.example.javabasic.quiz.service;

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
public class Feb06ServiceImpl implements Feb06Service{

    @Override
    public void quiz1(String[] arr) {
        System.out.println("Q1. 팀별 과제를 출력하세요 ");
        String sub = "";
        for(int i=0; i<arr.length; i++){
            if(i%5==0){
                System.out.print("\n");
            }
            System.out.print(i+ ". " +arr[i]+ "\t");
        }
    }

    @Override
    public void quiz2(String[] arr) {
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        String leader = "";
        String l = "하진희";
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(l)){
                for(int j=0; j<3; j++){
                    leader += arr[i+j*5]+ ",";
                }
            }if(i==16){break;}
        }System.out.println(leader);
    }

    @Override
    public void quiz3(String[] arr) {
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

    @Override
    public void quiz4(String[] arr) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요. 예) 김지혜(3개), 최은아(3개), 심민혜(2개), 권솔이(2개), 하진희(2개)");
        int[] array = new int[5];  //과목 수가 들어갈 공간 만들기
        String res = "";
        for (int i = 5; i < arr.length; i++) {
            int a = i % 5;
            for (int j = 0; j < 5; j++) {
                if (a == j) {
                    array[j]++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] + "(" + array[i] + "개)";
            if (i < 4) {
                res += ", ";
            }
        }
        System.out.println(res);
    }

}