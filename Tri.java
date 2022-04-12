import java.util.Scanner;

public class Tri {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in); //cria objeto
        System.out.println("Entre com a base do Triângulo: ");
        int lado1 = numero.nextInt();
        System.out.println("Entre com a altura do Triângulo: ");
        int lado2 = numero.nextInt();
        System.out.println("A Área do Retângulo é: " + (lado1 * lado2) / 2);
        numero.close();
    }
}