/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan26.waktu.saat.ini;

/**
 *
 * @author
 * Nama :Muhamad Syifa Amruloh
 * Kelas:IF11K
 * NIM  :10118910
 * 
 * Description : Program Menampilkan Waktu
 */
import java.util.*;
import java.text.*;

public class PBO11K10118910Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void waktu(){
        Calendar cal = Calendar.getInstance();
        
        SimpleDateFormat hari = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        System.out.println("Hari ini adalah hari\t: "+ hari.format(cal.getTime()));
        System.out.println("(Developed by : Muhamad Syifa Amruloh)");
    }
    public static void main(String[] args) {
        waktu();
    }
    
}
