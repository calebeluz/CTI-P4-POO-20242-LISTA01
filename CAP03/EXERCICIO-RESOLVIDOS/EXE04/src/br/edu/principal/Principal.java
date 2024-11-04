package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, aumento;
		
		System.out.println("digite o salario: ");
		salario = sc.nextDouble();
		salario = salario + salario* 0.25;
		
		System.out.println("seu novo salario é: "+ salario);

	}

}
