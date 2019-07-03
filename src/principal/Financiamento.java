package principal;

public class Financiamento extends Despesa {
	private String descricao;
	private int parcelas;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Financiamento(String nome, double valor, String data, String descricao, int parcelas) {
		super(nome, valor, data);
		this.descricao = descricao;
		this.parcelas = parcelas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

}
