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
public class Telefono extends Aparato {

    private String operador;

    public Telefono(String operador, String codigoP, String nombre, double precio, int cantidadD) {
        super(codigoP, nombre, precio, cantidadD);
        this.operador = operador;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return super.toString() + ", Compañia Telefonica=" + operador;
    }

}
