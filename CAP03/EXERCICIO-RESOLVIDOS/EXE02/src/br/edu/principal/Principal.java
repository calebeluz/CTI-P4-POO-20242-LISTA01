package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, res;
		
		System.out.print("digite a nota número: ");
		n1 = sc.nextDouble();
		System.out.print("digite a nota número: ");
		n2 = sc.nextDouble();
		System.out.print("digite a nota número: ");
		n3 = sc.nextDouble();
		res = (n1+n2+n3)/3;
		System.out.print("A média é: "+ res);
		

	}

}
