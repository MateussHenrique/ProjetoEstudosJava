package academy.mateuzin.maratonajava.introduce;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 16;
        boolean isAutorizadoIdade = idade >= 18;

        if (isAutorizadoIdade) {
            System.out.println("Ele pode tirar carteira de motorista");
        }else{
            System.out.println("Ele não pode tirar carteira de motorista");
        }
    }
}
