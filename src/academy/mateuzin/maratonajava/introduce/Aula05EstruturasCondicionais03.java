package academy.mateuzin.maratonajava.introduce;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 2000;
        String financiarApartamento = "Vou financiar o apartamento";
        String naoFinanciarApartamento = "Não vou financiar o apartamento";
        //Operador ternário --> (condição) ? verdadeiro : falso
        String resultado = salario >= 4000 ? financiarApartamento : naoFinanciarApartamento;

        System.out.println(resultado);
    }
}
