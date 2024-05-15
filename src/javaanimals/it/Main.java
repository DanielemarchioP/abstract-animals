package javaanimals.it;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Animale cocker = new Cane();
		
		cocker.mangia();
		
		Scanner scegliAnimale = new Scanner(System.in);
		
		System.out.println("Scegli un animale tra Passerotto e Delfino");
		
		
		String animaleScelto = scegliAnimale.next();
		
		switch (animaleScelto) {
		case "Passerotto" :
			Volatili Passerotto = new Passerotto();
			faiVolare(Passerotto);
			break;
		case "Delfino" :
			Nuotatori Delfino = new Delfino();
			faiNuotare(Delfino);
			break;
		}
	}

	
	
	
	public static void faiVolare(Volatili animaleVola) {
		animaleVola.vola();
	}
	
	public static void faiNuotare(Nuotatori animaleNuota) {
		animaleNuota.nuota();
	}
	
	
}
