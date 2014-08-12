package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import controller.Controller;
import model.Medicamentos;

public class Testes {

	
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testeCadastroMedicamento () {
		Medicamentos m = new Medicamentos ();
		Controller controlador = new Controller ();
		controlador.cadastrarMedicamento(m);
		System.out.println(m.getFabricante());
		assertTrue(m.getFabricante() == "heheh");
		
	}

}
