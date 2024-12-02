/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Deportista;
import Modelo.LugarNacimiento;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Grey Cedillo
 */
public class GestionDeportistas {
    private static Deportista[] deportistas = new Deportista[10];
    private static int contador = 0;
    private static final int FACTOR_INCREMENTO = 10;

    public static Deportista[] getDeportistas() {
        return deportistas;
    }

    public static int getContador() {
        return contador;
    }
    
    public static void agregarDeportista(Deportista deportista) {
        if (contador >= deportistas.length) {
            expandirArray();
        }
        deportistas[contador++] = deportista;
    }
    
    private static void expandirArray() {
        Deportista[] nuevoArray = new Deportista[deportistas.length + FACTOR_INCREMENTO];
        System.arraycopy(deportistas, 0, nuevoArray, 0, deportistas.length);
        deportistas = nuevoArray;
    }
    
    public static void cargarDesdeCSV(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea = "";
            br.readLine(); // Saltar la cabecera
            while ((linea = br.readLine()) != null) {
//                System.out.println("linea leida:" + linea);
                String[] datos = linea.split(";"); // Separar por comas
                Deportista deportista = new Deportista(
                    datos[7], // Nombres
                    datos[5], // Paterno
                    datos[6], // Materno
                    datos[4], // Federación
                    datos[11], // País
                    Integer.parseInt(datos[2]), // Año
                    datos[8], // PAD
                    datos[9], // Nivel
                    Double.parseDouble(datos[10]), // Monto
                    new LugarNacimiento(datos[12], datos[13], datos[14]) // Lugar de nacimiento
                );
                agregarDeportista(deportista);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }
    
    public static Deportista buscarDeportista(String nombres, String paterno, String materno) {
        for (int i = 0; i < contador; i++) {
            Deportista deportista = deportistas[i];
            if (deportista.getNombres().equalsIgnoreCase(nombres) &&
                deportista.getPaterno().equalsIgnoreCase(paterno) &&
                deportista.getMaterno().equalsIgnoreCase(materno)) {
                return deportista;
            }
        }
        return null; // Si no se encuentra el deportista
    }
}
