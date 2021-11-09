package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        variosParametros("juan", 8 , 9 , 10);
    }
    //metodo para pasar por parametros nombre(String) y numeros(int)
     private static void variosParametros(String nombre,int... numeros){
         System.out.println("nombre: " + nombre);
         imprimirNumeros(numeros);
     }
    //metodo para imprimir por parametro numeros (numeros) y un ciclo(for) para cargaro los parametos en un arrreglo
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elementos: " + numeros[i]);
            
        }
    }
    
}
