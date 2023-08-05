package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os números pares, e também a quantidade de
		 * números pares.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você deseja digitar?\n");
		int quantidade = sc.nextInt();

		Integer[] numeros = new Integer[quantidade];

		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite o %d° número: ", i + 1);
			numeros[i] = sc.nextInt();
		}

		int cont = 0;
		System.out.println("\nNúmeros pares: ");
		for (int x : numeros) {
			if (x % 2 == 0) {
				System.out.println(x);
				cont++;
			}
		}
		System.out.println("\nQuantidade de números pares: " + cont);
		
		sc.close();
	}

}
