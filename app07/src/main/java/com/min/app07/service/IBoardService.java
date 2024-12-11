package com.min.app07.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.min.app07.dto.BoardDto;

public interface IBoardService {
  Map<String, Object> getBoardList(HttpServletRequest request);
  BoardDto getBoardById(int boardId);
}
