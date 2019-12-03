package ufpb.br;

public class FabricaAndroid implements FabricaAbstrata {
	public Janela janela;
	public Menu menu;
	public Botao botao;
	
	public Janela criarJanela() {
		return new JanelaAndroid();
	}
	
	public Menu criarMenu() {
		return new MenuAndroid();
	}
    
	public Botao criarBotao() {
    	return new BotaoAndroid();
    }

	public Janela getJanela() {
		return janela;
	}

	public void setJanela(Janela janela) {
		this.janela = janela;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Botao getBotao() {
		return botao;
	}

	public void setBotao(Botao botao) {
		this.botao = botao;
	}
}
