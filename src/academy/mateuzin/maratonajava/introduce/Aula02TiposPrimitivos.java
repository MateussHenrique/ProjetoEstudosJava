package academy.mateuzin.maratonajava.introduce;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 20;
        long numeroGrande = 100050L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2100.85f;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 77;

        //casting: força o tipo de variavel.
        //String: Não é um tipo primitivo, É uma classe.

        String nome = "Mateus"; //Não tem limite de valores.
        System.out.println("Oi, meu nome é: " +nome);

        System.out.println("Minha idade é " +idade);
        System.out.println("Este valor é: " +verdadeiro);
        System.out.println("Meu sexo é: " +caractere);
        System.out.println("Meu salário é: " +salarioFloat);
    }
}
