package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
	/**
		PRUEBA NO EXITOSA
		Se considera que no lanza excpecion ya que el método de calculo de tarifa acepta tafifas, dias o edades
		negativas, y según lo que se definió en las clases de equivalencia esto no debería ser permitido
	*/
	@Test
	public void deberiaParametrosInvalidos(){
		try{
			double a = CalculadorDescuentos.calculoTarifa(-154666,-22,-1);
			Assert.assertTrue(false);
		} catch(Exception e){
			Assert.assertTrue(true);
		}	
	}
	
	@Test
	public void deberiaDarDescuentoPorAntelacion(){
		double a = CalculadorDescuentos.calculoTarifa(1,21,18);
		Assert.assertTrue(a-0.85<0.00000001);
		a = CalculadorDescuentos.calculoTarifa(1,21,65);
		Assert.assertTrue(a-0.85<0.00000001);
		a = CalculadorDescuentos.calculoTarifa(666,21,30);
		Assert.assertTrue(a-566.1<0.00000001);
	}
	/**
		PRUEBA NO EXITOSA
		Según la especificación del método, se necesitan mas de 21 días de antelación para obtener un descuento,
		pero el caso (1 tarifa,20 dias ,17 años) no aplica el descuento que debería (5%)
	*/
	@Test
	public void deberiaDarDescuentoPorMenorDeEdad(){
		double a = CalculadorDescuentos.calculoTarifa(1,0,0);
		
		Assert.assertTrue(a-0.95<0.00000001);
		
		//CASO NO EXITOSO
		a = CalculadorDescuentos.calculoTarifa(1,20,17);
		Assert.assertTrue(a-0.95<0.00000001);
		
		
		a = CalculadorDescuentos.calculoTarifa(1000, 12, 4);
		Assert.assertTrue(a-950<0.00000001);
		
	}
	
	@Test
	public void deberiaDarDescuentoPorMayorDeEdad(){
		double a = CalculadorDescuentos.calculoTarifa(1,0,66);
		Assert.assertTrue(a-0.92<0.00000001);
		a = CalculadorDescuentos.calculoTarifa(10000, 13,69);
		Assert.assertTrue(a-9200<0.00000001);
	}
	
	@Test
	public void deberiaDarDescuentoPorAntelacionYMenorDeEdad(){
		double a = CalculadorDescuentos.calculoTarifa(1,21,0);
		Assert.assertTrue(a-0.8<0.00000001);
		a = CalculadorDescuentos.calculoTarifa(1,21,17);
		Assert.assertTrue(a-0.8<0.00000001);
		a = CalculadorDescuentos.calculoTarifa(5000, 24, 10);
		Assert.assertTrue(a-4000<0.00000001);
	}
	
	@Test
	public void deberiaDarDescuentoPorAntelacionYMayorDeEdad(){
		double a = CalculadorDescuentos.calculoTarifa(1,21,66);
		Assert.assertTrue(a-0.77<0.00000001);
		a = CalculadorDescuentos.calculoTarifa(2000, 25, 77);
		Assert.assertTrue(a-1540<0.00000001);
	}


}