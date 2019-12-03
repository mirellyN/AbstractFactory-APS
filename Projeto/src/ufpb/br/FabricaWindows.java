package ufpb.br;

public class FabricaWindows implements FabricaAbstrata {
	
	public Janela janela;
	public Menu menu;
	public Botao botao;
	
	public Janela criarJanela() {
		return new JanelaWindows();
	}
	
	public Menu criarMenu() {
		return new MenuWindows();
	}
    
	public Botao criarBotao() {
    	return new BotaoWindows();
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
