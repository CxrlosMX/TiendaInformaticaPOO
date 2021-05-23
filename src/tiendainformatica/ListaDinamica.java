/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendainformatica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 23/05/2021
 *
 */
public class ListaDinamica {

    private ArrayList<Aparato> lista;
    private int posicion;

    public ListaDinamica() {
        lista = new ArrayList<Aparato>();
        posicion = -1;
    }

    //Metodo para dar de alta a los productos 
    //Metodo para agregar Ordenadores
    public void addOrdenador(Ordenador o) {
        lista.add(o);
        posicion++;
    }

    //Metodo para agregar Telefonos
    public void addTelefono(Telefono t) {
        lista.add(t);
        posicion++;
    }

    //Metodo para dar de baja un producto 
    public void deleteProducto(String codigo) {
        int j = 0;
        boolean encontrado = false;
        int n = lista.size();
        for (int i = 0; i < n && !encontrado; i++) {
            if (lista.get(i).getCodigoP().equals(codigo)) {
                j = i;
                lista.remove(i);
                encontrado = true;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Se dio de baja el producto\n", "Producto dado de baja", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar, verifica que los campos introducidos sean correctos", "Error al dar de baja", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Metodo para consultar un producto
    public void consultaProducto(String codigo) {
        int j = 0;
        boolean encontrado = false;
        int n = lista.size();
        for (int i = 0; i < n && !encontrado; i++) {
            if (lista.get(i).getCodigoP().equals(codigo)) {
                j = i;
                encontrado = true;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, lista.get(j).toString(), "Mostrando Producto", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro ningun producto con ese codigo", "Error al buscar", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Metodo que realiza la ventana
    public void ventaProducto(String codigo, int cantidad) {
        int j = 0;
        boolean encontrado = false;
        int n = lista.size();
        for (int i = 0; i < n && !encontrado; i++) {
            if (lista.get(i).getCodigoP().equals(codigo)) {
                if (cantidad >= 0 && cantidad<=lista.get(i).getCantidadD() && lista.get(i).getCantidadD() > 0) {
                    lista.get(i).setCantidadD(lista.get(i).disponibles(cantidad));
                    j = i;
                    encontrado = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Piezas Insuficiente", "Insuficiente", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "El producto: " + lista.get(j).getNombre() + " fue vendido.\nPiezas Vendidas:" + cantidad
                    + "\nPiezas Disponibles: " + lista.get(j).getCantidadD(), "Producto vendido", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado, verifique el codigo", "Error al buscar el producto", JOptionPane.ERROR_MESSAGE);
        }

    }

    //Metodo para reponer producto
    public void reponerProducto(String codigo, int cantidad) {
        int j = 0;
        boolean encontrado = false;
        if (cantidad >= 0) {
            int n = lista.size();
            for (int i = 0; i < n && !encontrado; i++) {//
                if (lista.get(i).getCodigoP().equals(codigo)) {
                    lista.get(i).setReponer(cantidad);
                    j = i;
                    encontrado = true;
                }
            }//
            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Se repusieron " + cantidad + " piezas al producto: " + lista.get(j).getNombre()
                        + "\nPiezas: " + lista.get(j).getNombre() + ":" + lista.get(j).getCantidadD());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro ningun producto con el codigo", "Error de codigo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Introduce valores positivos", "Valores no validos", JOptionPane.ERROR_MESSAGE);

        }

    }

    //Metodo para mostrar todos los productos
    public void mostrarInventario() {
        System.out.println("*-*-*INVENTARIO-*-*-*");

        int n = lista.size();
        for (int i = 0; i < n; i++) {
            System.out.println(lista.get(i).toString());
        }
    }

}
