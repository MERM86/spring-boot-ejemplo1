package gnp.com.mx.crm.microservicios.personas.services.rest.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gnp.com.mx.crm.microservicios.personas.services.rest.ConsultaPersonas;

@RestController()
public class ConsultaPersonasImpl implements ConsultaPersonas{

	@RequestMapping("/ConsultaPersonasPorNombre")
	public String consultaPersonasPorNombre() {
		// TODO Auto-generated method stub
		return "consultaPersonasPorNombre";
		
	}

	@RequestMapping("/ConsultaPersonasPorId")
	public String consultaPersonasPorId() {
		// TODO Auto-generated method stub
		return "consultaPersonasPorId";
	}
	
 
}
