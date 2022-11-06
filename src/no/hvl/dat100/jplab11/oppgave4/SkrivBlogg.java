package no.hvl.dat100.jplab11.oppgave4;

import java.io.*;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg{

	public static boolean skriv(Blogg samling, String mappe, String filnavn) throws Exception {
	
		BufferedWriter bwriter = new BufferedWriter(new FileWriter(mappe + filnavn));

		bwriter.write(samling.toString());
		bwriter.close();
		System.out.println(samling.toString());
		return true;
		
	}

}