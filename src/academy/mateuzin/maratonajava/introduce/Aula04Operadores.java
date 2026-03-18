package academy.mateuzin.maratonajava.introduce;

public class Aula04Operadores {
    /*
     Operadores Aritméticos
     soma, divisão, subtração e multiplicação
     */

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double) numero2;
        System.out.println(resultado);

        // Operadores Relacionais
        //%
        int resto = 28 % 7;
        System.out.println(resto);

        //<> <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualaVinte = 10 == 20;
        boolean isVinteIgualaVinte = 20 == 20;
        boolean isVinteDiferenteVinte = 20 != 20;
        boolean isDezDiferenteVinte = 10 != 20;
        boolean isDezMaiorIgualVinte = 10 >= 20;
        boolean isDezMenorIgualVinte = 10 <= 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualaVinte);
        System.out.println(isVinteIgualaVinte);
        System.out.println(isVinteDiferenteVinte);
        System.out.println(isDezDiferenteVinte);

        /*
        Operadores Lógicos AND
        && (AND), || (OR), ! (Negação)
         */

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorTrinta: " + isDentroDaLeiMaiorTrinta);
        System.out.println("isDentroDaLeiMenorTrinta: " + isDentroDaLeiMenorTrinta);

        double contaCorrenteTotal = 33250;
        double contaPoupancaTotal = 210251;
        float valorJetta = 210250f;

        boolean isJettaComprar = contaCorrenteTotal >= valorJetta || contaPoupancaTotal >= valorJetta;
        System.out.println("isJettaComprar: "+isJettaComprar);

        /*
        Operadores Atribuição
        = += -= *= /= %=
         */

        double bonus = 1800; //1800
        bonus += 3000; //4800
        bonus -= 1200; //3600
        bonus *= 2; // x2
        bonus /= 2; // dividir 2
        bonus %= 2; //resto 2

        System.out.println("O seu bônus é: " +bonus);

        //incremetador
        int contador = 0;
        contador += 1; //contador = contador + 1
        contador++; //adiciona 1 de forma simplificada
        ++contador;

        // antes incrementa e depois executa
        // depois executa e depois incrementa
        System.out.println(contador);
    }
}
