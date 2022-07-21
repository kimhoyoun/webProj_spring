package org.com.proj.support.notice;

import java.util.List;

import org.com.proj.support.notice.NoticeDTO;

public interface NoticeService {
	//입력
	void insertNotice(NoticeDTO dto);
	// 수정
	void updateNotice(NoticeDTO dto);
	// 삭제
	void deleteNotice(NoticeDTO dto);
	// 조회
	NoticeDTO detailNotice(String id);
	// 조회 all
	List<NoticeDTO> NoticeList(int start, int limit);
}
