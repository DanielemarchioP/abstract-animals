package javaanimals.it;

public class Aquila extends Animale implements Volatili {

	@Override
	public void verso() {
		System.out.println("FORZAROMA FORZAROMA");
		
	}

	@Override
	public void mangia() {
		System.out.println("GNOM GNOM CONIGLIO");
		
	}

	@Override
	public void vola() {
		System.out.println("STO VOLANDOOO");
		
	}
}
