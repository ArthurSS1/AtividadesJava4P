package atividades;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de maçãs: ");
		int macas = scanner.nextInt();
		
		double VTotal;
		
		if (macas < 12) {
			VTotal = macas * 1.30;
		}else {
			VTotal = macas * 1;
		}
		
		System.out.println("O valor total da compra é: R$ " + VTotal);
		scanner.close();
	}

}
