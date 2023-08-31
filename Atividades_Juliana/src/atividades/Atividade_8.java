package atividades;

import java.util.Scanner;

public class Atividade_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite a hora de início: ");
		int horaInicio = scanner.nextInt();
		
		System.out.print("Digite a hora de término: ");
		int horaFim = scanner.nextInt();
		
		int tempo;
		
		if(horaInicio < horaFim) {
			tempo = horaFim - horaInicio;
		}else {
			tempo = 24 - horaInicio - horaFim;
		}
		
		System.out.println("A duração do jogo é de: " + tempo + " horas.");
		
		scanner.close();
		
	}

}
