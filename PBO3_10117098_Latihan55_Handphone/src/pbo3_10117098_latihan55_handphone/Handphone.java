/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan55_handphone;

/**
 *
 * @author 
 * NAMA     : SANTI SUSANTI
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan berbagai 
 *                     jenis handphone dengan spesifikasinya berdasarkan konsep
 *                     inheritance.
 */
public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String manufacture, String operatingSystem, String model,
            int harga) {
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.harga = harga;
    }
    
  
    public void displayProduct(){
        System.out.println("Manufaktur : "+manufacture);
        System.out.println("OS    : "+operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);
       
    }
}
