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
public class dataPesanan {
    private ArrayList <Integer> kode_pesanan;
    private ArrayList <Integer> kode_barang;
    private ArrayList <Integer> jumlah;
    private ArrayList <Integer> harga_satuan;
    private ArrayList <Integer> kode_supplier;
    
    public dataPesanan (){
        kode_pesanan = new ArrayList <Integer>();
        kode_barang = new ArrayList <Integer>();
        jumlah = new ArrayList <Integer>();
        harga_satuan = new ArrayList <Integer>();
        kode_supplier = new ArrayList <Integer>();
    };
    
    
    public void insertKode_pesanan(Integer isi){
    this.kode_pesanan.add(isi);
    }
    
    public ArrayList <Integer> getRecordKode_pesanan(){
        return this.kode_pesanan;
    }
    
    public void insertKode_barang(Integer isi){
    this.kode_barang.add(isi);
    }
    
    public ArrayList <Integer> getRecordKode_barang(){
        return this.kode_barang;
    }
    
    public void insertJumlah(Integer isi){
    this.jumlah.add(isi);
    }
    
    public ArrayList <Integer> getRecordJumlah(){
        return this.jumlah;
    }
    
    public void insertHarga_satuan(Integer isi){
    this.harga_satuan.add(isi);
    }
    
    public ArrayList <Integer> getRecordHarga_satuan(){
        return this.harga_satuan;
    }
    
    public void insertKode_supplier(Integer isi){
    this.kode_supplier.add(isi);
    }
    
    public ArrayList <Integer> getRecordKode_supplier(){
        return this.kode_supplier;
    }
}
