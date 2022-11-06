package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) throws Exception {

//		BufferedReader reader = new BufferedReader(new FileReader(mappe+filnavn));
		File file = new File (mappe + filnavn);
		Scanner reader = new Scanner(file);
		
		
		String line;
		
		while (reader.hasNextLine()) {
			line = reader.nextLine();
			System.out.println(line);
		}
		
		
		
//		while ((line = reader.readLine()) != null) {
//			line = line + reader.readLine();
//			System.out.println(line);
//		}
		
		reader.close();
		
		return null;
	}
}
