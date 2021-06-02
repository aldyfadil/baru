/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ckl
 */
import java.util.Scanner;
public class DataPenjualan {
    public int id;
    public String nama, keperluan;
    public DataPenjualan next;
    
    static Scanner in = new Scanner (System.in);
    static Scanner str = new Scanner (System.in);
    
    public void input(){
        System.out.println();
        System.out.println("\t\t\t\t\tMasukan Id        : ");
        id = in.nextInt();
        System.out.println("\t\t\t\t\tMasukan Nama      : ");
        nama = str.nextLine();
        System.out.println("\t\t\t\t\tMasukan Keperluan : ");
        keperluan = str.nextLine();
        next = null;
    }
    
    public void read(){
        System.out.println("\t\t\t\t||" + id +" \t|| " + nama + " \t||" + keperluan + " \t|| ");
    }
}
