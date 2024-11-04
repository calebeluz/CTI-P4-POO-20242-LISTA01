package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double n1, n2,n3,n4, res;
		
		System.out.print("digite a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.print("digite a segunda nota: ");
		n2 = sc.nextDouble();
		System.out.print("digite a terceira nota: ");
		n3 = sc.nextDouble();
		System.out.print("digite a quarta nota: ");
		n4 = sc.nextDouble();
		res = n1 + n3 +n4+ n2;
		System.out.print("o resultado é: "+ res);
		
		
		

	}

}
