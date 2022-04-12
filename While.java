import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner meuObj = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        Integer valor1 = meuObj.nextInt();
        System.out.println("Digite o segundo valor:");
        Integer valor2 = meuObj.nextInt();

        if(valor1 > valor2){
            int i = valor1 + 1;
            while(i > valor2){
                i--;
                System.out.println(i);
            }
        }else{
            int i = valor1 - 1;
            while(i < valor2){
                i++;
                System.out.println(i);
        }
    }
    meuObj.close();
}
}