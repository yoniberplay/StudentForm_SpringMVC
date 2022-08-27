package validaciones;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = telefonovalidacion.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface telefono {
	
	public String message() default "Numero de telefon invalido.";
	
	public String value() default "829";
	public String value1() default "849";
	public String value2() default "809";
	
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
