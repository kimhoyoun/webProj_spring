package org.com.proj.support.notice;

import java.sql.Connection;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.ResolverUtil.Test;
import org.com.proj.support.notice.impl.NoticeDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/support/notice")
public class NoticeController {
	
	@Resource(name = "noticeDAO")
	private NoticeDAO dao;
	
	
//	@RequestMapping(value = "/List", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		
//		
//		model.addAttribute("mainUrl", "support/notice/list" );
//		return "contents/template";
//	}
	
	
	@RequestMapping(value = "/List", method = RequestMethod.GET)
	public String home(Model model, @RequestParam(value = "page", defaultValue="1") String page) {
		int pageNum = 1;
		if(page!=null && !page.equals("")) {
			pageNum = Integer.parseInt(page);
		}
		
		List<NoticeDTO> list = dao.list(pageNum);
		
		for(NoticeDTO dto : list) {
			System.out.println(dto);
		}
		
		
		model.addAttribute("mainUrl", "support/notice/list" );
		return "contents/template";
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(Model model) {
		
		NoticeDTO dto = dao.selectOne("notice1655091542855");
		
		System.out.println(dto);
		
		
		model.addAttribute("mainUrl", "support/notice/list" );
		return "contents/template";
	}
	
}
