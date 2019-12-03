package ufpb.br;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteTelaProjeto {

	@Test
	void CriarTela() {
		TelaProjeto t = new TelaProjeto();
		t.setFabrica(new FabricaWindows());
		t.montar();
		assertEquals("Janela Windows{Menu Windows, Botao Windows}", t.desenhar());
	}

}
