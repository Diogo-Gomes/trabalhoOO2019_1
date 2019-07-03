package principal;

public class Manutencao extends Despesa {
	private String descricao;
	private String tipo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Manutencao(String nome, double valor, String data, String descricao, String tipo) {
		super(nome, valor, data);
		this.descricao = descricao;
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
