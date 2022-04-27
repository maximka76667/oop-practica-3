package main;

public class Main {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();

		baraja.verBaraja();
		
		System.out.println("\nBaraja inicial\n");

		// Barajar
//		baraja.barajar();
//		baraja.verBaraja();
//		System.out.println("\nBaraja despues de barajar\n");

		// Insertar Espadas As al principio
//		baraja.insertaCartaPrincipio(20);
//		baraja.verBaraja();

		// Insertar Espadas Seis al final
//		baraja.insertaCartaFinal(25);
//		baraja.verBaraja();
		
//		try {
//			baraja.cortar(3);
//			baraja.verBaraja();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		// Robar carta
		baraja.robar();
		baraja.verBaraja();
	}

}
