import org.java.exercise.Interi;

public class App {
    public static void main(String[] args) throws Exception {

        int[] arrayInteri = { };

        Interi interi = new Interi(arrayInteri);

        while (interi.hasAncoraElementi()) {
            System.out.println(interi.getElementoSuccessivo());
        }
    }
}
