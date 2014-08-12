package view;

import java.util.Scanner;

public class View {
	
	Scanner entrada = new Scanner (System.in);
	
	// VIEW MEDICAMENTOS
	
	public String cadastroNomeMedicamentos () {
		System.out.println("Digite o nome do medicamento: ");
		return entrada.next();
	}
	
	public String cadastroFabricanteMedicamentos () {
		System.out.println("Digite o fabricante do medicamento: ");
		return entrada.next();
	}
	
	public int cadastroCodigoMedicamentos () {
		System.out.println("Digite o codigo do medicamento: ");
		return entrada.nextInt();
	}
	
	// VIEW PACIENTES
	
	public int cadastroCpfPacientes () {
		System.out.println("Digite o CPF do paciente: ");
		return entrada.nextInt();
	}
	
	public String cadastroNomePacientes () {
		System.out.println("Digite o nome do paciente: ");
		return entrada.next();
	}
	
	// VIEW CONSULTA
	
	public int cadastroNumeroConsulta () {
		System.out.println("Digite o número da consulta: ");
		return entrada.nextInt();
	}
	
	public String cadastroProntuarioConsulta () {
		System.out.println("Digite o prontuário do paciente: ");
		return entrada.next();
	}
	
	public int cadastroReceituarioConsulta () {
		System.out.println("Digite o código do medicamento: ");
		return entrada.nextInt();
	}
	
	
	
	

}
