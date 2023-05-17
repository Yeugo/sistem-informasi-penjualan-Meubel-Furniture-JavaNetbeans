/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class stock_barang {
    private int kode_barang;
    private String nama_barang;
    private int harga_satuan;
    private int jumlah;
    private int kode_supplier;
    
    // Constructor
    public stock_barang(int kode_barang, String nama_barang, int harga_satuan, int jumlah, int kode_supplier) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.harga_satuan = harga_satuan;
        this.jumlah = jumlah;
        this.kode_supplier = kode_supplier;
    }

    //Method
    
    // Getter and Setter for kode_barang
    public int getKodeBarang() {
        return kode_barang;
    }

    public void setKodeBarang(int kode_barang) {
        this.kode_barang = kode_barang;
    }

    // Getter and Setter for nama_barang
    public String getNamaBarang() {
        return nama_barang;
    }

    public void setNamaBarang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    // Getter and Setter for harga_satuan
    public int getHargaSatuan() {
        return harga_satuan;
    }

    public void setHargaSatuan(int harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    // Getter and Setter for jumlah
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Getter and Setter for kode_supplier
    public int getKodeSupplier() {
        return kode_supplier;
    }

    public void setKodeSupplier(int kode_supplier) {
        this.kode_supplier = kode_supplier;
    }
}

