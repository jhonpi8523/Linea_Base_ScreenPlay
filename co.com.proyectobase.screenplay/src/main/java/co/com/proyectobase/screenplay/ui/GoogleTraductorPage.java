package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTraductorPage {

	public static final Target BOTON_LENGUAJE_ORIGEN = Target.the("Boton que permite seleccionar idioma de Origen").located(By.id("gt-sl-gms"));
	public static final Target OPCION_LENGUAJE_ORIGEN = Target.the("Seleccion idioma Origen").located(By.id(":1e"));
	public static final Target BOTON_LENGUAJE_DESTINO = Target.the("Boton que permite seleccionar idioma de Destino").located(By.id("gt-tl-gms")); 
	public static final Target OPCION_LENGUAJE_DESTINO = Target.the("Seleccion idioma Destino").located(By.id(":3q"));
	public static final Target AREA_DE_TRADUCCION = Target.the("Area donde se digita lo que se va a traducir").located(By.xpath("//*[@id='source']"));
	public static final Target BOTON_TRADUCIR = Target.the("Boton que traduce lo escrito").located(By.xpath("//*[@id='gt-submit']"));
	public static final Target AREA_TRADUCIDA = Target.the("Area donde se muestra lo que se tradujo").located(By.id("gt-res-dir-ctr"));
}

