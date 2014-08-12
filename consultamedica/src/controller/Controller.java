package controller;
import dados.Dados;
import model.Pacientes;
import model.Medicamentos;
import model.Consultas;
import view.View;

public class Controller {
	
	Dados d = new Dados();
	View v = new View();
	
	
	public void cadastrarPaciente (Pacientes p) {
		p.setCpf(v.cadastroCpfPacientes());
		p.setNome(v.cadastroNomePacientes());
		d.listaPacientes.add(p);
		
	}
	
	public void cadastrarMedicamento (Medicamentos m) {
		m.setCodigo(v.cadastroCodigoMedicamentos());
		m.setNome(v.cadastroNomeMedicamentos());
		m.setFabricante(v.cadastroFabricanteMedicamentos());
		d.listaMedicamentos.add(m);
	}
	
	public void registroConsulta (Consultas c, Medicamentos m) {
		int i = 0;
		c.setNumero(v.cadastroNumeroConsulta());
		c.setProntuario(v.cadastroProntuarioConsulta());
		i = v.cadastroReceituarioConsulta();
		c.setReceituario(d.listaMedicamentos.get(i));
		}
		
		
	}
