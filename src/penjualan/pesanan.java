package penjualan;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class pesanan {
    private int kode_pesanan;
    private int kode_barang;
    private int jumlah;
    private int harga_satuan;
    private int kode_supplier;
    
    //Method
    
    // Constructor
    public pesanan(int kode_pesanan, int kode_barang, int jumlah, int harga_satuan, int kode_supplier) {
        this.kode_pesanan = kode_pesanan;
        this.kode_barang = kode_barang;
        this.jumlah = jumlah;
        this.harga_satuan = harga_satuan;
        this.kode_supplier = kode_supplier;
    }
    
    //Method
    
    // Getter and Setter for kode_pesanan
    public int getKodePesanan() {
        return kode_pesanan;
    }

    public void setKodePesanan(int kode_pesanan) {
        this.kode_pesanan = kode_pesanan;
    }

    // Getter and Setter for kode_barang
    public int getKodeBarang() {
        return kode_barang;
    }

    public void setKodeBarang(int kode_barang) {
        this.kode_barang = kode_barang;
    }

    // Getter and Setter for jumlah
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Getter and Setter for harga_satuan
    public int getHargaSatuan() {
        return harga_satuan;
    }

    public void setHargaSatuan(int harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    // Getter and Setter for kode_supplier
    public int getKodeSupplier() {
        return kode_supplier;
    }

    public void setKodeSupplier(int kode_supplier) {
        this.kode_supplier = kode_supplier;
    }

}

