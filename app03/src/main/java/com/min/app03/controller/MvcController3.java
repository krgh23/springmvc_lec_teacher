package com.min.app03.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController3 {

  @RequestMapping(value="/webdir3/main")
  public String main() {
    return "webdir3/main";
  }
  
  @RequestMapping(value="/webdir3/req1")
  public String req1() {
    return "webdir3/req1";
  }
  
  
  /*
   * Query String
   * Query String 이란 URL 의 ? 뒤에 추가된 파라미터를 의미합니다.
   */
  
  
  /*
   * Query String 처리하기 1
   * HttpServletRequest 활용하기
   * 모든 요청에 관한 정보는 HttpServletRequest 인터페이스가 담당합니다.
   * Query String 은 Parameter 형태로 HttpServletRequest 인터페이스 객체에 저장되어 있습니다.
   * getParameter() 또는 getParameterValues() 메소드를 이용해 Parameter 를 확인할 수 있습니다.
   * getParameter() 메소드는 String 을 반환하고, getParameterValues() 메소드는 String[] 을 반환합니다.
   */
  
  @RequestMapping(value="/webdir3/req2")
  public String req2(HttpServletRequest request) {
    String sort = request.getParameter("sort");
    int page = Integer.parseInt(request.getParameter("page"));
    System.out.println(sort + ", " + page);
    return "webdir3/req2";
  }
  
  
  
  
  
  
  
  
  
  
  
  
}
