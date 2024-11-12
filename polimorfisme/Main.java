import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199482");
    Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T.", "197001");
    TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administratif");
    TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

    ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
    daftarPegawai.add(dosen1);
    daftarPegawai.add(dosen2);
    daftarPegawai.add(tendik1);
    daftarPegawai.add(tendik2);

    System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
  }
}