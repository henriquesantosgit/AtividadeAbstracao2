package br.edu.fatecpg.veiculo.view;
import java.util.Scanner;
import br.edu.fatecpg.veiculo.model.Carro;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o chassi: ");
		String chassi = scan.nextLine();
		System.out.println("Digite a marca : ");
		String marca = scan.nextLine();
		System.out.println("Digite o modelo: ");
		String modelo = scan.nextLine();
		System.out.println("Digite o motor: ");
		double motor = scan.nextDouble();
		System.out.println("Digite a capacidade do tanque: ");
		double capT = scan.nextDouble();
		Carro carroHenrique = new Carro(chassi,marca,modelo,motor,capT);
		
		
		String chassiE = carroHenrique.getChassi();
	
		String marcaE = carroHenrique.getMarca();
		
		String modeloE = carroHenrique.getModelo();
		String placa = carroHenrique.getPlaca();
		double motorE = carroHenrique.getMotor();
		
		System.out.println("Digite o valor da gasolina: ");
		double resultado = scan.nextDouble();
		System.out.println(marca);
		System.out.println(chassi);
		System.out.println(modelo);
		System.out.println(motor);
		System.out.println(carroHenrique.calcGasolina(resultado));
		
	}

}
