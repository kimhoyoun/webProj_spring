package org.com.proj.support.notice;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NoticeServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");

		NoticeService noticeService = (NoticeService) container.getBean("noticeService");
		
		NoticeDTO dto = new NoticeDTO("title", "filter", "content");
		noticeService.insertNotice(dto);
		
		List<NoticeDTO> noticeList = noticeService.NoticeList(0, 5);
		for(NoticeDTO d : noticeList) {
			System.out.println(d);
		}
		
		container.close();
	}
}
