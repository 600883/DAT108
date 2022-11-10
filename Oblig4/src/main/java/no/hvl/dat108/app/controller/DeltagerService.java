package no.hvl.dat108.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.hvl.dat108.app.model.Deltager;

@Service
public class DeltagerService {
	
	@Autowired 
	private DeltagerRepo deltagerRepo;

	
	
//	public Deltager finnDeltagerMedTlf(int id) {
//		return deltagerRepo.getById(id);
//	}

	public Deltager finnDeltagerMedMobil(String mobil) {
		
		return deltagerRepo.findByMobil(mobil);
	}

	
}
