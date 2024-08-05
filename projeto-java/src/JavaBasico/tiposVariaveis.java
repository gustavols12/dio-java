package JavaBasico;

public class tiposVariaveis {
    public static void main(String[] args) {
        System.out.println("teste");
        String nome = "Gustavo";
        String sobrenome = "Luiz";
        int idade = 23;
        System.out.println(String.format("meu nome é %s e minha idade é %d",nome, idade));
        System.out.println((nome_completo(nome, sobrenome)));
        boolean variavel = false;
        System.out.println(variavel);
        variavel = true;
        System.out.println(variavel);


    }
    public static String nome_completo(String nome, String sobrenome){
        return String.format("Mue nome completo é %s %s", nome,sobrenome);

    }
}
