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
        
        
        Bunga_Lain bn = new Bunga_Lain();

        bn.setnama_ilmiah("Plumeria rubraee");
        bn.setWarna("Merah");
        bn.setIklim("Tropis");
        bn.setTanah("Berdrainase baik");
        bn.setHewan_penyerbuk("Lebah");

        System.out.println("\t \t \t Bunga zzzzzzzzzzz");
        System.out.println("Nama Ilmiah: " + bn.getnama_ilmiah());
        System.out.println("Warna: " + bn.getWarna());
        System.out.println("Iklim: " + bn.getIklim());
        System.out.println("Tanah: " + bn.getTanah());
        System.out.println("Hewan Penyerbuk: " + bn.getHewan_penyerbuk());
        
        
        
        

    }
    
}
