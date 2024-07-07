public class PemesananBuku {
    private String judulBuku;
    private String namaPengarang;
    private String jumlahBuku;
    private String hargaPerBuku;

    public PemesananBuku(String judulBuku, String namaPengarang, String jumlahBuku, String hargaPerBuku) {
        this.judulBuku = judulBuku;
        this.namaPengarang = namaPengarang;
        this.jumlahBuku = jumlahBuku;
        this.hargaPerBuku = hargaPerBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public String getJumlahBuku() {
        return jumlahBuku;
    }

    public String getHargaPerBuku() {
        return hargaPerBuku;
    }
}
