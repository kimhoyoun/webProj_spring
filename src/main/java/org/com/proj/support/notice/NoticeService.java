package org.com.proj.support.notice;

import java.util.List;

import org.com.proj.support.notice.NoticeDTO;

public interface NoticeService {
	//입력
	void insert(NoticeDTO dto);
	// 수정
	void update(NoticeDTO dto);
	// 삭제
	void delete(NoticeDTO dto);
	// 조회
	NoticeDTO selectOne(String id);
	// 조회 all
	List<NoticeDTO> NoticeList(int start, int limit);
}
