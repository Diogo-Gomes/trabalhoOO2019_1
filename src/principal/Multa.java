package principal;

public class Multa extends Despesa {
	private String descricao;
	private String categoria;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Multa(String nome, double valor, String data, String descricao, String categoria) {
		super(nome, valor, data);
		this.descricao = descricao;
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
