package principal;

public class Abastecimento extends Despesa {
	private float litros;
	private String combustivel;
	private boolean tanque_cheio;
	private Desempenho desempenho;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Abastecimento(String nome, double valor, String data, float litros, String combustivel,
			boolean tanque_cheio) {
		super(nome, valor, data);
		this.litros = litros;
		this.combustivel = combustivel;
		this.tanque_cheio = tanque_cheio;
	}

	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public boolean isTanque_cheio() {
		return tanque_cheio;
	}

	public void setTanque_cheio(boolean tanque_cheio) {
		this.tanque_cheio = tanque_cheio;
	}

	public Desempenho getDesempenho() {
		return desempenho;
	}

	public void setDesempenho(Desempenho desempenho) {
		this.desempenho = desempenho;
	}

}
