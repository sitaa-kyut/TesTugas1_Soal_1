import java.util.Random;

class Lingkaran {

    double jariJari;

    Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    double hitungLuas(){
        return Math.PI * jariJari * jariJari;
    }

    double hitungKeliling(){
        return 2 * Math.PI * jariJari;
    }
}

public class TesLingkaran2 {

    public static void main(String[] args) {

        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = new Lingkaran(7.5);

        Random rand = new Random();
        double rRandom = rand.nextDouble() * 10;

        Lingkaran l3 = new Lingkaran(rRandom);

        System.out.println("Lingkaran 1");
        System.out.printf("Jari-jari: %.2f\n", 5.0);
        System.out.printf("Luas: %.2f\n", l1.hitungLuas());
        System.out.printf("Keliling: %.2f\n", l1.hitungKeliling());

        System.out.println();

        System.out.println("Lingkaran 2");
        System.out.printf("Jari-jari: %.2f\n", 7.5);
        System.out.printf("Luas: %.2f\n", l2.hitungLuas());
        System.out.printf("Keliling: %.2f\n", l2.hitungKeliling());

        System.out.println();

        System.out.println("Lingkaran 3");
        System.out.printf("Jari-jari: %.2f\n", rRandom);
        System.out.printf("Luas: %.2f\n", l3.hitungLuas());
        System.out.printf("Keliling: %.2f\n", l3.hitungKeliling());
    }
}