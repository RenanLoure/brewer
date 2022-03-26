package Com.ProjetoRenan.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class cerveja {

	private String sku;
	private String nome; 
	
	
	@NotBlank
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
