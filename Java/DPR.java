/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 1 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/


// Membuat kelas DPR
public class DPR {
  
  // Atribut privat informasi anggota.
  private String nama;   // Nama anggota
  private String partai; // partai politik anggota
  private String bidang; // Bidang anggota
  private int id;        // id anggota

  // Konstruktor default
  public DPR() {
      this.nama = "";
      this.partai = "";
      this.bidang = "";
      this.id = 0;
  }

  // Konstruktor berparameter
  public DPR(int id, String nama, String bidang, String partai) {
      this.nama = nama;
      this.partai = partai;
      this.bidang = bidang;
      this.id = id;
  }

  // Metode mengambil nama anggota.
  public String getNama() {
      return this.nama;
  }

  // Metode memperbarui nama anggota.
  public void setNama(String nama) {
      this.nama = nama;
  }

  // Metode mengambil data partai politik.
  public String getPartai() {
      return this.partai;
  }

  // Metode memperbarui data partai politik.
  public void setPartai(String partai) {
      this.partai = partai;
  }

  // Metode mengambil bidang.
  public String getBidang() {
      return this.bidang;
  }

  // Metode memperbarui bidang.
  public void setBidang(String bidang) {
      this.bidang = bidang;
  }

  // Metode mengambil id.
  public int getId() {
      return this.id;
  }

  // Metode memperbarui id.
  public void setId(int id) {
      this.id = id;
  }
}
