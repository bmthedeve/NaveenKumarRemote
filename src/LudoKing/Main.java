package LudoKing;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Alex points");
		int alex_score = sc.nextInt();
		if(alex_score<0 || alex_score>50) {
			System.out.println(alex_score+" is an invalid number");
		}
		else {
			System.out.println("Enter Nikil points");
			int nikil_score = sc.nextInt();
			if(nikil_score<0 || nikil_score>50) {
				System.out.println(nikil_score+" is an invalid number");
			}
			else {
				System.out.println("Enter Sam points");
				int sam_score = sc.nextInt();
				if(sam_score<0 || sam_score>50) {
					System.out.println(sam_score+" is an invalid number");
				}
				else {
					if(alex_score > nikil_score && alex_score > sam_score) System.out.println("Alex scored "+alex_score+" points and won the game");
					else if(nikil_score > alex_score && nikil_score > sam_score) System.out.println("Nikil scored "+nikil_score+" points and won the game");
					else System.out.println("Sam scored "+sam_score+" points and won the game");
				}
			}
		}
	}
}

//1IQH8 is attendance code
