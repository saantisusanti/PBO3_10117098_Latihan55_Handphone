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
public class PBO3_10117098_Latihan55_Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Android android= new Android("Samsung", "Android", "Grand", 3000000);
        android.displayProduct();
        android.setKeyStore("234ibfd3840fo");
        System.out.println("Andriod Key Store : " + android.getKeyStore()+"\n");

        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bb.displayProduct();
        bb.setPinBB("BHS249");
        System.out.println("PIN   : " + bb.getPinBB()+"\n");

        WindowsPhone wiphone = new WindowsPhone("Nokia", "Win8", "Lumia",
                1000000);
        wiphone.displayProduct();
        wiphone.setWpKeyStore("UUUQIJWORJ");
        System.out.println("WP Key Store : " + wiphone.getWpKeyStore());
    }
    
}
