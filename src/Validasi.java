public class Validasi {
    public static String validasiInput(PemesananBuku pemesanan) {
        if (pemesanan.getJudulBuku().isEmpty()) {
            return "Judul Buku tidak boleh kosong.";
        }

        String namaPengarang = pemesanan.getNamaPengarang();
        if (namaPengarang.isEmpty()) {
            return "Nama Pengarang tidak boleh kosong.";
        } else if (!namaPengarang.matches("[a-zA-Z\\s]+")) {
            return "Nama Pengarang harus berupa huruf.";
        }

        int jumlahBuku;
        try {
            jumlahBuku = Integer.parseInt(pemesanan.getJumlahBuku());
            if (jumlahBuku < 1) {
                return "Jumlah Buku harus minimal 1.";
            }
        } catch (NumberFormatException e) {
            return "Jumlah Buku harus berupa angka.";
        }

        double hargaPerBuku;
        try {
            hargaPerBuku = Double.parseDouble(pemesanan.getHargaPerBuku());
            if (hargaPerBuku <= 0) {
                return "Harga per Buku harus lebih besar dari 0.";
            }
        } catch (NumberFormatException e) {
            return "Harga per Buku harus berupa angka.";
        }

        return "Valid";
    }
}
