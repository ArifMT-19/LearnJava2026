class Pelanggan {
    String nama;
    String noHP;
    int saldo;

    // constructor (saldo otomatis 0)
    Pelanggan(String nama, String noHP) {
        this.nama = nama;
        this.noHP = noHP;
        this.saldo = 0;
    }

    // method top up
    public void topUp(int jumlah) {
        if (jumlah < 10000) {
            System.out.println("❌ Top up gagal! Minimal Rp 10.000");
        } else {
            saldo += jumlah;
            System.out.println("✅ Top up berhasil sebesar Rp " + jumlah);
            System.out.println("Saldo sekarang: Rp " + saldo);
        }
        System.out.println("--------------------------------");
    }

    // method bayar tagihan
    public void bayarTagihan(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("✅ Pembayaran berhasil sebesar Rp " + jumlah);
        } else {
            System.out.println("❌ Pembayaran gagal! Saldo tidak cukup");
        }
        System.out.println("Saldo sekarang: Rp " + saldo);
        System.out.println("--------------------------------");
    }

    // tampil saldo
    public void tampilSaldo() {
        System.out.println("💰 Sisa saldo: Rp " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {

        // Simulasi sesuai soal
        Pelanggan anton = new Pelanggan("Anton", "081234567");

        anton.topUp(50000);         // top up pertama
        anton.bayarTagihan(60000);  // gagal

        anton.topUp(20000);         // top up kedua
        anton.bayarTagihan(60000);  // berhasil

        anton.tampilSaldo();        // sisa saldo
    }
}