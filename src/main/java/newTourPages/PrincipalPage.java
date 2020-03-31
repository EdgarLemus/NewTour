package newTourPages;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalPage {

	public static final Target TXT_VALIDATE = Target.the("").locatedBy("//*[contains(text(),'{0}')]");
	public static final Target EJEMPLO = Target.the("").locatedBy("//a[@onclick='changeCountryOmniture({0})']");
}
