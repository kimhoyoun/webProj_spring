package org.com.proj.support.notice;

import java.util.HashMap;
import java.util.List;

public interface NoticeInfoMapper {

	// 전체
	public List<NoticeDTO> selectAll(HashMap<String, Object> map); 
	// 상세
	public NoticeDTO selectOne(String id); 
	// 입력
	public void insert(NoticeDTO dto);
	// 페이징
	public Long selectBoardCount();
	
}
