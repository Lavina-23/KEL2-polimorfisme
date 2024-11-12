public class Pegawai {
  private String nip;
  private String nama;

  public Pegawai() {

  }

  public Pegawai(String nip, String nama) {
    this.nip = nip;
    this.nama = nama;
  }

  public void displayInfo() {
    System.out.println("NIP: " + nip);
    System.out.println("Nama: " + nama);
  }
}