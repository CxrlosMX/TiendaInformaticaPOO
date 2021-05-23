/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendainformatica;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 21/05/2021
 *
 */
public class Aparato {

    //Clase padre
    private String codigoP;
    private String nombre;
    private double precio;
    private int cantidadD;
    private int contador;

    public Aparato(String codigoP, String nombre, double precio, int cantidadD) {
        this.codigoP = codigoP;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadD = cantidadD;
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadD() {
        return cantidadD;
    }

    public void setCantidadD(int cantidadD) {
        this.cantidadD = cantidadD;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    //Metodo para realizar resta de la cantidad de productos
    public int disponibles(int n) {
        return this.cantidadD - n;
    }

    //Metodo para reponer producto 

    public void setReponer(int n) {
        this.cantidadD += n;
    }

    @Override
    public String toString() {
        return "Codigo del Producto=" + codigoP + ", Nombre =" + nombre + ", Precio=" + precio + ",Cantidad Disponible=" + cantidadD;
    }

}
