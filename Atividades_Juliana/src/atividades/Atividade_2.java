package atividades;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double valor = scanner.nextDouble();
		
		if (valor >= 0) {
			System.out.println("O valor é positivo");
		}else {
			System.out.println("O valor é negativo");
			
		} scanner.close();
	}

}
