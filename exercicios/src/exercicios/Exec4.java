package exercicios;

import java.util.Scanner;

public class Exec4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um dia");
		int d = input.nextInt();
		
		if(d < 1 || d > 31) {
			System.out.println("Dia invalido");
			return;
		}
		
		System.out.println("Informe o mês");
		int m = input.nextInt();
		
		if(m < 1 || m > 12) {
			System.out.println("Mês invalido");
			return;
		}
		
		System.out.println("Informe o ano");
		int a = input.nextInt();
		
		boolean b = false;
		
		if((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
			b = true;
		}
		int diasN;
		
		switch (m) {
		case 2: {
			diasN = b ? 29 : 28;
			break;
		}
		case 4: case 6: case 9: case 11:{
			diasN = 30;
			}	
		default : 
			diasN = 31;
		}	
		
		if(d <= diasN) {
			System.out.println("Data valida");
		}else {
			System.out.println("Data invalida");
		}
	}	
}

	

