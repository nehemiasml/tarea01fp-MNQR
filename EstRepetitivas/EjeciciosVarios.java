package EstRepetitivas;

import java.util.Scanner;

/**
 * EjeciciosVarios
 */
public class EjeciciosVarios {
    static Scanner leerT= new Scanner(System.in);
    
    public static long factorialN(int numero) {
        long resultado=1;
        if (numero>1) {
            for (int i = 1; i <= numero; i++) {
                resultado=resultado*i;
                
            }    
            }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("ingrese un numero:");
        int num=leerT.nextInt();
        for (int i = 0; i <num; i++) {
            System.out.println("factorialN de "+ i+" es:"+factorialN(i));
        }
        
    }

}     