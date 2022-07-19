package org.com.proj.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;
import org.com.proj.support.notice.NoticeDTO;

public interface NoticeMapper {

	@Select("Select * from notice")
	public ArrayList<NoticeDTO> list();
}
