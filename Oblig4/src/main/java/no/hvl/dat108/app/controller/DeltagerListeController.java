package no.hvl.dat108.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import no.hvl.dat108.app.model.Deltager;


@Controller
public class DeltagerListeController {
	
	@Autowired
	private DeltagerService aService;
	
//	@GetMapping(value="/DeltagerList")
//	public List<Deltager> deltagere() {
//		return aService.finnAlleD();
//	}
	
	
	
////	public String liste() {
////		
////		return "deltagere";
////	}
//	
//	public String loggUt() {
//		
//		return "";
//	}

}
