package com.emilio.exercises;
//Faça um Programa que peça dois números e imprima a soma. 

import java.util.Scanner;

public class somaDeInteiros {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("digite o primeiro valor: ");
		int valor1 = scan.nextInt();
		System.out.println("digite o segundo valor: ");
		int valor2 = scan.nextInt();
		System.out.println("A soma dos valores é: " + (valor1 + valor2));
	}
}
