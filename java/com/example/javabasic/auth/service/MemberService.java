package com.example.javabasic.auth.service;

import com.example.javabasic.auth.domain.*;

/**
 * packageName: com.example.javabasic.auth.service
 * fileName   : MemberService
 * author     : HAJINHEE
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-08   HAJINHEE    최초 생성
 */
public interface MemberService {
    String execute(CalcDTO calc);
    String execute(BmiDTO bmi);
    String execute(GoogleDTO google);
    String execute(HelloDTO hello);
    String execute(LoginDTO login);
}
