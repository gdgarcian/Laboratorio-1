
package fabian32;

import java.util.Scanner;


public class DailyLifeMag {
    
        
    
    
    public static void main (String [] args){             
    int age; 
    String gender;
    String maritalStats;
    int AIR;
             
        Scanner usuario = new Scanner(System.in);
        System.out.print("Ingrese la edad del encuestado 1: "); int a = usuario.nextInt(); 
        System.out.println("Ingrese le género del encuestado: Presione 1 si es Hombre o 2 si es Mujer: "); int b = usuario.nextInt();
        if (b == 1){
            gender = "Masculino";
        }else gender = "Femenino";
        System.out.println(gender);
        System.out.println("¿Es el encuestado casado? 1 para sí, 2 para no: ");  int c = usuario.nextInt();
        if(c == 1){
            maritalStats = "Casado";
        }else maritalStats = "No casado";
        System.out.println(maritalStats);
        System.out.println("El salario anual del encuestado es de: "); int d = usuario.nextInt();
        int Ec1[]={a,b,c,d};
        System.out.println(Ec1[0]+"  "+ Ec1[1]+"  "+ Ec1[2]+"  "+ Ec1[3]);
        System.out.println("\n \n");
        
        System.out.print("Ingrese la edad del encuestado 2: "); int e = usuario.nextInt(); 
        System.out.println("Ingrese le género del encuestado: Presione 1 si es Hombre o 2 si es Mujer: "); int f = usuario.nextInt();
        if (f == 1){
            gender = "Masculino";
        }else gender = "Femenino";
        System.out.println(gender);
        System.out.println("¿Es el encuestado casado? 1 para sí, 2 para no: ");  int g = usuario.nextInt();
        if(g == 1){
            maritalStats = "Casado";
        }else maritalStats = "No casado";
        System.out.println(maritalStats);
        System.out.println("El salario anual del encuestado es de: "); int h = usuario.nextInt();
        int Ec2[]={e,f,g,h};
        System.out.println(Ec2[0]+"  "+ Ec2[1]+"  "+ Ec2[2]+"  "+ Ec2[3]);
        System.out.println("\n \n");
        
        System.out.print("Ingrese la edad del encuestado 3: "); int i = usuario.nextInt(); 
        System.out.println("Ingrese le género del encuestado: Presione 1 si es Hombre o 2 si es Mujer: "); int j = usuario.nextInt();
        if (j == 1){
            gender = "Masculino";
        }else gender = "Femenino";
        System.out.println(gender);
        System.out.println("¿Es el encuestado casado? 1 para sí, 2 para no: ");  int k = usuario.nextInt();
        if(k == 1){
            maritalStats = "Casado";
        }else maritalStats = "No casado";
        System.out.println(maritalStats);
        System.out.println("El salario anual del encuestado es de: "); int l = usuario.nextInt();
        int Ec3[]={i,j,k,l};
        System.out.println(Ec3[0]+"  "+ Ec3[1]+"  "+ Ec3[2]+"  "+ Ec3[3]);
        
        int acumulado = 0;
        if(a < 20) {
            acumulado++;
        }
        if(e < 20) {
            acumulado++;
        }
        if(i < 20) {
            acumulado++;
        }
        System.out.println("\n  Hay "+ acumulado + " personas menores a 20 años");
        int acumulado2 = 0;
        if(20 < a && a < 40) {
            acumulado2++;
        }
        if(20 < e && e < 40) {
            acumulado2++;
        }
        if(20 < i && i < 40) {
            acumulado2++;
        }
        System.out.println("Hay "+ acumulado2 + " personas entre 20 años y 40 años");
        int acumulado3 = 0;
        if(a > 40) {
            acumulado3++;
        }
        if(e > 40) {
            acumulado3++;
        }
        if(i > 40) {
            acumulado3++;
        }
        System.out.println("Hay "+ acumulado3 + " personas mayores a 40 años");
        System.out.println("\n \n");
        
        int acumulado4 = 0;
        if(b == 1 && a < 20) {
            acumulado4++;
        }
        if(f == 1 && e < 20) {
            acumulado4++;
        }
        if(j == 1 && i < 20) {
            acumulado4++;
        }
        int acumulado5 = 0;
        if(b == 2 && a < 20) {
            acumulado5++;
        }
        if(f == 2 && e < 20) {
            acumulado5++;
        }
        if(j == 2 && i < 20) {
            acumulado5++;
        }
        System.out.println("Hay "+ acumulado4 + " Hombres menores a 20 años");
        System.out.println("Hay "+ acumulado5 + " Mujeres menores a 20 años");
        System.out.println("\n \n");
        
        
        int acumulado6 = 0;
        if(d < 30000) {
            acumulado6++;
        }
        if(h < 30000) {
            acumulado6++;
        }
        if(l < 30000) {
            acumulado6++;
        }
        System.out.println("Hay "+ acumulado6 + " personas que ganan menos de 30000 anuales");
        
        int acumulado7 = 0;
        if(d > 30000) {
            acumulado6++;
        }
        if(h > 30000) {
            acumulado6++;
        }
        if(l > 30000) {
            acumulado6++;
        }
        System.out.println("Hay "+ acumulado7 + " personas que ganan más de 30000 anuales");
        
    }
}
