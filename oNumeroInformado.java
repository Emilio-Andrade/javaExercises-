package com.emilio.exercises;
//Faça um Programa que peça um número e então mostre 
//a mensagem O número informado foi [número]. 

import java.util.Scanner;
	public class oNumeroInformado {
		public static void main(String[] args) {
		
		System.out.println("Digite um número: ");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
			System.out.println("O número digitado foi: " + numero);
	}

}
