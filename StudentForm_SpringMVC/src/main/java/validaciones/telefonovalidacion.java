package validaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class telefonovalidacion implements ConstraintValidator<telefono, String> {

	@Override
	public void initialize(telefono t) {
		this.telefono = t.value();
	}

	@Override
	public boolean isValid(String a, ConstraintValidatorContext cxt) {
		boolean valprefijo;
		
		if (a != null) {
			
			valprefijo = a.startsWith(telefono) || a.startsWith("849")||a.startsWith("809");
		}
		else return valprefijo=true; 	
		
		return valprefijo;
	}

	private String telefono;
}
