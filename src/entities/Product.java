package entities;

public class Product {
	
	private String nome;
	private String eamil;
	private Integer quarto;
	
	public Product(String nome, String eamil, Integer quarto) {
		this.nome = nome;
		this.eamil = eamil;
		this.quarto = quarto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	public Integer getQuarto() {
		return quarto;
	}
	public void setQuarto(Integer quarto) {
		this.quarto = quarto;
	}
	@Override
	public String toString() {
		return " nome=" 
				+ nome 
				+ ", eamil=" 
				+ eamil 
				+ ", quarto="
				+ quarto ;
	}
	
	

	
	
	
}
