package com.emilio.exercises;
//Fa�a um Programa que pe�a um n�mero e ent�o mostre 
//a mensagem O n�mero informado foi [n�mero].

import java.util.Scanner;
	public class oNumeroInformado {
		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Digite um n�mero");
			int numero = scan.nextInt();
			System.out.println("O n�mero informado foi: " + numero);
		}

	}


