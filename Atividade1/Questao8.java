package Atividade1;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Escolha a unidade de temperatura de origem:");
        System.out.println("1 - Celsius");
        System.out.println("2 - Fahrenheit");
        System.out.println("3 - Kelvin");
    int unidadeOrigem = scan.nextInt();

        System.out.println("Digite o valor da temperatura:");
    double temperatura = scan.nextDouble();

        System.out.println("Escolha a unidade de temperatura de destino:");
        System.out.println("1 - Celsius");
        System.out.println("2 - Fahrenheit");
        System.out.println("3 - Kelvin");
    int unidadeDestino = scan.nextInt();

    double temperaturaConvertida = 0;

        switch (unidadeOrigem) {
            case 1: // Celsius
                switch (unidadeDestino) {
                    case 1:
                        temperaturaConvertida = temperatura;
                        break;
                    case 2:
                        temperaturaConvertida = (temperatura - 32) / 1.8;
                        break;
                    case 3:
                        temperaturaConvertida = temperatura + 273.15;
                        break;
                    default:
                        System.out.println("Unidade de temperatura de destino inválida.");
                        scan.close();
                        return;
                }
                break;
            case 2: // Fahrenheit
                switch (unidadeDestino) {
                    case 1:
                        temperaturaConvertida = temperatura * 1.8 + 32;
                        break;
                    case 2:
                        temperaturaConvertida = temperatura;
                        break;
                    case 3:
                        temperaturaConvertida = (temperatura + 459.67) * 5 / 9;
                        break;
                    default:
                        System.out.println("Unidade de temperatura de destino inválida.");
                        scan.close();
                        return;
                }
                break;
            case 3: // Kelvin
                switch (unidadeDestino) {
                    case 1:
                        temperaturaConvertida = temperatura - 273.15;
                        break;
                    case 2:
                        temperaturaConvertida = temperatura * 9 / 5 - 459.67;
                        break;
                    case 3:
                        temperaturaConvertida = temperatura;
                        break;
                    default:
                        System.out.println("Unidade de temperatura de destino inválida.");
                        scan.close();
                        return;
                }
                break;
            default:
                System.out.println("Unidade de temperatura de origem inválida.");
                scan.close();
                return;
                
        }

        System.out.println("A temperatura convertida é: " + temperaturaConvertida);
     







        scan.close();
    }
}
/*programaConverterTemp: Faça um programa que faça a conversão de graus de Celsius, Fahrenheit e Kelvin. Necessário saber qual a temperatura de origem e de conversão.
Fórmula Celsius-Fahrenheit : TempC5=TempF - 329
Fórmula Celsius-Kelvin: K =  TempC + 273*/
