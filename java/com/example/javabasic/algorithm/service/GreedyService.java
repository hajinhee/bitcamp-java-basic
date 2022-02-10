package com.example.javabasic.algorithm.service;

/**
 * packageName: com.example.javabasic.algorithm.service
 * fileName   : GreedyService
 * author     : HAJINHEE
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-08   HAJINHEE    최초 생성
 */
public interface GreedyService {
    int solution(int n, int[] lost, int[] reserve);
    int joyStick(String name);
    String makeNumber(String number, int k);
    int solution2(int[] people, int limit);
    int solution3(int n, int[][] costs);
    int solution4(int[][] routes);
}
