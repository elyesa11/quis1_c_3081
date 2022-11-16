/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_05c_3081;

/**
 *
 * @author ASUS
 */
public class mahasiswa extends penduduk {
    String nim;
    float ipk;
    
    public void tampilDataMahasiswa(){
        tampilDataPenduduk();
        System.out.println("NIM     : "+nim);
        System.out.println("IPK     : "+ipk);
    }
    public void tampilDataBeasiswa(){
        if(ipk > 3.5){
            System.out.println("Mahasiswa bernama "+nama+" berhak mendapatkan beasiswa");
        }else{
            System.out.println("Mahasiswa bernama "+nama+" tidak berhak mendapatkan beasiswa");
        }
    }
}

