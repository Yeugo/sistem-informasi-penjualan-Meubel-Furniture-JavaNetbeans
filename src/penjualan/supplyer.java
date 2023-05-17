package penjualan;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class supplyer {
    private int kode_supplier;
    private String nama_supplier;
    private String alamat;
    private String telepon;

    // Constructor
    public supplyer(int kode_supplier, String nama_supplier, String alamat, String telepon) {
        this.kode_supplier = kode_supplier;
        this.nama_supplier = nama_supplier;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    //Method
    
    // Getter and Setter for kode_supplier
    public int getKodeSupplier() {
        return kode_supplier;
    }

    public void setKodeSupplier(int kode_supplier) {
        this.kode_supplier = kode_supplier;
    }

    // Getter and Setter for nama_supplier
    public String getNamaSupplier() {
        return nama_supplier;
    }

    public void setNamaSupplier(String nama_supplier) {
        this.nama_supplier = nama_supplier;
    }

    // Getter and Setter for alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter and Setter for telepon
    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
