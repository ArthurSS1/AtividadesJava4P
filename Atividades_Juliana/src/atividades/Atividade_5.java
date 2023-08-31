package atividades;

import java.util.Scanner;

public class Atividade_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite seu ano de nascimento: ");
		int idade = scanner.nextInt();
		
		int IVoto = (2023 - idade);
		
		if(IVoto > 16) {
			System.out.println("Você pode votar!");
		}else {
			System.out.println("Você não pode votar");
		} scanner.close();
	}

}
