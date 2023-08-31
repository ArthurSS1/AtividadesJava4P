package atividades;

import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite a primeira a nota: ");
		float primeiraNota = scanner.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		float segundaNota = scanner.nextFloat();
		
		float media = (primeiraNota + segundaNota) / 2;
		
		System.out.println("A média é: " + media);
		
		if(media >= 6) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado");
		} scanner.close();
	}

}
