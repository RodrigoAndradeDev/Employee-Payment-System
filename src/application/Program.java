package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("Quantos funcionarios serão cadastrados?");
		int quantidadeFuncionario = sc.nextInt();

		for (int i = 0; i < quantidadeFuncionario; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i+1));
			System.out.print("terceirizado (s/n): ");
			char terceirizado = sc.next().charAt(0);

			System.out.print("Nome:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas:");
			Integer horas = sc.nextInt();
			System.out.print("Valor por hora:");
			Double valorPorHora = sc.nextDouble();

			if (terceirizado == 's') {
				System.out.print("Valor adicional:");
				double valorAdicional = sc.nextDouble();
				list.add(new FuncionarioTerceirizado(name, horas, valorPorHora, valorAdicional));
			} else {
				list.add(new Funcionario(name, horas, valorPorHora));
			}

		}
		System.out.println();
		for (Funcionario f : list) {
			System.out.println(f.toString());
		}
		
		sc.close();

	}

}
