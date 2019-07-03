package principal;

public class Seguro extends Despesa {
	private String descricao;
	private String corretora;
	private double franquia;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Seguro(String nome, double valor, String data, String descricao, String corretora, double franquia) {
		super(nome, valor, data);
		this.descricao = descricao;
		this.corretora = corretora;
		this.franquia = franquia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCorretora() {
		return corretora;
	}

	public void setCorretora(String corretora) {
		this.corretora = corretora;
	}

	public double getFranquia() {
		return franquia;
	}

	public void setFranquia(double franquia) {
		this.franquia = franquia;
	}

}
