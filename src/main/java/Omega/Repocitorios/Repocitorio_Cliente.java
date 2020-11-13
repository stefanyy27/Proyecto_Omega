package Omega.Repocitorios;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import Omega.Servicios.ResponseDTO;
import Omega.dominio.Cliente;



@FeignClient(url="http://192.168.56.1:8090", name="clientes")
public interface Repocitorio_Cliente {
	@GetMapping(path="/Clientes", produces="application/json")
	ResponseDTO listar();
	
	@PostMapping(path="/Clientes", produces="application/json")
	ResponseDTO crear(@RequestBody Cliente clientes );
	
	@PutMapping(path="/Clientes", produces="application/json")
	ResponseDTO actualizar(@RequestBody Cliente clientes);
	
	@DeleteMapping(path="/Clientes/{id}", produces="application/json")
	ResponseDTO borrar(@RequestParam Long id);
}
