class Point {

    double x;
    double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

}
class Lingkaran {

    double jariJari;
    Point pusat;

    Lingkaran(double jariJari, Point pusat){
        this.jariJari = jariJari;
        this.pusat = pusat;
    }

    public boolean bersinggungan(Lingkaran lingkaran){

        double dx = pusat.x - lingkaran.pusat.x;
        double dy = pusat.y - lingkaran.pusat.y;

        double jarak = Math.sqrt(dx*dx + dy*dy);

        if(jarak == (this.jariJari + lingkaran.jariJari)){
            return true;
        } else {
            return false;
        }
    }
}
public class TesLingkaran {

    public static void main(String[] args) {

        Lingkaran l1 = new Lingkaran(2, new Point(2,2));
        Lingkaran l2 = new Lingkaran(1, new Point(7,1));
        Lingkaran l3 = new Lingkaran(1.5, new Point(4,1.5));

        System.out.println("L1 dan L2 bersinggungan: " + l1.bersinggungan(l2));
        System.out.println("L1 dan L3 bersinggungan: " + l1.bersinggungan(l3));
        System.out.println("L2 dan L3 bersinggungan: " + l2.bersinggungan(l3));

    }
}
