package br.edu.fatecpg.veiculo.model;

public class Carro {
	private String chassi;
	private String marca;
	private String modelo;
	private String placa;
	private double motor;
	private double capTanque;
	private boolean ligou=false;
	public Carro(String ch, String mrc, String mod, double motor,double capT) {
		this.chassi = ch;
		this.marca = mrc;
		this.modelo = mod;
		this.motor = motor;
		this.capTanque = capT;
	}
	public String getChassi() {
		return this.chassi;
	}
	public void setChassi(String ch) {
		this.chassi = ch;
	}
	public String  getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String getPlaca() {
		return this.placa;
	}
	public double getMotor() {
		return this.motor;
	}
	public boolean getLigou() {
		return this.ligou;
	}
	public double getcapTanque() {
		return this.capTanque;
	}
	public double calcGasolina(double valorGasolina) {
		double valorTotal = valorGasolina*capTanque;
		return valorTotal;
	}
	public void ligar() {
	System.out.println("Ligou");
	this.ligou = true;
	}
	public void desligar() {
		System.out.println("Desligou");
		this.ligou = false;
	}
	
	public void andar() {
		if(this.ligou==true) {
			System.out.println("Andando");
		}
		else {
			System.out.println("Ligue o carro");
		}
		}

		
}
