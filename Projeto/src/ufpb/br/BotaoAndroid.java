package ufpb.br;

public class BotaoAndroid implements Botao{
	
	public String desenhar() {
		String status = "Botao Android";
	return status;
	}

	@Override
	public String toString() {
		return this.desenhar();
	}
}
