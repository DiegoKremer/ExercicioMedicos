package model;
import java.util.Date;

public class Consultas {
	
	Pacientes paciente;
	private int numero;
	private String prontuario;
	private Medicamentos receituario;
	private Date data;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	public Medicamentos getReceituario() {
		return receituario;
	}
	public void setReceituario(Medicamentos receituario) {
		this.receituario = receituario;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	

}
