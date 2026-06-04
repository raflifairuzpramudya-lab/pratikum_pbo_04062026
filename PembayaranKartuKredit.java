/*Nama : RAFLI FAIRUZ PRAMUDYA
NIM : 2501082012
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum040062026;

/**
 *
 * @author asus
 */
public class PembayaranKartuKredit extends Pembayaran implements CetakStruk{
    private String noKartu;
    private String namaKartu;

    public PembayaranKartuKredit(String noKartu, String namaKartu, Double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.noKartu = noKartu;
        this.namaKartu = namaKartu;
    }

    public String getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(String noKartu) {
        this.noKartu = noKartu;
    }

    public String getNamaKartu() {
        return namaKartu;
    }

    public void setNamaKartu(String namaKartu) {
        this.namaKartu = namaKartu;
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui Kartu Kredit");
        System.out.println("Nama Kartu : "+namaKartu);
        System.out.println("No Kartu : "+noKartu);
        System.out.println("Id Transaksi :"+idTransaksi);
        System.out.println("Jumlah Bayar : Rp. "+jumlahBayar);
    }
    
    @Override
    public void CetakStruk(){
        System.out.println("==== Struk Kartu Kredit ===");
        System.out.println("ID transaksi = "+idTransaksi);
        System.out.println("Jumlah Bayar = "+jumlahBayar);
        System.out.println("No Kartu = "+noKartu);
        System.out.println("Nama Kartu = "+namaKartu);
    }
}