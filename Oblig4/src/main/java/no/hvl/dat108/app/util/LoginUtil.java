package no.hvl.dat108.app.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginUtil {
	
	public static void loggUtBruker(HttpSession session) {
		session.invalidate();
	}
	
	public static void loggInnBruker(HttpServletRequest request, String mobil, String passord) {
		
		loggUtBruker(request.getSession());
		
		HttpSession session = request.getSession();
		session.setAttribute("mobil", mobil);
		session.setAttribute("passord", passord);
		
	}
	
	public static boolean erBrukerInnlogget(HttpSession session) {
		
		return session != null 
				&& session.getAttribute("mobil") != null
				&& session.getAttribute("passord") != null;

	}
}
