import java.util.Scanner;

public class Texto {
    public static void main(String[] args){
        Scanner meuObj = new Scanner(System.in);
        System.out.println("*******");
        System.out.println("Entre com um texto");
        String quantidadeCaracteres = meuObj.nextLine();
        System.out.println("A quantidade de caracteres de \" " + quantidadeCaracteres +" \" é " + quantidadeCaracteres.length());

        System.out.println("O texto \" " + quantidadeCaracteres + " \" convertido será: " + quantidadeCaracteres.toUpperCase());
        
        meuObj.close();
    }
}
