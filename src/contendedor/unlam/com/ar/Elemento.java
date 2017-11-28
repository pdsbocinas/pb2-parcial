package contendedor.unlam.com.ar;

public class Elemento {
	private Integer id;
	private Integer peso;
	
	public Elemento(Integer id, Integer peso) {
		super();
		this.id = id;
		this.peso = peso;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getPeso() {
		return peso;
	}
	
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
}
