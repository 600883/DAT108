package no.hvl.dat108.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import no.hvl.dat108.app.model.Deltager;
//import no.hvl.dat108.app.model.Kjonn;
import no.hvl.dat108.app.util.LoginUtil;

@Controller
public class PaameldingController {
	
 	@Value("${app.url.paameldt}")
 	private String paameldtSkjema;
	
	@Autowired
	private DeltagerRepo deltagerRepo;

	@GetMapping("/${app.url.paameldingSkjema}")
    public String hentPaaMeldingSkjema() {
		return "paaMeldingView";
	}
	
	@GetMapping("/${app.url.paameldt}")
	private String hentPaameldtSkjema() {
		return "paameldt";
	}
		
	
	@PostMapping("/${app.url.paameldingSkjema}")
	public String Registrer(@RequestParam String mobil, @RequestParam String fornavn, @RequestParam String etternavn, @RequestParam String passord, @RequestParam String kjonn,
							HttpServletRequest request, RedirectAttributes ra) {
		
		Deltager deltager = new Deltager(mobil, fornavn, etternavn, passord, kjonn);
		LoginUtil.loggInnBruker(request, mobil, passord);
		
		deltagerRepo.save(deltager);
		
		ra.addFlashAttribute("fornavn", deltager.getFornavn());
		ra.addFlashAttribute("etternavn", deltager.getEtternavn());
		ra.addFlashAttribute("mobil", deltager.getMobil());
		ra.addFlashAttribute("kjonn", deltager.getKjonn());
		
		
		
		return "redirect:" + paameldtSkjema;
		
		
		
		
	}
}
