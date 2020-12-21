package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pensao;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Pensao[] vector = new Pensao[10];

		System.out.print("Quantos quartos foram arrendados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Arrendamento #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto nr: ");
			int quarto = sc.nextInt();

			vector[quarto] = new Pensao(nome, email);
		}

		System.out.println();
		System.out.println("Qaurtos Ocupados:");

		for (int i = 0; i < 10; i++) {
			if (vector[i] !=  null) {
				System.out.println(i +":" + vector[i]);
			}
		}

		sc.close();
	}

}
