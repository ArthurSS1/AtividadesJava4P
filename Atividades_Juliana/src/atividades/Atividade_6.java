package atividades;

import java.util.Scanner;

public class Atividade_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		double valor1 = scanner.nextDouble();
		
		System.out.print("Digite outro valor: ");
		double valor2 = scanner.nextDouble();
		
		if(valor1 > valor2) {
			System.out.println(valor1);
		}else {
			System.out.println(valor2);
		} scanner.close();

	}

}
