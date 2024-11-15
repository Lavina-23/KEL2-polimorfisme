// import java.util.ArrayList;

// public class Main {

//   public static void main(String[] args) {
//     Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199482");
//     Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T.", "197001");
//     TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administratif");
//     TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

//     ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
//     daftarPegawai.add(dosen1);
//     daftarPegawai.add(dosen2);
//     daftarPegawai.add(tendik1);
//     daftarPegawai.add(tendik2);

//     System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
//   } 
// }

public class Main {
  public static void main(String[] args) {
    Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
    TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida,A.Md.", "Tenaga Administrasi");

    train(dosen1);
    train(tendik1);
  }

  public static void train(Pegawai pegawai) {
    pegawai.displayInfo();
    System.out.println("Mengenalkan lingkungan kampus");
    System.out.println("Menginfokan SOP/Juknis");

    if (pegawai instanceof Dosen) {
      System.out.println("Memberikan pelatihan pedagogik");
    }
  }
}

// no.1 prak 3
// public static void train(Pegawai pegawai) {
// System.out.println(x:"Memberikan pelatihan untuk
// pegawai");
// pegawai.displayInfo();
// }

// // no.3 prak 3
// // public static void main(String[] args) {
// // Dosen dosen1 = new Dosen (nip:"19940201", nama:"Widia,
// // S. Kom. M. Kom",nidn:"199402");
// // TenagaKependidikan tendik1= new TenagaKependidikan
// // (nip:"19750301", nama: "Aida, A.Md.", kategori:"Tenaga
// // Administrasi");
// // train (dosen1);
// // train(tendik1);
// // }
// // public static void train (Pegawai pegawai){
// // System.out.println(x:"Memberikan pelatihan untuk
// // pegawai"); pegawai.displayInfo();
// // }
// // }

// // no.4 prak 3
// // public static void main(String[] args) {
// // Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
// // TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida,
// A.Md.", "Tenaga Administrasi");

// // train(dosen1);
// // train(tendik1);
// // }
// // public static void train(Pegawai pegawai){
// // System.out.println("Memberikan pelatihan untuk pegawai");
// // pegawai.displayInfo();

// // //hanya test
// // System.out.println(pegawai.nidn);
// // System.out.println(pegawai.kategori);
// // pegawai.mengajar
// // }
// // }

// // TenagaKependidikan test = (TenagaKependidikan) pegawai1;

// // Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T.", "197001");
// // TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida,
// // A.Md.", "Tenaga Administratif");
// // TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika,
// S.T.",
// // "Tenaga Laboratorium");

// // ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
// // daftarPegawai.add(dosen1);
// // daftarPegawai.add(dosen2);
// // daftarPegawai.add(tendik1);
// // daftarPegawai.add(tendik2);

// // System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
