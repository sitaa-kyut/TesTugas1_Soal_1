class Tabungan{

    private int saldo;

    public Tabungan(int initsaldo){
        saldo = initsaldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public void simpanUang(int jumlah){
        saldo += jumlah;
    }

    public boolean ambilUang(int jumlah){
       if(jumlah <= saldo) {
           saldo -= jumlah;
           return true;
       }else{
           return false;
       }
    }
}

public class TesTugas1 {
    public static void main(String[] args) {

        Tabungan tabungan = new Tabungan(5000);

        System.out.println("Saldo awal : " + tabungan.getSaldo());

        tabungan.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan: 3000");

        if (tabungan.ambilUang(6000)) {
            System.out.println("Jumlah uang yang diambil: 6000 ok");
        } else {
            System.out.println("Jumlah uang yang diambil: 6000 gagal");
        }

        tabungan.simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan: 3500");

        if(tabungan.ambilUang(4000)){
            System.out.println("Jumlah uang yang diambil: 4000 ok");
        } else {
            System.out.println("Jumlah uang yang di ambil: 4000 gagal");
        }

        if (tabungan.ambilUang(1600)){
            System.out.println("Jumlah uang yang diambil: 1600 ok");
        }else {
            System.out.println("Jumlah uang yang di ambil: 1600 gagal");
        }

        tabungan.simpanUang(2000);
        System.out.println("Jumlah saldo yang disimpan: 2000");

        System.out.println("Saldo sekarang = " + tabungan.getSaldo());
    }
}
