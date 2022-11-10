package no.hvl.dat108.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import no.hvl.dat108.app.util.PassordUtil;

@Entity
@Table(schema= "deltager_liste")
public class Deltager {
	
	@Id
	private String mobil;
	private String fornavn;
	private String etternavn;
	//private String passord;
	private String kjonn;
	
	private String salt;
	private String passordhash;
	
	public Deltager() {
		
	}
	
	public Deltager(String mobil, String fornavn, String etternavn, String passord, String kjonn) {
		
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.mobil = mobil;
		
		this.kjonn = kjonn;
		
		this.salt = PassordUtil.genererTilfeldigSalt();
		this.passordhash = PassordUtil.hashMedSalt(passord, salt);
		
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getMobil() {
		return mobil;
	}

	public void setTlfNr(String mobil) {
		this.mobil = mobil;
	}

//	public String getPassord() {
//		return passord;
//	}

//	public void setPassord(String passord) {
//		this.passord = passord;
//	}

	public String getKjonn() {
		return kjonn;
	}

	public void setKjonn(String kjonn) {
		this.kjonn = kjonn;
	}
	
	public String getSalt() {
		return salt;
	}
	
	public String getPassordHash() {
		return passordhash;
	}

	@Override
	public String toString() {
		return "Deltager [tlfnr=" + mobil + ", fornavn=" + fornavn + ", etternavn=" + etternavn 
				+ ", kjonn=" + kjonn + "]";
	}
	
	

}
