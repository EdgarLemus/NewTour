package newTourPages;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPages {

	public static final Target TXTUSUARIO = Target.the("Este campo es el del usuario").locatedBy("//input[@name='userName']");
	public static final Target TXTCONTRASENA = Target.the("").locatedBy("//input[@name='password']");
	public static final Target BTNSUBMIT = Target.the("").locatedBy("//input[@name='login']");
	public static final Target TXTRESULTADO = Target.the("").locatedBy("//a[contains(text(),'registration')]");
}
