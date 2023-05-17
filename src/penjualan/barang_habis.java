package penjualan;

/**
 *
 * @author ACER
 */
public class barang_habis {
    private int kode_barang;
    private String nama_barang;
    private int jumlah_stok;
    private int kode_supplier;

    // Constructor
    public barang_habis(int kode_barang, String nama_barang, int jumlah_stok, int kode_supplier) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.jumlah_stok = jumlah_stok;
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

    // Getter and Setter for jumlah_stok
    public int getJumlahStok() {
        return jumlah_stok;
    }

    public void setJumlahStok(int jumlah_stok) {
        this.jumlah_stok = jumlah_stok;
    }

    // Getter and Setter for kode_supplier
    public int getKodeSupplier() {
        return kode_supplier;
    }

    public void setKodeSupplier(int kode_supplier) {
        this.kode_supplier = kode_supplier;
    }
}

