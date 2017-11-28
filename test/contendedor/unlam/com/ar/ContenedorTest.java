package contendedor.unlam.com.ar;

import org.junit.Assert;
import org.junit.Test;

public class ContenedorTest {

	@Test
	public void cantidadDeElementos() {
		// 1. Preparacion
		Integer max = 10;
		Contenedor miCaja = new Contenedor(max);
		Integer valorEsperado = 0;
		
		Elemento item = null;
		// 2. Ejecucion
		miCaja.agregarElemento(item);
		Integer cantidad = miCaja.contarElementos();
		
		// 3. Contrastacion
		Assert.assertEquals(cantidad, valorEsperado);
		
		// si no agrego ningun elemento da verde
	}

}
