package com.example.javabasic.auth.domain;

public class CalcDTO {
    public static String TITLE = "Calc.com";
    private int num1;
    private int num2;
    private String opcode;

    public int getNum1(){
        return num1;
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }

    public String getOpcode(){
        return opcode;
    }

    public void setOpcode(String opcode){
        this.opcode = opcode;
    }

    public int getNum2(){
        return num2;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

}