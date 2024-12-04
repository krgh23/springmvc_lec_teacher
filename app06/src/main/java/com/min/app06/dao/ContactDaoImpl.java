package com.min.app06.dao;

import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.min.app06.dto.ContactDto;

/*
 * JDBC
 * 1. Java DataBase Connection
 * 2. Java에서 DataBase에 접근할 수 있도록 해 주는 Programming API
 * 3. WebApplication - JDBC Interface - MySQL JDBC Driver - MySQL DBMS
 *        app06      - ContactDaoImpl - mysql-connector-j - MySQL Server
 */


public class ContactDaoImpl implements IContactDao {

  @Autowired  // Spring Container에서 JdbcConnection 클래스 타입의 bean을 가져와서 필드에 넣습니다.(필드 주입)
  private JdbcConnection jdbcConnection;
  
  @Override
  public List<ContactDto> getContactList() {
    Connection conn = jdbcConnection.getConnection();
    jdbcConnection.close(conn, null, null);
    return null;
  }

  @Override
  public ContactDto getContactById(int contact_id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getContactCount() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int register(ContactDto contactDto) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int modify(ContactDto contactDto) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int remove(int contact_id) {
    // TODO Auto-generated method stub
    return 0;
  }

}
