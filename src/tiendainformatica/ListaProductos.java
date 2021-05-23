/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendainformatica;

import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 21/05/2021
 *
 */
public class ListaProductos {

    private Aparato arreglo[];

    public ListaProductos() {
        arreglo = new Aparato[4];
    }

    public ListaProductos(int size) {
        arreglo = new Aparato[size];
    }

    //Metodo para dar de alta un producto dentro de la tienda
    //Ordenador
    public void addOrdenador(Telefono o) {
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length && !encontrado; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = o;
                encontrado = true;
            }

        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Ordenador agregado correctamente", "Agregado", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    //Telefono
    public void addTelefono(Ordenador t) {
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length && !encontrado; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = t;
                encontrado = true;
            }

        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Ordenador agregado correctamente", "Agregado", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    //Metodo para dar de baja a los productos
    public void bajaProducto(String codigo) {
        int c = 0;
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length && !encontrado; i++) {
            if (arreglo[i] != null) {
                if (arreglo[i].getCodigoP().equals(codigo)) {
                    c = i;
                    arreglo[i] = null;
                    encontrado = true;
                }
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Se dio de baja  el producto:\n" + arreglo[c].getNombre(), "Dado de baja", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el producto", "Error al buscar", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Metodo para realiar la consulta de un producto por codigo
    public void consultaPro(String codigo) {
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length && !encontrado; i++) {
            if (arreglo[i] != null) {
                if (arreglo[i].getCodigoP().equals(codigo)) {
                    System.out.println("*---PRODUCTO---*\n" + arreglo[i].toString());
                    encontrado = true;
                }

            }
        }
    }

    //Metodo para la realizacion de una venta de un productos
    public void ventaProducto(String codigo, int cantidad) {
        int d = 0, c = 0;
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length && !encontrado; i++) {
            if (arreglo[i] != null) {
                if (arreglo[i].getCodigoP().equals(codigo)) {
                    if ( cantidad <= arreglo[i].getCantidadD()) {
                    
                        c = i;
                        d = arreglo[i].getCantidadD() - cantidad;
                        arreglo[i].setCantidadD(d);
                        encontrado = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Piezas Insuficientes", "Piesas Insuficioentes", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "El producto:\n" + arreglo[c].getNombre() + " fue vendido\nPiezas disponibles: " + d, "Producto Vendido", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Metodo para reponer producto
    public void reponerProductos(String codigo, int cantidad) {
        boolean encontrado = false;
        int c = 0;
        for (int i = 0; i < arreglo.length && !encontrado; i++) {
            if (arreglo[i] != null) {
                if (arreglo[i].getNombre().equals(codigo)) {
                    if (cantidad > 0) {
                        c = i;
                        arreglo[i].setReponer(cantidad);
                        encontrado = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Debes introducir valores mayores a 0 por favor", "Error de valores", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Se agregó  la cantidad de " + cantidad + " al producto " + arreglo[c].toString()
                    + "\nPiezas Disponibles " + arreglo[c].getCantidadD(), "Se agrego piezas", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
