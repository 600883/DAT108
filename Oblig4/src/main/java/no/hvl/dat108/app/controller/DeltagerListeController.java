package no.hvl.dat108.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import no.hvl.dat108.app.model.Deltager;
import no.hvl.dat108.app.util.LoginUtil;


@Controller
public class DeltagerListeController {
	
	@Value("${app.url.deltagerliste}")
	private String deltagerliste;
	
	@Value("${app.message.requiresLogin}")
	private String REQUIRES_LOGIN_MESSAGE;
	
	@Value("${app.url.login}")
	private String LOGIN_URL;
	
//	@GetMapping("/${app.url.deltagerliste}")
//	public String hentDeltagerListe() {
//		return "DeltagerListeView";
//	}
	
		
	@Autowired
	private DeltagerService aService;
	
	@GetMapping("/${app.url.deltagerliste}")
	public String visDeltagere(HttpSession session, RedirectAttributes ra) {
		
		if(!LoginUtil.erBrukerInnlogget(session)) {
			ra.addFlashAttribute("redirectMessage", REQUIRES_LOGIN_MESSAGE);
		
			return "redirect: " + LOGIN_URL;	
			
		}
		return "DeltagerListeView";
	}

}
