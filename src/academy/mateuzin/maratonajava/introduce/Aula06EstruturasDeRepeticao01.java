package academy.mateuzin.maratonajava.introduce;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;

        while (count < 10){
            System.out.println(count);
            count += 1;
        }

        count = 0;
        do {
            System.out.println("dentro do-while"+count);
            count++;
        } while (count < 10);
    }
}
