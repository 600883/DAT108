package no.hvl.dat108.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import no.hvl.dat108.app.util.LoginUtil;

@Controller
@RequestMapping("/${app.url.login}")
public class LogOutController {
	
	@Value("${app.url.login}")
	private String LOGIN_URL;
	
//	@Value("${app.message.loggetUt}")
//	private String LOGGET_UT_MELDING;
	
//	@PostMapping
//	public String loggUt(HttpSession session, RedirectAttributes ra) {
//		
//		if(LoginUtil.erBrukerInnlogget(session)) {
//			LoginUtil.loggUtBruker(session);
//		}
//		
//		//ra.addFlashAttribute("redirectMessage", LOGGET_UT_MELDING);
//		return "redirect:" + LOGIN_URL;
//	}
	

}
