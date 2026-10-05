import java.util.Random;

public class RandomTest {

    // Devuelve un número entero aleatorio entre 1 y 100
    public static int numeroRandom() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        System.out.println("Número random: " + numeroRandom());
    }
}
