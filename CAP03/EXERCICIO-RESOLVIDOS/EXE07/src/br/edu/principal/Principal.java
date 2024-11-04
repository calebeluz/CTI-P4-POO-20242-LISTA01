package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario,imp;

		System.out.println("qual é o salario: ");
		salario = sc.nextDouble();
		
		salario = (salario + 50) -(salario*0.1);
		System.out.println("qual é o salario: "+ salario);
		

	}

}
