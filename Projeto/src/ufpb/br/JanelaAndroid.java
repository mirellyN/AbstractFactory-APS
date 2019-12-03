package ufpb.br;

public class JanelaAndroid implements Janela {
	
	public String desenhar() {
		String status = "Janela Android";
	return status;
	}

	@Override
	public String toString() {
		return this.desenhar();
	}
}
