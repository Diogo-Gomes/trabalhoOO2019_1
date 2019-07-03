package principal;

public class Desempenho {
	private float litrosInicial;
	private float litrosFinal;
	private float quilometragemFinal;
	private float quilometragemInicial;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Desempenho(float litrosInicial, float litrosFinal, float quilometragemFinal, float quilometragemInicial) {
		super();
		this.litrosInicial = litrosInicial;
		this.litrosFinal = litrosFinal;
		this.quilometragemFinal = quilometragemFinal;
		
		if(quilometragemInicial != 0) {
			this.quilometragemInicial = quilometragemInicial;			
		} else {
			this.quilometragemInicial = 0;
		}
	}

	public float getLitrosInicial() {
		return litrosInicial;
	}

	public void setLitrosInicial(float litrosInicial) {
		this.litrosInicial = litrosInicial;
	}

	public float getLitrosFinal() {
		return litrosFinal;
	}

	public void setLitrosFinal(float litrosFinal) {
		this.litrosFinal = litrosFinal;
	}

	public float getQuilometragemFinal() {
		return quilometragemFinal;
	}

	public void setQuilometragemFinal(float quilometragemFinal) {
		this.quilometragemFinal = quilometragemFinal;
	}

	public float getQuilometragemInicial() {
		return quilometragemInicial;
	}

	public void setQuilometragemInicial(float quilometragemInicial) {
		this.quilometragemInicial = quilometragemInicial;
	}
	
	

}
