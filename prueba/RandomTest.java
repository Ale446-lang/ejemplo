import java.util.Random;

public class RandomTest {

    // Devuelve un número entero aleatorio entre 1 y 100
    public static int numeroRandom() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
    
    // Devuelve una letra aleatoria entre a y j
    public static char letraRandom() {
        return "abcdefghij".charAt(new Random().nextInt(10));
    }

    public static void main(String[] args) {
        System.out.println("Número random: " + numeroRandom());
        System.out.println("Letra random: " + letraRandom());
    }
    
    
}
