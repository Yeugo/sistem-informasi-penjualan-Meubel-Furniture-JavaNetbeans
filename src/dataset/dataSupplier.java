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
public class dataSupplier {
    private ArrayList <Integer> kode_supplier;
    private ArrayList <String> nama_supplier;
    private ArrayList <String> alamat;
    private ArrayList <String> telepon;
    
    public dataSupplier (){
        kode_supplier = new ArrayList <Integer>();
        nama_supplier = new ArrayList <String>();
        alamat = new ArrayList <String>();
        telepon = new ArrayList <String>();
    };
    
    
    public void insertKode_supplier(Integer isi){
    this.kode_supplier.add(isi);
    }
    
    public ArrayList <Integer> getRecordKode_supplier(){
        return this.kode_supplier;
    }
    
    public void insertNama_supplier(String isi){
    this.nama_supplier.add(isi);
    }
    
    public ArrayList <String> getRecordNama_supplier(){
        return this.nama_supplier;
    }
    
    public void insertAlamat(String isi){
    this.alamat.add(isi);
    }
    
    public ArrayList <String> getRecordAlamat(){
        return this.alamat;
    }
    
    public void insertTelepon(String isi){
    this.telepon.add(isi);
    }
    
    public ArrayList <String> getRecordTelepon(){
        return this.telepon;
    }
}
