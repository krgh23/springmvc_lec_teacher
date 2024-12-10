package com.min.app07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.min.app07.dao.IBoardDao;

/*
 * IBoardDao 타입의 구현체 BoardDaoImpl bean은 @Repository를 이용해 생성하였으므로 Component Scan이 정의되어 있는 servlet-context.xml 파일이 필요합니다.
 * BoardDaoImpl 클래스의 필드인 SqlSessionTemplate bean은 root-context.xml 파일에 <bean> 태그를 이용해서 생성하였습니다. 
 */

@SpringJUnitConfig(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"
                            , "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})

class BoardDaoTest {

  // Spring Container에 저장된 IBoardDao 타입의 bean 가져오기
  @Autowired
  private IBoardDao boardDao;
  
  @Test
  void 목록테스트() {
    
    // 두 번째 항목의 contents="대방어, 광어, 우럭 매운탕" 인지 테스트
    // assertEquals(true, boardDao.selectBoardList().get(1).getContents().startsWith("대방어"));
    
    // 두 번째 항목의 usr_name="james" 인지 테스트
    String sort = "ASC";
    assertEquals("james", boardDao.selectBoardList(sort).get(1).getUserDto().getUsrName());
    
  }
  
  @Test
  void 상세테스트() {
    
    // boardId가 3인 항목의 usr_name="helena" 인지 테스트
    int boardId = 3;
    assertEquals("helena", boardDao.selectBoardById(boardId).getUserDto().getUsrName());
    
  }

  @Test
  void 검색테스트() {
    
    // title에 10이 포함되는 항목이 조회되는지 테스트
    // String query = "10";
    // assertEquals("20241210_식단", boardDao.selectBoardSearchList(query).get(0).getTitle());
    
    // title에 10이 포함되는 항목이 조회되는지 테스트
    Map<String, Object> map = Map.of("column", "title", "query", "10");
    assertEquals("20241210_식단", boardDao.selectBoardSearchList(map).get(0).getTitle());
    
  }
  
  @Test
  void 기간테스트() {
    
    String beginDt = "2024-12-05";
    String endDt = "2024-12-06";
    Map<String, Object> map = Map.of("beginDt", beginDt, "endDt", endDt);
    assertEquals(2, boardDao.selectBoardPeriodList(map).size());
    
  }
  
  
  
  
  
  
  
}
