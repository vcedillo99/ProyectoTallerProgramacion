/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Deportista;

/**
 *
 * @author Grey Cedillo
 */
public class GestionReportes {
    // Reporte 1: Deportistas beneficiados por año y nivel de PAD
    public static void reporteDeportistasPorAnioYNivelPAD() {
        System.out.println("\n--------------------------------------------");
        System.out.println("Reporte: Deportistas por Anio y Nivel de PAD");
        System.out.println("--------------------------------------------");
        Deportista[] deportistas = GestionDeportistas.getDeportistas();
        int contador = GestionDeportistas.getContador();
//        System.out.println("deportistas" + deportistas);
//        System.out.println("contador" + contador);

        // Obtener todos los años y niveles únicos
        int[] anios = new int[contador];
        String[] nivelesPAD = new String[contador];
        int anioCount = 0, nivelCount = 0;

        for (int i = 0; i < contador; i++) {
            int anio = deportistas[i].getAnio();
            String nivel = deportistas[i].getNivel();

            // Añadir año si no existe
            if (!existeEnArray(anios, anio, anioCount)) {
                anios[anioCount++] = anio;
            }

            // Añadir nivel si no existe
            if (!existeEnArray(nivelesPAD, nivel, nivelCount)) {
                nivelesPAD[nivelCount++] = nivel;
            }
        }

        // Contar deportistas por año y nivel
        for (int i = 0; i < anioCount; i++) {
            if(i != 0) System.out.println("");
            System.out.println("Anio: " + anios[i]);
            for (int j = 0; j < nivelCount; j++) {
                int count = 0;
                for (int k = 0; k < contador; k++) {
                    if (deportistas[k].getAnio() == anios[i] && deportistas[k].getNivel().equals(nivelesPAD[j])) {
                        count++;
                    }
                }
                if (count > 0) {
                    System.out.println("  Nivel PAD: " + nivelesPAD[j] + " -> " + count + " deportistas");
                }
            }
        }
        System.out.println("--------------------------------------------");
    }
    
    private static boolean existeEnArray(int[] array, int valor, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }

    private static boolean existeEnArray(String[] array, String valor, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i].equals(valor)) {
                return true;
            }
        }
        return false;
    }
}
