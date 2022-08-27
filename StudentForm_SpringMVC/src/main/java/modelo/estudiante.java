package modelo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class estudiante {

	@NotNull(message = "Campos requeridos.")
	@Size(min = 2, message = "Campos requeridos.")
	private String nombre;
	@NotNull(message = "Campos requeridos.")
	@Size(min = 2, message = "Campos requeridos.")
	private String apellido;
	@NotNull(message = "Campos requeridos.")
	@Pattern(regexp = "[0-9]{8}",message = "Escriba solo los numeros de su matricula sin guiones.")
	private String matricula;
	private String Optativa;
	@NotNull(message = "Seleccione uno.")
	private String sexo;
	
	@validaciones.telefono
	@NotNull(message = "(809,829 o 849)")
	private String telefono;
	@NotNull(message = "Seleccione al menos uno.")
	private String idiomas;
	
	@Min(value = 18, message = "Edad no valida.")
    @Max(value = 150, message = "Edad no valida.")
	@Positive(message = "Edad no valida.") 
	private int edad;

	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getOptativa() {
		return Optativa;
	}

	public void setOptativa(String optativa) {
		Optativa = optativa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
