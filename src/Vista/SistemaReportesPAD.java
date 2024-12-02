/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestionDeportistas;
import Controlador.GestionReportes;
import java.util.Scanner;

/**
 *
 * @author Grey Cedillo
 */
public class SistemaReportesPAD {
    
    private Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestionDeportistas.cargarDesdeCSV("DataDeportistasBeneficiadosPAD.csv");
        SistemaReportesPAD sistema = new SistemaReportesPAD();
        sistema.menu();
    }
    
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n============ SISTEMA DE REPORTES ============");
            System.out.println("1. Reporte: Deportistas por Anio y Nivel de PAD");
            System.out.println("2. Reporte: Deportistas por Lugar de Nacimiento");
            System.out.println("3. Reporte: Evolución Anio a Anio de Beneficiados");
            System.out.println("4. Reporte: Subvenciones Totales por Region");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: \n");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    GestionReportes.reporteDeportistasPorAnioYNivelPAD();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema. ¡Gracias!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }
    
}
