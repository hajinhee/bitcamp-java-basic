package com.example.javabasic.oop.domain;

/**
 * packageName: com.example.javabasic.oop.domain
 * fileName   : Phone
 * author     : HAJINHEE
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-09   HAJINHEE    최초 생성
 */
public class Phone {
    protected String kind;
    protected String company;
    protected String call;
    protected String message;

    public Phone(String kind, String company){
        this.kind = kind;
        this.company = company;
    }

    public String getKind() {
        return kind;
    }


    public String getCompany() {
        return company;
    }


    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "집전화{" +
                "폰종류='" + kind + '\'' +
                ", 제조사='" + company + '\'' +
                ", 통화내역='" + call + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
