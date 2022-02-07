package com.example.javabasic.service;

import java.util.Scanner;

/**
 * packageName: com.example.javabasic.service
 * fileName   : GameService
 * author     : HAJINHEE
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-08   HAJINHEE    최초 생성
 */
public interface GameService {
    void dice(Scanner scanner);
    void rsp(Scanner scanner);
    void getPrime(Scanner scanner);
    void leapYear(Scanner scanner);
    void numberGolf(Scanner scanner);
}
