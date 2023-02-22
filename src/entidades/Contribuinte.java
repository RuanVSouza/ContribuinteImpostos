package entidades;

public abstract class Contribuinte {

	protected String nome;
	protected Double rendimentoAnual;
	
	Contribuinte(){
	}

	public Contribuinte(String nome, Double rendimentoAnual) {
		super();
		this.nome = nome;
		this.rendimentoAnual = rendimentoAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendimentoAnual() {
		return rendimentoAnual;
	}

	public void setRendimentoAnual(Double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}
	
	
	public abstract Double taxa();
	
	
}
