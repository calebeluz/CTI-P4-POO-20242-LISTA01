package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vlr_sal, qtd_kw, vlr_kw, vlr_reais,desc, vlr_desc ;
		System.out.print("valor do salario min: ");
		vlr_sal= sc.nextDouble();
		System.out.print("Quantidade de quilowatt: ");
		qtd_kw = sc.nextDouble();
		
		vlr_kw = vlr_sal / 5;
		vlr_reais = vlr_kw * qtd_kw;
		desc = vlr_reais * 15/100;
		vlr_desc = vlr_reais - desc;
		
	
		System.out.println("valor dos quilowatts: " + vlr_kw);
		System.out.println("valorem reais: " + vlr_reais);
		System.out.println("valor com o desconto: " + vlr_desc);
		
	}

}
