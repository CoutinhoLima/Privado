package Atividade1;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número");
    double numero = scan.nextDouble();
        if (numero > 0) {
        double dobro = numero * 2;
            System.out.println("Como o número foi positivo seu dobro é: " +dobro);
            
        }else if (numero < 0) {
        double triplo = numero * 3;
            System.out.println("Como o número foi negativo seu triplo é " +triplo);
            
        }else{
            System.out.println("Seu valor é igual a zero portanto não há dobro ou triplo");
        }






        scan.close();
    }
}
//ProgramaDobroTriplo: Receba um número e encontre o dobro dele caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.