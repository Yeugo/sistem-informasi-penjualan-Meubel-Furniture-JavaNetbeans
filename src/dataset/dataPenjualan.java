/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class dataPenjualan {
    private ArrayList <Integer> no_struk;
    private ArrayList <Integer> kode_barang;
    private ArrayList <Integer> jumlah_barang;
    private ArrayList <Integer> total_harga;
    
    public dataPenjualan (){
        no_struk = new ArrayList <Integer>();
        kode_barang = new ArrayList <Integer>();
        jumlah_barang = new ArrayList <Integer>();
        total_harga = new ArrayList <Integer>();
    };
    
    
    public void insertNo_struk(Integer isi){
    this.no_struk.add(isi);
    }
    
    public ArrayList <Integer> getRecordNo_struk(){
        return this.no_struk;
    }
    
    public void insertKode_barang(Integer isi){
    this.kode_barang.add(isi);
    }
    
    public ArrayList <Integer> getRecordKode_barang(){
        return this.kode_barang;
    }
    
    public void insertJumlah_barang(Integer isi){
    this.jumlah_barang.add(isi);
    }
    
    public ArrayList <Integer> getRecordJumlah_barang(){
        return this.jumlah_barang;
    }
    
    public void insertTotal_harga(Integer isi){
    this.total_harga.add(isi);
    }
    
    public ArrayList <Integer> getRecordTotal_harga(){
        return this.total_harga;
    }
}
