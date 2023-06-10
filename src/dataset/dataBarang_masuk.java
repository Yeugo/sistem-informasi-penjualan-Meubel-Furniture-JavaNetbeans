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
public class dataBarang_masuk {
    private ArrayList <Integer> kode_barang;
    private ArrayList <String> nama_barang;
    private ArrayList <String> tanggal_masuk;
    private ArrayList <Integer> jum_barang_masuk;
    private ArrayList <Integer> harga_satuan;
    private ArrayList <Integer> total_harga;
    private ArrayList <Integer> kode_supplier;
    
    public dataBarang_masuk (){
        kode_barang = new ArrayList <Integer>();
        nama_barang = new ArrayList <String>();
        tanggal_masuk = new ArrayList <String>();
        jum_barang_masuk = new ArrayList <Integer>();
        harga_satuan = new ArrayList <Integer>();
        total_harga = new ArrayList <Integer>();
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
    
    public void insertTanggal_masuk(String isi){
    this.tanggal_masuk.add(isi);
    }
    
    public ArrayList <String> getRecordTanggal_masuk(){
        return this.tanggal_masuk;
    }
    
    public void insertJum_barang_masuk(Integer isi){
    this.jum_barang_masuk.add(isi);
    }
    
    public ArrayList <Integer> getRecordJum_barang_masuk(){
        return this.jum_barang_masuk;
    }
    
    public void insertHarga_satuan(Integer isi){
    this.harga_satuan.add(isi);
    }
    
    public ArrayList <Integer> getRecordHarga_satuan(){
        return this.harga_satuan;
    }
    
    public void insertTotal_harga(Integer isi){
    this.total_harga.add(isi);
    }
    
    public ArrayList <Integer> getRecordTotal_harga(){
        return this.total_harga;
    }
    
    public void insertKode_supplier(Integer isi){
    this.kode_supplier.add(isi);
    }
    
    public ArrayList <Integer> getRecordKode_supplier(){
        return this.kode_supplier;
    }
}
