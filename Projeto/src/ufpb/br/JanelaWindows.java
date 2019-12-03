package ufpb.br;

public class JanelaWindows implements Janela {
	
	public String desenhar() {
		String status = "Janela Windows";
	return status;
	}

	@Override
	public String toString() {
		return this.desenhar();
	}
	
}
