package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, aumento, valor;
		
		System.out.println("digite o salario: ");
		salario = sc.nextDouble();
		System.out.println("diga seu aumento: ");
		aumento = sc.nextDouble();
		valor= salario * aumento/100;
		salario = salario + valor;
		
		System.out.print("seu novo salario é: "+ salario );
		System.out.print(" e seu aumento é de: "+ valor );
		
		
		 
		
	}

}
