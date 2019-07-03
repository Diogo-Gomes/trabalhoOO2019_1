package principal;

public class Imposto extends Despesa {
	private String descricao;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Imposto(String nome, double valor, String data, String descricao) {
		super(nome, valor, data);
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
