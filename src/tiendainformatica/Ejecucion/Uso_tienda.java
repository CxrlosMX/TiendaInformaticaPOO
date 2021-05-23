/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendainformatica.Ejecucion;

import javax.swing.JOptionPane;
import tiendainformatica.ListaDinamica;
import tiendainformatica.Telefono;
import tiendainformatica.Ordenador;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 23/05/2021
 *
 */
public class Uso_tienda {

    public static void main(String args[]) {
        int op = 0, cantidad, p = 0, capacidad, memoria;
        double precio;
        String codigo, nombre, procesador, operador;
        ListaDinamica lista = new ListaDinamica();
        Telefono t;
        Ordenador o;

        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "*-*-MENU-*-*\n" + "1.-Dar de alta un Producto\n2.-Dar de baja un producto\n3.-Consultar un producto\n4.-Vender un producto\n5.-Reponer un producto\n6.-Mostrar Productos\n7.-Salir"
                        + "\nSelecciones una opción", "MENU", 3));
                switch (op) {
                    case 1: {
                        nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del Producto", "Introduciendo Nombre", 3);
                        codigo = JOptionPane.showInputDialog(null, "Introduce el codigo del producto", "Introduciendo codigo", JOptionPane.QUESTION_MESSAGE);
                        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el precio del Producto", "Introduciendo precio", JOptionPane.INFORMATION_MESSAGE));
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantida de piezas", "Introduciendo cantidad", JOptionPane.INFORMATION_MESSAGE));
                        p = Integer.parseInt(JOptionPane.showInputDialog(null, "Que producto desea agregar\n1.-Ordenador\n2.-Telefono", "Elige un producto", 3));
                        switch (p) {
                            case 1: {
                                procesador = JOptionPane.showInputDialog(null, "Introduce el Tipo de procesador", "Introduciendo el Procesador", JOptionPane.INFORMATION_MESSAGE);
                                capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la capacidad", "Introduciendo capacidad", JOptionPane.INFORMATION_MESSAGE));
                                memoria = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la capacidad de la memoria RAM", "Introduciendo la memoria RAM", JOptionPane.INFORMATION_MESSAGE));
                                o = new Ordenador(procesador, memoria, capacidad, codigo, nombre, precio, cantidad);
                                lista.addOrdenador(o);
                                break;
                            }
                            case 2: {
                                operador = JOptionPane.showInputDialog(null, "Introduce el operador", "Introduciendo operador", JOptionPane.INFORMATION_MESSAGE);
                                t = new Telefono(operador, codigo, nombre, precio, cantidad);
                                lista.addTelefono(t);
                                break;
                            }
                            default: {
                                JOptionPane.showMessageDialog(null, "Introduce valores correctos", "Introduce valores correctos", JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                        }
                        break;
                    }
                    case 2: {
                        codigo = JOptionPane.showInputDialog(null, "Introduce el codigo del producto", "Introduciendo codigo", JOptionPane.QUESTION_MESSAGE);
                        lista.deleteProducto(codigo);
                        break;
                    }
                    case 3: {
                        codigo = JOptionPane.showInputDialog(null, "Introduce el codigo del producto", "Introduciendo codigo", JOptionPane.QUESTION_MESSAGE);
                        lista.consultaProducto(codigo);
                        break;
                    }
                    case 4: {
                        codigo = JOptionPane.showInputDialog(null, "Introduce el codigo del producto", "Introduciendo codigo", JOptionPane.QUESTION_MESSAGE);
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantida de piezas", "Introduciendo cantidad", JOptionPane.INFORMATION_MESSAGE));
                        lista.ventaProducto(codigo, cantidad);
                        break;
                    }
                    case 5: {
                        codigo = JOptionPane.showInputDialog(null, "Introduce el codigo del producto", "Introduciendo codigo", JOptionPane.QUESTION_MESSAGE);
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantida de piezas", "Introduciendo cantidad", JOptionPane.INFORMATION_MESSAGE));
                        lista.reponerProducto(codigo, cantidad);
                        break;
                    }
                    case 6: {
                        lista.mostrarInventario();
                        break;
                    }
                    case 7: {
                        JOptionPane.showMessageDialog(null, "Cerrando sesion", "Saliendo del programa", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Introduce valores correctos", "Error de datos", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } while (op != 7);
    }

}
