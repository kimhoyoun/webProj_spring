package org.com.proj.support.notice;

import java.util.HashMap;
import java.util.List;

public interface NoticeInfoMapper {

	public List<NoticeDTO> selectAll(HashMap<String, Object> map); 
	
	public NoticeDTO selectOne(String id); 
	
	public void insert(NoticeDTO dto);
	
	public Long selectBoardCount();
	
}
