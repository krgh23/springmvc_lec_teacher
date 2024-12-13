package com.min.app09.dao;

import java.util.List;

import com.min.app09.dto.AttachDto;
import com.min.app09.dto.NoticeDto;

public interface INoticeDao {
  List<NoticeDto> selectNoticeList();
  NoticeDto selectNoticeById(int noticeId);
  List<AttachDto> selectAttachListByNoticeId(int noticeId);
  int insertNotice(NoticeDto noticeDto);
  int insertAttach(AttachDto attachDto);
  int deleteNotice(int noticeId);
}
