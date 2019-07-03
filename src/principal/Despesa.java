package principal;

public class Despesa {
	protected String nome;
	protected double valor;
	protected String data;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Despesa(String nome, double valor, String data) {
		this.nome = nome;
		this.valor = valor;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
