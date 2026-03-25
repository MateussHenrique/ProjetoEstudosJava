package academy.mateuzin.maratonajava.introduce;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //imprimir numeros ate 25 e dar um break
        int valorMaximo = 50;

        for (int i = 0; i <= valorMaximo; i++) {
            if(i > 25){
                break;
            }
            System.out.println("Os números são: " +i);
        }
    }
}
