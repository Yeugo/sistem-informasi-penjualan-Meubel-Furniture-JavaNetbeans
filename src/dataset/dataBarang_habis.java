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
public class dataBarang_habis {
    private ArrayList <Integer> kode_barang;
    private ArrayList <String> nama_barang;
    private ArrayList <Integer> jumlah_stok;
    private ArrayList <Integer> kode_supplier; 
    
    public dataBarang_habis (){
        kode_barang = new ArrayList <Integer>();
        nama_barang = new ArrayList <String>();
        jumlah_stok = new ArrayList <Integer>();
        kode_supplier = new ArrayList <Integer>();
    };
    
    
    public void insertKode_barang(Integer isi){
    this.kode_barang.add(isi);
    }
    
    public ArrayList <Integer> getRecordKode_barang(){
        return this.kode_barang;
    }
    
    public void insertNama_barang(String isi){
    this.nama_barang.add(isi);
    }
    
    public ArrayList <String> getRecordNama_barang(){
        return this.nama_barang;
    }
    
    public void insertJumlah_stok(Integer isi){
    this.jumlah_stok.add(isi);
    }
    
    public ArrayList <Integer> getRecordJumlah_stok(){
        return this.jumlah_stok;
    }
    
    public void insertKode_supplier(Integer isi){
    this.kode_supplier.add(isi);
    }
    
    public ArrayList <Integer> getRecordKode_supplier(){
        return this.kode_supplier;
    }
}
