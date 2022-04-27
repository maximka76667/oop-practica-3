package main;

public class Carta {

	private int numero, palo;

	public Carta(int numero, int palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public Carta(int id) throws Exception {
		if (id < 0 || id > 39) {
			throw new Exception("Identificador carta inválido");
		}
		this.palo = (int) Math.floor(id / 10);
		this.numero = id % 10;
	}

	public int getNumero() {
		return numero;
	}

	public int getPalo() {
		return palo;
	}

	public PaloCarta nombrePalo() {
		return PaloCarta.values()[this.palo];
	}

	public NumeroCarta nombreCarta() {
		return NumeroCarta.values()[this.numero];
	}

	@Override
	public String toString() {
		return "Palo: " + nombrePalo() + "\n" +
				"Numero: " + nombreCarta(); 
	}
}
