package Omega.dominio;

import java.sql.Date;

public class Cliente {
	private Long idCliente;
    private String nombreCliente  ;
    private String  apellidoCliente  ;
    private  String direccionCliente ; 
    private String  emailCliente ;
    private String  duicliente ; 
    private Date  fechaNacimiento ; 
	
	public Cliente() {}
		
	public Cliente(Long idCliente, String nombreCliente , String apellidoCliente , String direccionCliente , 
			String emailCliente , String duicliente , Date fechaNacimiento) {
	
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.direccionCliente = direccionCliente;
		this.emailCliente = emailCliente;
		this.duicliente = duicliente;
		this.fechaNacimiento = fechaNacimiento;
		
		}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getDUICliente() {
		return duicliente;
	}

	public void setDUICliente(String dUICliente) {
		duicliente = dUICliente;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
	
}
