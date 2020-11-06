/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Target Saldo
 */
public class TargetSaldo {
    public int saldoAwal = 3500000;
    public int bunga;
    public double bungaPersen = 0.08;
    public int saldoTarget;
    public boolean target = true;
    
    public void tampilSaldo() {
        saldoTarget = 0;
        int i = 1;
        do {
            bunga = (int) (saldoAwal * bungaPersen);
            saldoTarget = saldoAwal + bunga;
            saldoAwal = saldoTarget;
            System.out.println("Saldo di bulan ke-" + i++ + " Rp." + saldoTarget);

            if (saldoTarget >= 6000000) {
                target = false;
            }
        } while (target);
    }
}
