package com.example.javabasic;

import com.example.javabasic.algorithm.controller.AlgorithmController;
import com.example.javabasic.auth.controller.AuthController;
import com.example.javabasic.oop.controller.OopController;
import com.example.javabasic.quiz.controller.QuizController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavabasicApplication {
	public static void main(String[] args) {
		SpringApplication.run(JavabasicApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		AuthController authController = new AuthController();
		QuizController quizController = new QuizController();
		OopController oopController = new OopController();
		AlgorithmController algorithmController = new AlgorithmController();

		while (true){
			System.out.println("\n[메인메뉴]\n" +
					"0.Exit\n" +
					"1.Auth\n" +
					"2.OOP\n" +
					"3.Quiz\n" +
					"4.Algorithm");
			switch (scanner.next()) {
				case "0" :
					System.out.println("Exit"); return;
				case "1" :
					System.out.println("Auth");
					authController.execute(scanner);
					break;
				case "2" :
					System.out.println("OOP");
					oopController.execute(scanner);
					break;
				case "3" :
					System.out.println("Quiz");
					quizController.execute(scanner);
					break;
				case "4" :
					System.out.println("Algorithm");
					algorithmController.execute(scanner);
					break;
				default :
					System.out.println("Wrong Number");
					break;
			}
		}
	}
}
