package main;

import java.util.ArrayList;

public class Baraja {

	private ArrayList<Carta> cartas;
	private int numeroCartas;
	private boolean vacia;

	public Baraja() {
		this.cartas = new ArrayList<Carta>();
		this.numeroCartas = 2;
		for (int i = 0; i < this.numeroCartas; i++) {
			try {
				cartas.add(new Carta(i));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		this.vacia = false;
	}

	public void setNumeroCartas(int numeroCartas) {
		this.numeroCartas = numeroCartas;
		if(numeroCartas == 0) {
			this.vacia = true;
		} else {
			this.vacia = false;
		}
		System.out.println(this.numeroCartas);
		System.out.println(this.vacia);
	}



	public void barajar() {
		System.out.println("Barajar...");
		for (int i = 0; i < cartas.size(); i++) {
			int nuevaPosicion = (int) Math.floor(Math.random() * cartas.size());
			Carta temp = cartas.get(nuevaPosicion);
			cartas.set(nuevaPosicion, cartas.get(i));
			cartas.set(i, temp);
		}
	}

	public void cortar(int cantidad) throws Exception {
		if(cantidad >= cartas.size()) throw new Exception("No es posible");
		for(int i = 0; i < cantidad; i++) {
			cartas.add(cartas.get(0));
			cartas.remove(0);
		}
	}
	
	public Carta robar() {
		Carta carta = cartas.get(0);
		cartas.remove(0);
		setNumeroCartas(numeroCartas - 1);
		return carta;
	}

	public void verBaraja() {
		for (Carta carta : cartas) {
			System.out.println(carta);
		}
	}

	public void insertaCartaFinal(int id) {
		try {
			insertaCartaFinal(new Carta(id));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void insertaCartaPrincipio(int id) {
		try {
			insertaCartaPrincipio(new Carta(id));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void insertaCartaFinal(Carta carta) {
		cartas.add(carta);
		setNumeroCartas(numeroCartas + 1);
	}

	public void insertaCartaPrincipio(Carta carta) {
		cartas.add(0, carta);
		setNumeroCartas(numeroCartas + 1);
	}

}
