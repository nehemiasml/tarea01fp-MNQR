import java.util.Scanner;
public class Main {

     public static void main(String[] args) {
        double N,monto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese monto de compra");
        N=sc.nextFloat();
        if(N>100){
            monto= N-(N*0.2);
            System.out.println(monto);
        }else{
            if(N <= 100 && N > 50){
                monto = N-(N*0.1);
                System.out.println(monto);
            }else{
                System.out.println(N);
            }
        }
        }
    }