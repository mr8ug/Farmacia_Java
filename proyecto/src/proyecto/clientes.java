/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

public class clientes 
{
    private String nit, cui, nombre, apellido, edad, direccion, fecha;    
    private int numdecompra;
    private double consumo;
    
    
     public clientes (String nit, String cui, String nombre, String apellido, String edad, String direccion, String fecha, double consumo, int numdecompra)
     {
        this.nit = nit;
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.fecha = fecha;
        this.consumo = consumo;
        this.numdecompra=numdecompra;
        
    }

    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public int getNumdecompra() {
        return numdecompra;
    }

    public void setNumdecompra(int numdecompra) {
        this.numdecompra = numdecompra;
    }
        
    
    
        public String toString() {
        return nombre+" "+apellido;
        
    }    
}
