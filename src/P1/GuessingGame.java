// Desarrollado por
// Vladimir Vargas Díaz
// Kevin Felipe Marroquín
// Germán David García Nieves
package P1;

import java.util.Scanner; 

public class GuessingGame {
    private int guess;
    
    public void GuessingGame(){
     
        
        int answer = (int)Math.floor((Math.random()*100)+1);
        Scanner input = new Scanner(System.in);
        int intentos = 0;
        boolean gano = false;
       
       
        while (gano == false){
            
            System.out.println("Adivina un numero de 1 a 100 😀!!");
            guess = input.nextInt();
            intentos++;
            
            if(intentos==7){
                System.out.println("Haz excedido el numero de intentos, lo siento :C");
                System.out.println("El numero era: " + answer);
                gano = true;
            }
            else if(guess < answer){
                System.out.println("Tu intento es muy bajo :C  ");
            }
            else if (guess > answer){
                System.out.println("Tu intento es muy alto :C  ");
            }else if (guess == answer){
                System.out.println("Es correcto ganaste!! :D !!");
                gano = true;
            }
                
        }
                

        /*while(intentos<7);
        
            System.out.println("Haz excedido el numero de intentos, lo siento :C");
            System.out.println("El numero era: " + answer);
        */
    }
    
    public static void main(String[] args) {
        
        GuessingGame game = new GuessingGame();
        game.GuessingGame();
        
        System.out.println("Quieres jugar de nuevo? S/N");
        Scanner resp = new Scanner(System.in);
        String respta = resp.nextLine();
        while(respta.contains("S")||respta.contains("s")){
            System.out.println("------------------------------------------");
            System.out.println("Perfecto!! aqui va de nuevo");
            System.out.println("Suerte!!");
            game.GuessingGame();
        }
        
    }
    
}