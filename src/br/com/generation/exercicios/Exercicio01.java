package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ano,anos,mes,meses,dias,idade;
		
		System.out.println("Digite sua Idade em Anos, Meses e Dias, respectivamente: ");
		System.out.println("Anos:");
		Scanner leia = new Scanner(System.in);
		anos = leia.nextInt();
		
		System.out.println("Meses:");
		leia = new Scanner(System.in);
		meses = leia.nextInt();
		
		System.out.println("Dias:");
		leia = new Scanner(System.in);
		dias = leia.nextInt();
		
		ano =365;
		mes = 31;
		
		idade = ano * anos;
		
		idade = idade + (meses * mes);
		
		idade = idade + dias;
		
		System.out.println("Sua idade em dias é: " + idade + " dias!");
	}

}
