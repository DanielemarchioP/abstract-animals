package javaanimals.it;

public class Passerotto extends Animale implements Volatili {

	

	@Override
	public void verso() {
		
		System.out.println("CRU CRUU");
	}

	@Override
	public void mangia() {
		System.out.println("GNIM GNIM SEMI");
		
	}

	@Override
	public void vola() {
		System.out.println("STO VOLANDOOO");
		
	}
	
}
