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
public abstract class AlatMusik {
    protected String nama;
    protected String jenis;

    public AlatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void info(){
        System.out.println("Nama Alat Musik : "+nama+" Jenis = "+jenis);
    }
    
    //contoh method polymormorphism
    public abstract void mainkan();  
    public abstract void stem();
}
