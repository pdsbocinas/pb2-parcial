package contendedor.unlam.com.ar;

import org.junit.Assert;
import org.junit.Test;

public class ContenedorTest {

	@Test
	public void cantidadDeElementos() {
		// 1. Preparacion
		Integer max = 10;
		Elemento item = new Elemento(23,45);
		Contenedor miCaja = new Contenedor(max);
		Integer valorEsperado = 0;

		// 2. Ejecucion
		miCaja.agregarElemento(item);
		Integer cantidad = miCaja.contarElementos();
		
		// 3. Contrastacion
		Assert.assertEquals(cantidad, valorEsperado);
	}

}
