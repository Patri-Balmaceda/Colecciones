package package_ej3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Alumno> arrayAlumnos = new ArrayList<>();
        String nombreAlumno;

        String opcion = "";
        int nota;

        do {
            System.out.println("ingrese el nombre del alumno");
            nombreAlumno = leer.next();
            ArrayList<Integer> listaNotas = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese nota " + (i + 1) + " ");
                nota = leer.nextInt();
                listaNotas.add(nota);
            }
            Alumno alumnoNuevo = new Alumno(nombreAlumno, listaNotas);
            arrayAlumnos.add(alumnoNuevo);
            
            System.out.println("Desea salir? S/N");
            if (leer.next().equalsIgnoreCase("S")) {

                break;
            }
        } while (true);

        System.out.println("Ingrese el nombre del alumno a buscar");
        String nombreAbuscar = leer.next();
        for (Alumno var : arrayAlumnos) {
            if (nombreAbuscar.equalsIgnoreCase(var.getNombre())) {
                var.notaFinal();
            }
        }

    }

}
/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en la clase Alumno:

Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
