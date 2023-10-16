package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String nameA = sc.nextLine();
		System.out.print("Vida inicial: ");
		int lifeA = sc.nextInt();
		System.out.print("Ataque: ");
		int attackA = sc.nextInt();
		System.out.print("Armadura: ");
		int armorA = sc.nextInt();

		Champion championA = new Champion(nameA, lifeA, attackA, armorA);

		sc.nextLine();
		System.out.println();

		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		String nameB = sc.nextLine();
		System.out.print("Vida inicial: ");
		int lifeB = sc.nextInt();
		System.out.print("Ataque: ");
		int attackB = sc.nextInt();
		System.out.print("Armadura: ");
		int armorB = sc.nextInt();
		System.out.println();

		Champion championB = new Champion(nameB, lifeB, attackB, armorB);

		System.out.print("Quantos turnos você deseja executar? ");
		int rounds = sc.nextInt();
		System.out.println();

		while (rounds < 1) {

			System.out.println("Digite um valor maior que zero!");
			System.out.println("Quantos turnos você deseja executar? ");
			rounds = sc.nextInt();
		}

		for (int i = 0; i < rounds; i++) {

			championA.takeDamage(championB);
			championB.takeDamage(championA);

			System.out.printf("Resultado do turno %d:%n", i + 1);
			System.out.println(championA.status());
			System.out.println(championB.status());
			System.out.println();

			if (championA.getLife() < 1 || championB.getLife() < 1) {

				break;
			}
		}

		System.out.println("FIM DO COMBATE");

		sc.close();
	}
}