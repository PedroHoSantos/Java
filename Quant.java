import java.util.Scanner;

public class Quant {
    public static void main(String[] args){
        Scanner texto = new Scanner(System.in); //cria objeto
        System.out.println("Entre com o texto desejado: ");
        String txt = texto.nextLine();
        System.out.println("O texto tem: " + txt.length() + " Caracteres");
        texto.close();
    }
}