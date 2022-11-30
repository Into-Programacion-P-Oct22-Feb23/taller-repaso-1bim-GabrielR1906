/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerrepaso;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Tallerrepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int cedula;
        double horasm;
        double horasn;
        String ciudad;
        boolean bandera = true;
        double totalm;
        double totaln;
        String mensaje = "";
        double adicional;
        double total;
        double subtotal;
        int numeroempleados = 0;
        String opcion;
        double segurosocial;

        while (bandera == true) {
            System.out.println("Ingrese nombre del empleado:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese numero de cedula del empleado:");
            cedula = entrada.nextInt();

            System.out.println("Ingrese numero de horas matutinas trabajadas:");
            horasm = entrada.nextDouble();

            System.out.println("Ingrese numero de horas nocturnas trabajadas:");
            horasn = entrada.nextDouble();

            System.out.println("Ingrese la ciudad de la empresa:");
            entrada.nextLine();
            ciudad = entrada.nextLine();

            totalm = horasm * 10;
            totaln = horasn * 15;
            subtotal = totalm + totaln;
            
            if (horasn >= 10) {
                adicional = totaln * 0.10;
                totaln = totaln + adicional;
            }
            segurosocial = (totaln + totalm) * 0.18;
            total = (totaln + totalm) - segurosocial;
            
            mensaje = mensaje + "Rol del trabajador de nombre " + nombre
                    + " y cedula " + cedula + ".\n\t" + "Horas matutinas "
                    + "trabajadas: " + horasm + ".\n\t" + "Horas nocturnas"
                    + " trabajadas: " + horasn + ".\n\t" + "Subtotal: $" 
                    + subtotal + "\n\tSeguro social $" + segurosocial + "\n\t"
                    + "Total a cancelar $" + total + "\n\n";
            
            numeroempleados = numeroempleados + 1;
            
            System.out.println("Ingrese la letra s para terminar");
            opcion = entrada.nextLine();
            if (opcion.equals("s")) {
                bandera = false;
            }
        }
        System.out.println("\nNómina de Trabajadores\n\n" + mensaje + "Número de "
                + "empleados " + numeroempleados + "\n");
    }

}
