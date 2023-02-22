package entidades;

public class Companhia extends Contribuinte {

	private Integer numeroFuncionarios;
	
	public Companhia() {
		super();
	}

	

	public Companhia(String nome, Double rendimentoAnual, Integer numeroFuncionarios) {
		super(nome, rendimentoAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}



	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}



	@Override
	public Double taxa() {
		if(numeroFuncionarios > 10) {
			return getRendimentoAnual() * 0.14;
		}
		else {
			return getRendimentoAnual() * 0.16;
		}
		
	}
	
	
	
	
}
