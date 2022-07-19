package org.com.proj.support.notice;

import java.sql.Connection;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/support/notice")
public class NoticeController {
	
	@Inject
	private DataSource dataSource;
	
	
//	@RequestMapping(value = "/List", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		
//		
//		model.addAttribute("mainUrl", "support/notice/list" );
//		return "contents/template";
//	}
	@RequestMapping(value = "/List", method = RequestMethod.GET)
	public String home(@ModelAttribute Test test, Model model) {
		
		try {
			Connection conn = (Connection) dataSource.getConnection();
			System.out.println("성공" + conn);
		}catch(Exception e) {
			System.out.println("실패..");
			e.printStackTrace();
		}
		
		model.addAttribute("mainUrl", "support/notice/list" );
		return "contents/template";
	}
	
}
