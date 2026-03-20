package academy.mateuzin.maratonajava.introduce;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 60;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >=15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println("A idade é da: " + categoria);
    }
}
