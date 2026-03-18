package academy.mateuzin.maratonajava.introduce;

/*
Exercício:

Criar variáveis para os campos descritos abaixo entre <> e imprimir a seguinte mensagem:

Eu, <nome>, morando no endereço <>, confirmo que recebi o salário de <>, na data <>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Mateus";
        String endereco = "Rua dos Cânticos, 607";
        double salarioDouble = 2150.5;
        String dataRecebimento = "08/03/26.";
        String relatorio = "Eu " + nome + ", morando no endereço: " + endereco + " confirmo que recebi o salário de: " + salarioDouble + " na data " + dataRecebimento;

        System.out.println(relatorio);
    }
}
