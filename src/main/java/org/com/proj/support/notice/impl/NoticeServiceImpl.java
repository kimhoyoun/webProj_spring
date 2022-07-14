package org.com.proj.support.notice.impl;

import java.util.List;

import org.com.proj.support.notice.NoticeDTO;
import org.com.proj.support.notice.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Override
	public void insertNotice(NoticeDTO dto) {
		noticeDAO.insert(dto);
	}

	@Override
	public void updateNotice(NoticeDTO dto) {
		noticeDAO.modify(dto);
	}

	@Override
	public void deleteNotice(NoticeDTO dto) {
		noticeDAO.delete(dto);
	}

	@Override
	public NoticeDTO detailNotice(String id) {
		return noticeDAO.detail(id);
	}

	@Override
	public List<NoticeDTO> NoticeList(int start, int limit) {
		return noticeDAO.list(start, limit);
	}

}
