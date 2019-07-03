package principal;

public class Proprietario {
	private String nome;
	private int idade;
	private int registroGeral;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Proprietario(String nome, int idade, int registroGeral) {
		super();
		this.idade = idade;
		this.nome = nome;
		this.registroGeral = registroGeral;
	}
	
	public void setNome(String valor) {
		this.nome = valor;
	}

	public void setIdade(int valor) {
		this.idade = valor;
	}
	
	public void setRegistroGeral(int valor) {
		this.registroGeral = valor;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public int getRegistroGeral() {
		return this.registroGeral;
	}

}
