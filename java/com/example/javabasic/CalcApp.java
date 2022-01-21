package com.example.javabasic;

public class CalcApp {
    public static String webSite = "Calc.com";
    private int num1;
    private int num2;
    private String opcode;

    public String calc(int paramNum1, String paramOpcode, int parmaNum2){
        num1 = paramNum1;
        opcode = paramOpcode;
        num2 = parmaNum2;
        int result = num1 + num2;
        return num1+ " " +opcode+ " " +num2+ " = " +result;
    }
}
