package org.com.proj.support.notice;

import java.util.List;

import org.com.proj.support.notice.NoticeDTO;

public interface NoticeService {
	
	void insertNotice(NoticeDTO dto);
	
	void updateNotice(NoticeDTO dto);
	
	void deleteNotice(NoticeDTO dto);
	
	NoticeDTO detailNotice(String id);
	
	List<NoticeDTO> NoticeList(int start, int limit);
}
