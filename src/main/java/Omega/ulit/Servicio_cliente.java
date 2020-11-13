package Omega.ulit;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import Omega.Repocitorios.Repocitorio_Cliente;
import Omega.Servicios.ResponseDTO;
import Omega.dominio.Cliente;






@Service
public class Servicio_cliente {

	@Autowired
	Repocitorio_Cliente Clientedb;
public Map<String, Object>listar(){
		
		Map<String, Object>model= new HashMap<>();
		
		try {
			ResponseDTO clienteList=Clientedb.listar();
		model.put("clienteList",clienteList.getRespuesta());
		}catch(Exception e) {
			model.put("err", "error");
			model.put("msg", "Error al extraer los datos si el problema persiste contacte al admin");
			e.printStackTrace();
			
			
		}
		
		return model;
}
		
		public Map<String, Object>crear(Cliente Clientes){
			Map<String, Object>model = new HashMap<>();
			
			try {
				ResponseDTO res= Clientedb.crear(Clientes);
			
			}
			catch(HttpStatusCodeException e) {
				
				model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
				e.printStackTrace();
				
		}
			return model;
		}
		
		public Map<String, Object>actualizar(Cliente Clientes){
			Map<String, Object>model = new HashMap<>();
			try {
				ResponseDTO res= Clientedb.actualizar(Clientes);
		}catch(HttpStatusCodeException e) {
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
			
			
		}
			return model;
	
}
		public Map<String, Object>borrar(Long id){
			Map<String, Object>model = new HashMap<>();
			try {
				Clientedb.borrar(id);
				
			}
			catch(HttpStatusCodeException e) {
				model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
				e.printStackTrace();
				
				
			}
			return model;
     }
		
}
