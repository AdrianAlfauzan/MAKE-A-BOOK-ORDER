import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormulirPemesananBuku extends JFrame {
    private JTextField judulBuku;
    private JTextField namaPengarang;
    private JTextField jumlahBuku;
    private JTextField hargaPerBuku;
    private JButton tombolSubmit;

    public FormulirPemesananBuku() {
        setTitle("Formulir Pemesanan Buku");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Judul Buku:"));
        judulBuku = new JTextField();
        add(judulBuku);

        add(new JLabel("Nama Pengarang:"));
        namaPengarang = new JTextField();
        add(namaPengarang);

        add(new JLabel("Jumlah Buku:"));
        jumlahBuku = new JTextField();
        add(jumlahBuku);

        add(new JLabel("Harga per Buku:"));
        hargaPerBuku = new JTextField();
        add(hargaPerBuku);

        tombolSubmit = new JButton("Pesan");
        add(tombolSubmit);

        tombolSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menanganiSubmit();
            }
        });

        setVisible(true);
    }

    private void menanganiSubmit() {
        PemesananBuku pemesanan = new PemesananBuku(
                judulBuku.getText(),
                namaPengarang.getText(),
                jumlahBuku.getText(),
                hargaPerBuku.getText());

        String validasiPesan = Validasi.validasiInput(pemesanan);
        if (validasiPesan.equals("Valid")) {
            JOptionPane.showMessageDialog(this, "Pemesanan berhasil ya!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            menghapusInputan();
        } else {
            JOptionPane.showMessageDialog(this, validasiPesan, "Terdapat Kesalahan!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void menghapusInputan() {
        judulBuku.setText("");
        namaPengarang.setText("");
        jumlahBuku.setText("");
        hargaPerBuku.setText("");
    }

    public static void main(String[] args) {
        new FormulirPemesananBuku();
    }
}
