package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hrs_trab, sal_m, valor_hrs, v_sal_bruto,imp,sal_lq;
		System.out.println("horas trabalhadas: ");
		hrs_trab = sc.nextDouble();
		System.out.println("valor do salario minimo: ");
		sal_m = sc.nextDouble();
		valor_hrs = sal_m / 2;
		v_sal_bruto = valor_hrs * hrs_trab;
		imp = v_sal_bruto * 3/100;
		sal_lq = v_sal_bruto - imp;
		
		System.out.println("o salario final é: "+ sal_lq);
		
	
		
		
		
		
		
		

	}

}
