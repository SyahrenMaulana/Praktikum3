
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Kendaraan {
    
    static void oke(){
        Scanner input = new Scanner(System.in);
        String merk, jenis, warna, plat, cc;
        System.out.println("");
        System.out.println("============");
        System.out.println("Masukan Merk Mobil :");
        merk = input.next();
        System.out.println("Masukan Jenis Mobil :");
        jenis = input.next();
        System.out.println("Masukan Warna Mobil :");
        warna = input.next();
        System.out.println("Masukan Plat Mobil :");
        plat = input.next();
        System.out.println("Masukan CC mobil :");
        cc = input.next();
        
        System.out.println("=============");
        System.out.println("Merk Mobil :"+merk);
        System.out.println("Jenis Mobil :"+jenis);
        System.out.println("Warna Mobil :"+warna);
        System.out.println("Plat Mobil :"+plat);
        System.out.println("CC Mobil : "+cc);
    }
    
        
    }
}
    
    
    
    
