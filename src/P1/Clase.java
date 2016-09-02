package P1;

// Desarrollado por
// Vladimir Vargas Díaz
// Kevin Felipe Marroquín
// Germán David García Nieves
class primerPunto {

    public static void func1(){
        System.out.println("Segunda funcion");
    }
    
    public static void func2(){
        System.out.println("Tercera funcion");
    }
    
    public static void main(String[] args) {
        
        System.out.println("Primera funcion");
        func1();
        func2();
        System.out.println("Se termina main");
    }
}