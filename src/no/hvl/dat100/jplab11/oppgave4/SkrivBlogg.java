package no.hvl.dat100.jplab11.oppgave4;

import java.io.*;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg{

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
	
		File file = new File(mappe + filnavn);
		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter print = new PrintWriter(writer);
		
		print.write(samling.toString());
		print.close();
		
		System.out.println(samling.toString());
		
		return true;
		
		//Alternativ måte, men må ha throws exception på test
//		BufferedWriter bwriter = new BufferedWriter(new FileWriter(mappe + filnavn));
//		bwriter.write(samling.toString());
//		bwriter.close();
	}

}