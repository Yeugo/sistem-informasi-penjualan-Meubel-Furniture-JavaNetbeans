package penjualan;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class pembayaran {
    private int no_struk;
    private int kd_barang;
    private String nama_barang;
    private int total_harga;
    private int bayar;
    private int kembalian;

    // Constructor
    public pembayaran(int no_struk, int kd_barang, String nama_barang, int total_harga, int bayar) {
        this.no_struk = no_struk;
        this.kd_barang = kd_barang;
        this.nama_barang = nama_barang;
        this.total_harga = total_harga;
        this.bayar = bayar;
        this.kembalian = kembalian;
    }
    
    //Method
    
    // Getter and Setter for no_struk
    public int getNoStruk() {
        return no_struk;
    }

    public void setNoStruk(int no_struk) {
        this.no_struk = no_struk;
    }

    // Getter and Setter for kd_barang
    public int getKodeBarang() {
        return kd_barang;
    }

    public void setKodeBarang(int kd_barang) {
        this.kd_barang = kd_barang;
    }

    // Getter and Setter for nama_barang
    public String getNamaBarang() {
        return nama_barang;
    }

    public void setNamaBarang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    // Getter and Setter for total_harga
    public int getTotalHarga() {
        return total_harga;
    }

    public void setTotalHarga(int total_harga) {
        this.total_harga = total_harga;
    }

    // Getter and Setter for bayar
    public int getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    // Getter and Setter for kembalian
    public int getKembalian() {
        return kembalian;
    }
    
    public void setKembalian(int kembalian) {
            this.kembalian = kembalian;
    }
}

