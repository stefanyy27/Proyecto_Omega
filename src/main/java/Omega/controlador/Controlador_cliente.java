package Omega.controlador;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Omega.dominio.Cliente;
import Omega.ulit.Servicio_cliente;



@Controller
@RequestMapping("/Clientes")
public class Controlador_cliente {
	@Autowired
	Servicio_cliente Cliente_servicio;
	
	@GetMapping
	public String list(Model vista) {
		Map<String, Object> modelo= new HashMap<>();
		modelo=(Cliente_servicio.listar());
		vista.addAttribute("cliente",modelo.get("clienteList"));
		return "Clientes";
	
}
	@GetMapping("/crear")
	public String redirectcrear(Model model) {
		model.addAttribute("crearCliente", new Cliente());
		return "CrearCliente";
	}
	@PostMapping
	public String crear(@ModelAttribute ("crearCliente")Cliente Clientes ) {
		Cliente_servicio.crear(Clientes);
		return "redirect:/Clientes";
		
	}
	@GetMapping("/actualizar")
	public String redirectact(Model model) {
		model.addAttribute("actCliente",new Cliente());
		return "ActCliente";
		
	}
	@PostMapping("/update")
	public String actualizar(@ModelAttribute ("actCliente") Cliente Clientes){
		return "redirect:/Clientes";
	}
	@PostMapping("/delete/{id}")
	public String borrar(@PathVariable("id") Long id) {
		Cliente_servicio.borrar(id);
		return "redirect:/Clientes";
	}
		
	} 

		
