/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author Leman
 */
public class AkunBank {

    double saldo;

    AkunBank(double S) {
        this.saldo = S;
        System.out.println("SELAMAT DATANG DI BANK ABCDE");
    }

    void cekSaldo() {
        System.out.println("Saldo saat ini Rp" + saldo + "\n");
    }

    void SimpanUang(double S) {
        this.saldo += S;
        System.out.println("Simpan Uang Rp " + S);
        this.cekSaldo();
    }

    void AmbilUang(double S) {
        if (this.saldo - S >= 0) {
            this.saldo -= S;
            System.out.println("Ambil Uang Rp" + S);
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
        this.cekSaldo();
    }
}
