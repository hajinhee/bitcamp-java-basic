package com.example.javabasic.oop.domain;

/**
 * packageName: com.example.javabasic.oop.domain
 * fileName   : GalPhone
 * author     : HAJINHEE
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-09   HAJINHEE    최초 생성
 */
public class GalPhone extends IPhone{
    public final static String KIND = "갤럭시";
    protected  String pay;

    public GalPhone(String company) {
        super(company);
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("%s에서 만든 %s 제품을 사용해서 %s 로 결제한다.",
                super.getCompany(), KIND, pay);
    }
}
