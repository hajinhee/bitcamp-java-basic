package com.example.javabasic.auth.domain;
/**
 * packageName: com.example.javabasic.grade
 * fileName   : GradeApp
 * author     : HAJINHEE
 * date       : 2022-01-26
 * desc       :
 * 사용자로부터
 * 이름 [          ]
 * 국어 [          ]
 * 영어 [          ]
 * 수학 [          ]
 * 을 차례대로 입력 받아서
 * ########## 성적표 ########
 * 이름: 홍길동
 * > 국어: 80점
 * > 영어: 79점
 * > 수학: 80점
 * 총점: 239점
 * 평균(정수): 79점
 * 합격여부: 합격(불합격)
 * #######################
 * 출력되는 프로그램을 작성
 * 단, 합격 / 불합격 기준은
 * 평균 60점 이상이면 합격
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-26    HAJINHEE     최초 생성
 */
public class GradeDTO {
    public static String GRADE_TITLE = "성적표";
    private String name;
    private int kor;
    private int eng;
    private int math;

    private final static GradeDTO grade = new GradeDTO();
    private GradeDTO(){}
    public static GradeDTO getInstance(){return grade;}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getKor(){
        return kor;
    }

    public void setKor(int kor){
        this.kor = kor;
    }

    public int getEng(){
        return eng;}

    public void setEng(int eng){
        this.eng = eng;
    }

    public int getMath(){
        return math;
    }

    public void setMath(int math){
        this.math = math;
    }
    }
