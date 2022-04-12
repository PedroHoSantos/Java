class Construtor {
    private String nome;
    //construtor
    Construtor() {
        System.out.println("Construtor chamado:");
        nome = "Programa Java";
    }
    public static void main(String[] args){
        Construtor obj = new Construtor();
        System.out.println("Qual construtor foi chamado? " + obj.nome);
    }
}
