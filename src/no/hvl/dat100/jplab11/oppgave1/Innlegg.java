package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	// TODO - deklarering av objektvariable
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		this.likes=0;
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;

		// TODO 
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=likes;

		// TODO - START
		
	}
	
	public String getBruker() {
		return bruker;
		

	}

	public void setBruker(String bruker) {
		this.bruker=bruker;
		
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato=dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		if(innlegg.id==getId()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String tekst=getId()+"\n"+getBruker()+"\n"+getDato()+"\n"+getLikes()+"\n";
		return tekst;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
