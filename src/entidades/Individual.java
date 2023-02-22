package entidades;

public class Individual extends Contribuinte {

	private Double gastosSaude;
	
	Individual(){
		super();
	}

	public Individual(String nome, Double rendimentoAnual, Double gastosSaude) {
		super(nome, rendimentoAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double taxa() {
		if(rendimentoAnual < 20000.00) {
			return getRendimentoAnual() * 0.15 - gastosSaude * 0.5;
		}
		else {
			return getRendimentoAnual() * 0.25 - gastosSaude * 0.5;
		}
		
	}
	
	
}
