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
public class dataPembayaran {
    private ArrayList <Integer> no_struk;
    private ArrayList <Integer> kd_barang;
    private ArrayList <String> nama_barang;
    private ArrayList <Integer> total_harga;
    private ArrayList <Integer> bayar;
    private ArrayList <Integer> kembalian;
    
    public dataPembayaran (){
        no_struk = new ArrayList <Integer>();
        kd_barang = new ArrayList <Integer>();
        nama_barang = new ArrayList <String>();
        total_harga = new ArrayList <Integer>();
        bayar = new ArrayList <Integer>();
        kembalian = new ArrayList <Integer>();
    };
    
    
    public void insertNo_struk(Integer isi){
    this.no_struk.add(isi);
    }
    
    public ArrayList <Integer> getRecordNo_struk(){
        return this.no_struk;
    }
    
    public void insertKd_barang(Integer isi){
    this.kd_barang.add(isi);
    }
    
    public ArrayList <Integer> getRecordKd_barang(){
        return this.kd_barang;
    }
    
    public void insertNama_barang(String isi){
    this.nama_barang.add(isi);
    }
    
    public ArrayList <String> getRecordNama_barang(){
        return this.nama_barang;
    }
    
    public void insertTotal_harga(Integer isi){
    this.total_harga.add(isi);
    }
    
    public ArrayList <Integer> getRecordTotal_harga(){
        return this.total_harga;
    }
    
    public void insertBayar(Integer isi){
    this.bayar.add(isi);
    }
    
    public ArrayList <Integer> getRecordBayar(){
        return this.bayar;
    }
    
    public void insertKembalian(Integer isi){
    this.kembalian.add(isi);
    }
    
    public ArrayList <Integer> getRecordKembalian(){
        return this.kembalian;
    }
}
