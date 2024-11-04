package br.eduprincipal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, qua,cubo, rqua,rcubo;
		System.out.println("digite o número: ");
		num = sc.nextDouble();
		
		if (num > 0) {
			
			
			qua = num*num;
			System.out.println(qua);
			cubo = num*num*num;
			System.out.println(cubo);
			rqua = Math.sqrt(num);
			System.out.println(rqua);
			rcubo = Math.cbrt(num); 
			System.out.println(rcubo);
			
		}

		


	}

}
