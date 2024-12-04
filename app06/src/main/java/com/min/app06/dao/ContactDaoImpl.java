package com.min.app06.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.app06.dto.ContactDto;

/*
 * JDBC
 * 1. Java DataBase Connection
 * 2. Java에서 DataBase에 접근할 수 있도록 해 주는 Programming API
 * 3. WebApplication - JDBC Interface - MySQL JDBC Driver - MySQL DBMS
 *        app06      - ContactDaoImpl - mysql-connector-j - MySQL Server
 */

/*
 * DAO
 * 1. DataBase Access Object
 * 2. 데이터베이스에 접속해서 DB 처리를 수행하는 객체를 의미합니다.
 * 3. 기본적으로 Singleton Pattern으로 생성합니다. (스프링은 Spring Container에 bean을 만들 때 기본적으로 Singleton 으로 만듭니다.)
 */

@Repository  // DAO를 구현한 클래스라는 의미를 가진 @Component입니다. (Spring Container에 bean으로 등록됩니다.)
             // Persistence Layer(영속 계층)에서 동작합니다.
             // 데이터 액세스 예외 처리(Rollback) 기능을 가집니다.
public class ContactDaoImpl implements IContactDao {

  @Autowired  // Spring Container에서 JdbcConnection 클래스 타입의 bean을 가져와서 필드에 넣습니다.(필드 주입)
  private JdbcConnection jdbcConnection;
  
  private Connection conn;
  private PreparedStatement ps;
  private ResultSet rs;
  
  @Override
  public List<ContactDto> getContactList() {
    conn = jdbcConnection.getConnection();
    jdbcConnection.close(conn, ps, rs);
    return null;
  }

  @Override
  public ContactDto getContactById(int contact_id) {
    conn = jdbcConnection.getConnection();
    jdbcConnection.close(conn, ps, rs);
    return null;
  }

  @Override
  public int getContactCount() {
    conn = jdbcConnection.getConnection();
    jdbcConnection.close(conn, ps, rs);
    return 0;
  }

  @Override
  public int register(ContactDto contactDto) {
    conn = jdbcConnection.getConnection();
    jdbcConnection.close(conn, ps, rs);
    return 0;
  }

  @Override
  public int modify(ContactDto contactDto) {
    conn = jdbcConnection.getConnection();
    jdbcConnection.close(conn, ps, rs);
    return 0;
  }

  @Override
  public int remove(int contact_id) {
    conn = jdbcConnection.getConnection();
    jdbcConnection.close(conn, ps, rs);
    return 0;
  }

}
