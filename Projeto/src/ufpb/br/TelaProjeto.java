package ufpb.br;

public class TelaProjeto {
	
	private FabricaAbstrata fabrica;
	private String janela;
	private String menu;
	private String botao;

	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabrica = fabrica;
	}

	public void montar() {
		janela = fabrica.criarJanela().toString();
		menu = fabrica.criarMenu().toString();
		botao = fabrica.criarBotao().toString();
	}
	
	
 
	public String desenhar() {
		String status = "";
		status += this.janela+"{";
		status += this.menu+", ";
		status += this.botao+ "}";

		return status;	
	}
	
	
}
