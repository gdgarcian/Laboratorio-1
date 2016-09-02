// Desarrollado por
// Vladimir Vargas Díaz
// Kevin Felipe Marroquín
// Germán David García Nieves
package fabian30;

import java.util.Random;
import java.util.Scanner;

public class P2a {

    
    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int f,g,h;
        int acumulado = 0;
        //CREAR OBJERO DE Random PARA SACAR NÚMEROS ALEATORIOS
        Random aleatorios = new Random();
        int a = aleatorios.nextInt(9);
        int b = aleatorios.nextInt(9);
        int c = aleatorios.nextInt(9);
        //PEDIR DATOS DESDE CONSOLA
        Scanner usuario = new Scanner(System.in);
        System.out.println("Ingrese sus números a ganar: " );
        f = usuario.nextInt(); 
        g = usuario.nextInt();
        h = usuario.nextInt();
        
        //DAR UN PUNTO POR CADA NÚMERO ACERTADO        
        if(f == a || f == b || f == c){
            acumulado++;            
        }if(g == a || g == b || g == c){
            acumulado++;            
         }if(h == a || h == b || h == c){
            acumulado++;      
          }
               
        //ACÁ SE DETERMINA QUE NO SALGA EL ERROR DEL ÚLTIMO PÁRRAFO DE LA DESCRIPCIÓN DEL EJERCICIO
        if((f == g && g == h)&&(a != b || b != c || a != c)){
         acumulado = acumulado-1;   
        }if((f == g && g == h)&&(a != b && b != c && a != c)){
         acumulado = acumulado-1;   
         }
        if((f == g && g == h)&&(a == b || b == c || a == c)){
            acumulado ++;
        }
        if((f == g || g == h || f == h)&&(a != b || b != c || a != c)){
            acumulado--;
        }  
        if((f == g || g == h || f == h)&&(a == b || b == c || a == c)){
            acumulado++;
        }  
        if((f == g && g == h)&&(f != a && f != b && f != c)){
            acumulado = 0;
        }
        if(f == a && g == b && h == c){
            acumulado ++;
        }
        //SE IMPRIMEN LOS NÚMEROS ALEATORIOS
        System.out.println("Números ganadores:  " + a + "  " + b + "  " + c);
        //SE COMPARAN LOS DATOS INGRESADOS CON LOS DATOS GENERADOS ALEATORIAMENTE Y SE OTORGA 
        //1 PUNTO POR CADA NÚMERO ACERTADO, Y UN PUNTO EXTRA POR ACERTAR LOS TRES EN ORDEN        
        System.out.println("Los puntos que ha ganado son "+ acumulado);      
    }    
}