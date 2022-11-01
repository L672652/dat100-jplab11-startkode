package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	private Innlegg[] innleggsTabell;
	private int nesteLedig;

	// TODO: objektvariable 

	public Blogg() {
		this.innleggsTabell=new Innlegg[20];
		this.nesteLedig=0;
	}

	public Blogg(int lengde) {
		this.innleggsTabell=new Innlegg[lengde];
		this.nesteLedig=0;
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggsTabell;
		
		

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i=0;i<getAntall();i++) {
			if(innleggsTabell[i].erLik(innlegg)) {
				return i;
			}
			
		}
		return -1;

	}

	public boolean finnes(Innlegg innlegg) {
		int finnes=finnInnlegg(innlegg);
		return finnes!=-1;
	}

	public boolean ledigPlass() {
		return(getSamling().length-getAntall()>0); 

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(!finnes(innlegg)) {
			innleggsTabell[getAntall()]=innlegg;
			nesteLedig+=1;
			return true;
		}
		return false;

	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}