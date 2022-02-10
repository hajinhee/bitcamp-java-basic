package com.example.javabasic.oop.domain;

/**
 * packageName: com.example.javabasic.oop.domain
 * fileName   : IPhone
 * author     : HAJINHEE
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-09   HAJINHEE    최초 생성
 */
public class IPhone extends CelPhone{
    public final static String KIND = "아이폰";
    protected String search;

    public IPhone(String company) {
        super(KIND, company, "이동");
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return String.format("%s에서 만든 %s을 사용해서 %s중에 %s를 검색한다.",
                super.getCompany(), KIND, super.getMove(), search);
    }
}
