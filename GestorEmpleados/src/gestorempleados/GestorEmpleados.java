/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorempleados;

import java.util.ArrayList;
import java.util.List;


public class GestorEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear algunos empleados
        Empleado empleado1 = new Empleado("Juan", 2500, "Ventas");
        Empleado empleado2 = new Empleado("María", 3000, "Ventas");
        Empleado empleado3 = new Empleado("Carlos", 2800, "Tecnología");

        // Crear algunos departamentos
        Departamento ventas = new Departamento("Ventas");
        Departamento tecnologia = new Departamento("Tecnología");

        // Agregar empleados a los departamentos
        ventas.agregarEmpleado(empleado1);
        ventas.agregarEmpleado(empleado2);
        tecnologia.agregarEmpleado(empleado3);

        // Mostrar los empleados de cada departamento
        ventas.mostrarEmpleados();
        tecnologia.mostrarEmpleados();
    }
    
}
