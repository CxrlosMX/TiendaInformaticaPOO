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
public class Ordenador extends Aparato {

    private String procesador;
    private int memoriaRam;
    private int capacidad;

    public Ordenador(String procesador, int memoriaRam, int capacidad, String codigoP, String nombre, double precio, int cantidadD) {
        super(codigoP, nombre, precio, cantidadD);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.capacidad = capacidad;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString()+", Procesador=" + procesador + ", Memoria Ram=" + memoriaRam + ", Disco Duro=" + capacidad ;
    }
    

}
