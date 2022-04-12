import java.util.Scanner;

public class Graus {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in); //cria objeto
        System.out.println("Digite a temperatura desejada em Celsius: ");
        float celsius = numero.nextFloat();
        System.out.println("A temperatura em Farenheit é: " + ((celsius * 1.8) + 32));
        numero.close();
}
}