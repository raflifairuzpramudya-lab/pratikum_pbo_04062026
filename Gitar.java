/*Nama : RAFLI FAIRUZ PRAMUDYA
NIM : 2501082012
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.pratikum040062026;

/**
 *
 * @author asus
 */
public class Gitar extends AlatMusik{
    private int jumlahSenar;

    public Gitar(int jumlahSenar, String nama, String jenis) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println(nama+" dipetik dengan : "+jumlahSenar+" senar.");
    }

    @Override
    public void stem() {
        System.out.println("Menyetem gitar"+nama+" secara manual");
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }
    
    
}
