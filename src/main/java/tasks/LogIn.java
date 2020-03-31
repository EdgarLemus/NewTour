package tasks;

import static newTourPages.LoginPages.BTNSUBMIT;
import static newTourPages.LoginPages.TXTCONTRASENA;
import static newTourPages.LoginPages.TXTUSUARIO;
import static net.serenitybdd.core.steps.Instrumented.instanceOf;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.theValue;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class LogIn implements Task{
	
	private String user;
	private String password;
	
	public LogIn(String user) {
		this.user = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(theValue(user).into(TXTUSUARIO),
				theValue(password).into(TXTCONTRASENA),
				on(BTNSUBMIT));
	}

	public static LogIn withUser(String usuario)
	{
		return instanceOf(LogIn.class).withProperties(usuario);
	}

	public LogIn andPassword(String password)
	{
		this.password = password;
		return this;
	}
}
