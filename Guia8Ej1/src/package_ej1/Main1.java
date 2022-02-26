/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package package_ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razasPerros = new ArrayList<>();
        String raza, opcion;
        opcion = "";
        boolean band=false;
        
        do {
            System.out.println("Ingrese una raza de perro:");
            raza = leer.next();
            razasPerros.add(raza);

            System.out.println("Desea ingresar otra raza? Presione S");
            System.out.println("Desea salir? Presione N");
            opcion = leer.next().toUpperCase();
        } while (opcion.equals("S"));
        for (String elemento : razasPerros) {
            System.out.println("Las razas son:");
            System.out.println(elemento);
        }
        System.out.println("Ingrese una raza para buscarla en la lista.");
        String buscarRaza=leer.next();
        Iterator<String> it=razasPerros.iterator();
        while (it.hasNext()) {
            if (it.next().equals(buscarRaza)) {
                it.remove();
                band=true;
            }
        }
        if (!band) {
            System.out.println("La raza no se encontró en la lista.");
        }
        
        for (String elemento : razasPerros) {
            System.out.println("Las razas son:");
            System.out.println(elemento);
        }
    }
}
    
