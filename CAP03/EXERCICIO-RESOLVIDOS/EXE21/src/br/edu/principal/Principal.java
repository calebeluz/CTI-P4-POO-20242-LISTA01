package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,y,z ;
		System.out.print("tamanho da escada: ");
		z = sc.nextDouble();
		System.out.print("Altura que deseja pregar o quadro: ");
		x = sc.nextDouble();
		
		y = (z*z) - (x*x);
		y = Math.sqrt(y);
		
		System.out.println("a distância é: "+ y);

		

	}

}









