public class comandosBasicos {
    public static void main(String[] args) {
        
        int nota = 5;
        int media = 7;
        if(nota >= media){
            System.out.println("Aprovado");
        }
        else if(nota < media && nota > 6){
            System.out.println("Aluno em recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
