package academy.mateuzin.maratonajava.introduce;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //descubra em quantas vezes o carro pode ser parcelado
        //parcela valorParcela >=1000

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela: "+parcela+ " R$: "+valorParcela);
            } else {
                break;
            }
            System.out.println(+parcela);
        }
    }
}