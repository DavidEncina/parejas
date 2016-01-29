import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Clase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase
{
    // Almacena los alumnos.
    private ArrayList<String> alumnos;
    // Almacena las parejas.
    private ArrayList<String> parejas;

    /**
     * Constructor for objects of class Clase
     */
    public Clase()
    {
        alumnos = new ArrayList<String>();
        alumnos.add("Adeva Tranche, Adrián");
        alumnos.add("Aller González, Francisco Javier");
        alumnos.add("Álvarez Prieto, Noelia");
        alumnos.add("Barrionuevo Pérez, Manuel");
        alumnos.add("Bóveda del Río, José Antonio");
        alumnos.add("de la Viuda Crespo, Ignacio");
        alumnos.add("Encina Maestro, David");
        alumnos.add("Felix Nañez, Kevin");
        alumnos.add("Fernández Diez, Daniel");
        alumnos.add("Fernández González, Javier");
        alumnos.add("Fernández Rincón, Jesús");
        alumnos.add("Fuentes Álvarez, Francisco José");
        alumnos.add("García Juárez, David");
        alumnos.add("García Serrano, Rubén");
        alumnos.add("González Álvarez, David");
        alumnos.add("López Beltrán, Víctor");
        alumnos.add("Lora García, Sandra");
        alumnos.add("Melcón Diez, Víctor");
        alumnos.add("Menéndez Pouso, Francisco José");
        alumnos.add("Pérez Bayón, Álvaro");
        alumnos.add("Pradera San José, Daniel");
        alumnos.add("Prieto Mediavilla, Gabriel");
        alumnos.add("Robles González, Miguel Ángel");
        alumnos.add("Sánchez Manzano, Adán");
        alumnos.add("Serrano García, Verónica");
        alumnos.add("Tascón González, Anibal");
    }

    /**
     * Empareja a los alumnos de la clase de forma aleatoria y muestre dichas parejas por pantalla asignándoles un número identificativo único de 4 cifras.
     */
    public void emparejaAlumnos()
    {
        Collections.shuffle(alumnos);
        parejas = new ArrayList<String>();
        int index = 0;
        int numero = 1111;        
        if (alumnos.size() > 2) {
            if (alumnos.size() % 2 != 0) {           
                String alumno = alumnos.get(index);                
                index++;        
                String alumno2 = alumnos.get(index);
                index++; 
                String pareja = new String();
                String alumno3 = alumnos.get(index);
                index++; 
                pareja = "Pareja numero " + numero + ": " + alumno + " ---- " + alumno2 + " ---- " + alumno3;
                System.out.println(pareja);
                parejas.add(pareja);
                numero++;
            }

            while (index < alumnos.size()) {            
                String alumno = alumnos.get(index);
                index++;        
                String alumno2 = alumnos.get(index);        
                String pareja = new String();      
                pareja = "Pareja numero " + numero + ": " + alumno + " ---- " + alumno2;
                parejas.add(pareja);
                numero++;
                System.out.println(pareja);
                parejas.add(pareja);
                index++;        
            }
        }
    }
    
//     /**
//      * Introduciendo un código el programa devuelve devolver el nombre de los integrantes de la pareja (o trío) correspondiente a dicho código.
//      */
//     public String devuelveParejas(int codigoPareja)
//     {
//         for (String codigo : parejas) {
//             
//         }
//         return
//     }
}
