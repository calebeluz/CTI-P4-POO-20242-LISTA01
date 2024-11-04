package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, i ,f,a ;
		System.out.print("qual é o número: ");
		num = sc.nextDouble();
		i = Math.floor(num);
		f = num - i;
		a = Math.floor(num);
		System.out.println(i);
		System.out.println(f);
		System.out.println(a);
		
	}

}
