package penjualan;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class penjualan {
    private int no_struk;
    private int kode_barang;
    private int jumlah_barang;
    private int total_harga;
    
    //Method
    
    // Constructor
    public penjualan(int no_struk, int kode_barang, int jumlah_barang, int total_harga) {
        this.no_struk = no_struk;
        this.kode_barang = kode_barang;
        this.jumlah_barang = jumlah_barang;
        this.total_harga = total_harga;
    }

    // Getter and Setter for no_struk
    public int getNoStruk() {
        return no_struk;
    }

    public void setNoStruk(int no_struk) {
        this.no_struk = no_struk;
    }

    // Getter and Setter for kode_barang
    public int getKodeBarang() {
        return kode_barang;
    }

    public void setKodeBarang(int kode_barang) {
        this.kode_barang = kode_barang;
    }

    // Getter and Setter for jumlah_barang
    public int getJumlahBarang() {
        return jumlah_barang;
    }

    public void setJumlahBarang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    // Getter and Setter for total_harga
    public int getTotalHarga() {
        return total_harga;
    }

    public void setTotalHarga(int total_harga) {
        this.total_harga = total_harga;
    }
}
