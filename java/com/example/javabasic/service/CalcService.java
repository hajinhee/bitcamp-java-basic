package com.example.javabasic.service;

import com.example.javabasic.DTO.CalcDTO;

import java.util.Scanner;

public class CalcService {
    public String execute(CalcDTO calc){
        int res =0;

        switch (calc.getOpcode()) {
            case "+": res = calc.getNum1()+calc.getNum2(); break;
            case "-": res = calc.getNum1()-calc.getNum2(); break;
            case "*": res = calc.getNum1()*calc.getNum2(); break;
            case "/": res = calc.getNum1()/calc.getNum2(); break;
        }

        return String.format("%d %s %d = %d", calc.getNum1(), calc.getOpcode(),
                calc.getNum2(), res);

    }
    }
