/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xenter;



/**
 *
 * @author Irawa
 */
public class Main {

    public static void main(String[] args) {

        Bunga_Kamboja bunga = new Bunga_Kamboja();

        bunga.setnama_ilmiah("Plumeria rubra");
        bunga.setWarna("Merah");
        bunga.setIklim("Tropis");
        bunga.setTanah("Berdrainase baik");
        bunga.setHewan_penyerbuk("Lebah");

        System.out.println("\t \t \t Bunga Kamboja");
        System.out.println("Nama Ilmiah: " + bunga.getnama_ilmiah());
        System.out.println("Warna: " + bunga.getWarna());
        System.out.println("Iklim: " + bunga.getIklim());
        System.out.println("Tanah: " + bunga.getTanah());
        System.out.println("Hewan Penyerbuk: " + bunga.getHewan_penyerbuk());
        
        Bunga_Bangke FR = new Bunga_Bangke();

        FR.setnama_ilmiah("Plumeria rubra");
        FR.setWarna("Merah");
        FR.setIklim("Tropis");
        FR.setTanah("Berdrainase baik");
        FR.setHewan_penyerbuk("Lebah");

        System.out.println("\t \t \t Bunga Kamboja");
        System.out.println("Nama Ilmiah: " + FR.getnama_ilmiah());
        System.out.println("Warna: " + FR.getWarna());
        System.out.println("Iklim: " + FR.getIklim());
        System.out.println("Tanah: " + FR.getTanah());
        System.out.println("Hewan Penyerbuk: " + FR.getHewan_penyerbuk());
        
         Bunga_Korang lk = new Bunga_Korang();

        lk.setnama_ilmiah("Plumeria rubra");
        lk.setWarna("Merah");
       lk.setIklim("Tropis");
        lk.setTanah("Berdrainase baik");
        lk.setHewan_penyerbuk("Lebah");

        System.out.println("\t \t \t Bunga Korang");
        System.out.println("Nama Ilmiah: " + lk.getnama_ilmiah());
        System.out.println("Warna: " + lk.getWarna());
        System.out.println("Iklim: " + lk.getIklim());
        System.out.println("Tanah: " + lk.getTanah());
        System.out.println("Hewan Penyerbuk: " + lk.getHewan_penyerbuk());
        
        
        

    }
}
