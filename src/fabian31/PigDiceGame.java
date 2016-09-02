/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Desarrollado por
// Vladimir Vargas Díaz
// Kevin Felipe Marroquín
// Germán David García Nieves
package fabian31;

import java.util.Random;
import java.util.Scanner;

public class PigDiceGame {
    
    static Random random = new Random();
    
    public static void main(String[] args) {
        
        int contadorJugador = 0;
        int contadorPc = 0;
        int numGanador = 100;
        int turnoJugador = 1;
        int turnoPc = 1;
        
        
        
                    
            Scanner jugador = new Scanner(System.in);
            int a = random.nextInt(6)+1;  
            System.out.println("Presione 1 para lanzar \n Presione 2 para ceder");
            int x = jugador.nextInt();  
            while(contadorJugador <= 100){
            switch (x){   
                case 1:               
              if(x == 1){
                  System.out.println(a);
                  contadorJugador = contadorJugador+a;
                  System.out.println("Contador parcial Jugador: " + contadorJugador);
            } break;
                case 2:
                  if(x == 2 && contadorPc <= 100){
                  System.out.println("Turno de la pc: \n"+ a);
                  contadorPc = contadorPc + a;
                  System.out.println("Contador parcial Pc: " + contadorPc);
                  }    break;
            }
          } 
                
    }
}
