/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author Leman
 */
public class BankGo {

    public static void main(String[] args) {
        AkunBank rekening = new AkunBank(100000);
        rekening.cekSaldo();
        rekening.SimpanUang(500000);
        rekening.AmbilUang(150000);
        rekening.cekSaldo();
    }
}
