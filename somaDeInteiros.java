package com.emilio.exercises;
//Fa�a um Programa que pe�a dois n�meros e imprima a soma. 

import java.util.Scanner;

public class somaDeInteiros {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("digite o primeiro valor: ");
		int valor1 = scan.nextInt();
		System.out.println("digite o segundo valor: ");
		int valor2 = scan.nextInt();
		System.out.println("A soma dos valores �: " + (valor1 + valor2));
	}
}
