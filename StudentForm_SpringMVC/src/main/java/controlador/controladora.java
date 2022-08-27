package controlador;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import modelo.estudiante;

@Controller
public class controladora {

	
	
	@InitBinder
	public void mibinder(WebDataBinder binder) {
		StringTrimmerEditor nopermitirespacios = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, nopermitirespacios);
	}
	
	
	@RequestMapping
	public String formulario(Model modelo) {
		
		estudiante e = new estudiante();
		modelo.addAttribute("estudiante", e);
		return "formulario";
	}
	
	@RequestMapping("mostrardetalles")
	public String mostrardetalles(@Valid @ModelAttribute("estudiante") estudiante e, BindingResult resultadovalidacion) {
		if (resultadovalidacion.hasErrors()) {
			return "formulario";
		}else {
		return "mostrardetalles";
		}
		}
	}
