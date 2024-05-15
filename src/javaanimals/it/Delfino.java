package javaanimals.it;

public class Delfino  extends Animale implements Nuotatori {

	@Override
	public void verso() {
		System.out.println("FRIUU FRIUU");
		
	}

	@Override
	public void mangia() {
		System.out.println("GNAM GNAM PESCI");
		
	}

	@Override
	public void nuota() {
		System.out.println("STO NUOTANDOO");
		
	}
	
	
}
