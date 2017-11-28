package contendedor.unlam.com.ar;

import java.util.LinkedList;

public class Contenedor {
	private Integer cantidadMaxima;
	private Integer maximo = 0;
	private LinkedList<Elemento> elementos;
	
	public Contenedor(Integer cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
		elementos = new LinkedList<Elemento>();
	}
	
	public Integer getCantidadMaxima() {
		return cantidadMaxima;
	}
	
	public void setCantidadMaxima(Integer cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}
	
	public Integer getMaximo() {
		return maximo;
	}
	
	public void setMaximo(Integer maximo) {
		this.maximo = maximo;
	}
	
	public LinkedList<Elemento> getElementos() {
		return elementos;
	}
	
	public void setElementos(LinkedList<Elemento> elementos) {
		this.elementos = elementos;
	}
	
	public boolean agregarElemento (Elemento elemento) {
		if(elementos.size() >= cantidadMaxima) {
		    return false;
		} else {
		    elementos.add(elemento);

		    if(elemento.getPeso() > maximo) {
			this.maximo = elemento.getPeso();
		    }
		    return true;
		}   
    	}
	
	public Integer contarElementos () {
		return elementos.size();
	}
	
	public Integer calcularPeso () {
		int pesoTotal = 0;
		
		for(Elemento item : elementos) {
            		pesoTotal = pesoTotal + item.getPeso();
        	}
		
		return pesoTotal;
	}
	
	public Integer mayorPeso() {
		return this.maximo;
	}
	
}
