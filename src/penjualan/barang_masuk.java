package penjualan;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class barang_masuk {
    private int kode_barang;
    private String nama_barang;
    private String tanggal_masuk;
    private int jum_barang_masuk;
    private int harga_satuan;
    private int total_harga;
    private int kode_supplier;

    // Constructor
    public barang_masuk(int kode_barang, String nama_barang, String tanggal_masuk, int jum_barang_masuk,
                       int harga_satuan, int kode_supplier) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.tanggal_masuk = tanggal_masuk;
        this.jum_barang_masuk = jum_barang_masuk;
        this.harga_satuan = harga_satuan;
        this.kode_supplier = kode_supplier;
        this.total_harga = jum_barang_masuk * harga_satuan;
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

    // Getter and Setter for tanggal_masuk
    public String getTanggalMasuk() {
        return tanggal_masuk;
    }

    public void setTanggalMasuk(String tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    // Getter and Setter for jum_barang_masuk
    public int getJumlahBarangMasuk() {
        return jum_barang_masuk;
    }

    public void setJumlahBarangMasuk(int jum_barang_masuk) {
        this.jum_barang_masuk = jum_barang_masuk;
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

    // Getter for total_harga
    public int getTotalHarga() {
        return total_harga;
    }

    // Metode lainnya
    public void tampilkanInformasi() {
        System.out.println("Kode Barang: " + kode_barang);
        System.out.println("Nama Barang: " + nama_barang);
        System.out.println("Tanggal Masuk: " + tanggal_masuk);
        System.out.println("Jumlah Barang Masuk: " + jum_barang_masuk);
        System.out.println("Harga Satuan: " + harga_satuan);
        System.out.println("Total Harga: " + total_harga);
        System.out.println("Kode Supplier: " + kode_supplier);
    }
}

