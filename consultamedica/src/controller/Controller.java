package controller;
import dados.Dados;
import model.Pacientes;
import model.Medicamentos;
import model.Consultas;

public class Controller {
	
	Dados d = new Dados();
	
	public void cadastrarPaciente (Pacientes p) {
		d.listaPacientes.add(p);
	}
	
	public void cadastrarMedicamento (Medicamentos m) {
		d.listaMedicamentos.add(m);
	}

}
