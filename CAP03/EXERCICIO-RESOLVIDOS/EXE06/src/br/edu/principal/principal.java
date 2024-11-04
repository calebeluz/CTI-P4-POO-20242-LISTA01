package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario,grat,imp, comissao;

		System.out.println("qual é o salario: ");
		salario = sc.nextDouble();
		imp =  salario * 0.07;
		grat = salario * 0.05;
		salario = salario + grat - imp;
		
		
		
		
		
		System.out.println("o novo  salario é: "+ salario);

	}

}
