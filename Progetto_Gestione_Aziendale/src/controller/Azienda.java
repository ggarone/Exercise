package controller;

import java.util.Arrays;

import model.Impiegato;

public class Azienda {
	int impiegatiMax,impiegatiAttuali;
	Impiegato[] impiegati;
	
	public Azienda(int impiegatiMax) {
		super();
		this.impiegatiMax = impiegatiMax;
		this.impiegati = new Impiegato[impiegatiMax];
		this.impiegatiAttuali = 0;
	}

	public int getImpiegatiMax() {
		return impiegatiMax;
	}

	public void setImpiegatiMax(int impiegatiMax) {
		this.impiegatiMax = impiegatiMax;
	}

	public int getImpiegatiAttuali() {
		return impiegatiAttuali;
	}

	public void setImpiegatiAttuali(int impiegatiAttuali) {
		this.impiegatiAttuali = impiegatiAttuali;
	}

	public Impiegato[] getImpiegati() {
		return impiegati;
	}

	public void setImpiegati(Impiegato[] impiegati) {
		this.impiegati = impiegati;
	}

	public void addImpiegato(Impiegato i) {
		if(impiegatiAttuali < impiegatiMax) {
			impiegati[impiegatiAttuali++] = i;
		}
	}
	
	public int totalSalary() {
		int totalSalary = 0;
		for (Impiegato impiegato : impiegati) {
			if(impiegato != null)
				totalSalary += impiegato.getSalary();
		}
		return totalSalary;
	}

	@Override
	public String toString() {
		return "Azienda [impiegatiMax=" + impiegatiMax + ", impiegatiAttuali=" + impiegatiAttuali + ", impiegati="
				+ Arrays.toString(impiegati) + "]";
	}
	
}
