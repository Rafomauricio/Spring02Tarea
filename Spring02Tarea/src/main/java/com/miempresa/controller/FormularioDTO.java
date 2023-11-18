package com.miempresa.controller;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.AssertTrue;

public class FormularioDTO {

	@NotNull(message = "Por favor, seleccione el tipo de documento")
    @NotBlank(message = "Por favor, seleccione el tipo de documento")
    private String tipoDocumento;
	
    @NotBlank(message = "El número de documento no puede estar en blanco")
    private String numeroDocumento;

    @NotBlank(message = "El apellido paterno no puede estar en blanco")
    private String apellidoPaterno;

    @NotBlank(message = "El apellido materno no puede estar en blanco")
    private String apellidoMaterno;

    @NotBlank(message = "El nombre no puede estar en blanco")
    private String nombres;

    @NotNull(message = "Por favor, seleccione la fecha de nacimiento")
    @NotBlank(message = "Por favor, seleccione la fecha de nacimiento")
    private String fechaNacimiento;
    
    
    @NotBlank(message = "Por favor, seleccione el sexo")
    private String sexo;
    
    
    @NotBlank(message = "Por favor, seleccione el estado civil")
    private String estadoCivil;

    
    @NotBlank(message = "Por favor, seleccione la situación laboral")
    private String situacionLaboral;


    @Pattern(regexp = "\\d{11}", message = "El RUC del empleador debe contener 11 dígitos")
    private String rucEmpleador;

    @AssertTrue(message = "Debe aceptar los términos y condiciones")
    private Boolean terminosYCondiciones;

    // Getters y Setters

    public Object getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Object tipoDocumento) {
        this.tipoDocumento = (String) tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSituacionLaboral() {
        return situacionLaboral;
    }

    public void setSituacionLaboral(String situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

    public String getRucEmpleador() {
        return rucEmpleador;
    }

    public void setRucEmpleador(String rucEmpleador) {
        this.rucEmpleador = rucEmpleador;
    }

    public Boolean getTerminosYCondiciones() {
        return terminosYCondiciones;
    }

    public void setTerminosYCondiciones(Boolean terminosYCondiciones) {
        this.terminosYCondiciones = terminosYCondiciones;
    }
}

