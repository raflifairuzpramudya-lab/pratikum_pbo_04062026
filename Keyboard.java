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
public class Keyboard extends AlatMusik implements BisaDinyalakan{
    private boolean dayaTersambung;

    public Keyboard(boolean dayaTersambung, String nama, String jenis) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }
    
    @Override
    public void mainkan() {
        System.out.println(nama+" dimainkan dengan menekan tuts.");
    }

    @Override
    public void stem() {
        System.out.println("Keyboard "+nama+" distem digital dengan aplikasi");
    }

    @Override
    public void nyalakan() {
        if(cekListrik()){
            System.out.println(nama+" dinyalakan");
        }else{
            System.out.println(nama+" tidak ada daya");
        }
    }

    @Override
    public void matikan() {
        System.out.println(nama+" dimatikan.");
    }

    @Override
    public boolean cekListrik() {
        return dayaTersambung;
    }
    
}