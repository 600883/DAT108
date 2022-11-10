package no.hvl.dat108.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import no.hvl.dat108.app.model.Deltager;
import no.hvl.dat108.app.util.InputValidator;
import no.hvl.dat108.app.util.LoginUtil;
import no.hvl.dat108.app.util.PassordUtil;

@Controller
@RequestMapping("/${app.url.login}")
public class LoggInnController {
	
	@Value("${app.message.invalid}")
	private String INVALID_MESSAGE;
	
	@Value("${app.url.login")
	private String LOGIN_URL;
	
	@Autowired
	private DeltagerService dService;
	
	@Value("${app.url.deltagerliste}")
	private String deltagerListe;
	

	@GetMapping
	public String hentLoginSkjema() {
		return "login";
	}
	
	@PostMapping
	public String provAaLoggeinn(@RequestParam String mobil, String passord, 
			HttpServletRequest request, RedirectAttributes ra) {
				
		Deltager deltager = dService.finnDeltagerMedMobil(mobil);
		
		if(!InputValidator.isValid(mobil) || deltager == null) {
			ra.addFlashAttribute("redirectMessage", INVALID_MESSAGE);
				return "redirect:" + LOGIN_URL;
		}
		
		String salt = deltager.getSalt();
		String hashetPassord = deltager.getPassordHash();
		
		if(!PassordUtil.validerMedSalt(passord, salt, hashetPassord)) {
			ra.addFlashAttribute("redirectMessage", INVALID_MESSAGE);
			return "redirect:" + LOGIN_URL;
		}
		
		LoginUtil.loggInnBruker(request, mobil, passord);
		
		return "redirect:" + deltagerListe;
		
		
	
	}
	
}
