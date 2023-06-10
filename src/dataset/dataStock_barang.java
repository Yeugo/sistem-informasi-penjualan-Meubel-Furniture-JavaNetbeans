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
public class dataStock_barang {
    private ArrayList <Integer> kode_pesanan;
    private ArrayList <String> nama_barang;
    private ArrayList <Integer> harga_satuan;
    private ArrayList <Integer> jumlah;
    private ArrayList <Integer> kode_supplier;
    
    public dataStock_barang (){
        kode_pesanan = new ArrayList <Integer>();
        nama_barang = new ArrayList <String>();
        harga_satuan = new ArrayList <Integer>();
        jumlah = new ArrayList <Integer>();
        kode_supplier = new ArrayList <Integer>();
    };
    
    
    public void insertKode_pesanan(Integer isi){
    this.kode_pesanan.add(isi);
    }
    
    public ArrayList <Integer> getRecordKode_pesanan(){
        return this.kode_pesanan;
    }
    
    public void insertNama_barang(String isi){
    this.nama_barang.add(isi);
    }
    
    public ArrayList <String> getRecordNama_barang(){
        return this.nama_barang;
    }
    
    public void insertHArga_satuan(Integer isi){
    this.harga_satuan.add(isi);
    }
    
    public ArrayList <Integer> getRecordHarga_satuan(){
        return this.harga_satuan;
    }
    
    public void insertJumlah(Integer isi){
    this.jumlah.add(isi);
    }
    
    public ArrayList <Integer> getRecordJumlah(){
        return this.jumlah;
    }
    
    public void insertKode_supplier(Integer isi){
    this.kode_supplier.add(isi);
    }
    
    public ArrayList <Integer> getRecordKode_supplier(){
        return this.kode_supplier;
    }
}
