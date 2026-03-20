package academy.mateuzin.maratonajava.introduce;

public class Aula05EstruturasCondicionais04 {
    //E 0 E 34,712 9.78%
    //E 34,713 E 68,587 37,35%
    //E 68,588 49,50%
    //QUANTO PRECISO PAGAR COM BASE NO SALÁRIO ANUAL

    public static void main(String[] args) {
        double salarioAnual = 70000;
        double impostoInicial = 9.78 / 100;
        double impostoSecundario = 37.35 / 100;
        double impostoFinal = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34.712) {
            valorImposto = salarioAnual * impostoInicial;
        } else if (salarioAnual >= 34.713 && salarioAnual <= 68.587) {
            valorImposto = salarioAnual * impostoSecundario;
        } else {
            valorImposto = salarioAnual * impostoFinal;
        }
        System.out.println("O valor é: " +valorImposto);
    }
}
