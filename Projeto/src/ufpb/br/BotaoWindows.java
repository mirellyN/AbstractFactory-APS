package ufpb.br;

public class BotaoWindows implements Botao {
	
	public String desenhar() {
		String status = "Botao Windows";
	return status;
	}

	@Override
	public String toString() {
		return this.desenhar();
	}
}
