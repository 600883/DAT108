package no.hvl.dat108.app.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import no.hvl.dat108.app.model.Deltager;



	public interface DeltagerRepo extends JpaRepository<Deltager, Integer> {
		
		Deltager findByMobil(String mobil);
	}


