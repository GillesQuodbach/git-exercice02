package gitExercice02;

import java.util.*;

import javax.swing.text.AbstractDocument.LeafElement;

public class GitExo02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Nombre allumettes départ

		int startMatchesNumber = 21;
		
		int player1MatchesNumber = startMatchesNumber;
		int player2MatchesNumber = startMatchesNumber;
		

		String player1Name = "";
		String player2Name = "";
		int currentPlayer = 0;
		int winner = 0;
		int howManyMatches = 0;
		boolean isValidNumber = true;

		System.out.println("Bienvenue au jeu du NIM");

		System.out.println("Entrer nom joueur 1");
		player1Name = scan.nextLine();
		
		
		System.out.println("Entrer nom joueur 2");
		player2Name = scan.nextLine();


		System.out.println("Quel joueur commence la partie ? 1 ou 2");
		currentPlayer = Integer.parseInt(scan.nextLine());
			System.out.println("A " + (currentPlayer == 1 ? player1Name : player2Name) + " de commencer la partie");
			System.out.println("Le nombre d'alumette total est de: " + startMatchesNumber );
			while (startMatchesNumber > 0) {
				while (isValidNumber) {
					System.out.println("A " + (currentPlayer == 1 ? player1Name : player2Name) + " de jouer");
					System.out.println("Combien d'allumette voulez vous retirez ? (1 à 4)");
					howManyMatches = Integer.parseInt(scan.nextLine());
					if ((howManyMatches < 1) || (howManyMatches > 4)) {
						System.out.println("Veuillez choisir un nombre entre 1 et 4");
					} else {

						startMatchesNumber = startMatchesNumber - howManyMatches;
						System.out.println("Allumette restante: " + startMatchesNumber);
						if (startMatchesNumber <= 0) {
							System.out.println((currentPlayer == 1 ? player1Name : player2Name) + " à perdu !");
							break;
						}
						currentPlayer = (currentPlayer == 1) ? 2 : 1;
					}
				}
			}
	}
}
