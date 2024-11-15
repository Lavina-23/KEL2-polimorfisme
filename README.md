# Jobsheet 11 : Polimorfisme

**Kelompok 2**

- Dewi Sulistyowati/2341760126 <br>
- Johnatan David Gersom/2341760080 <br>
- Lavina/2341760062 <br>
- Marga Reta Novia Putri/2341760017 <br>
- Muhammad Mahdi Arielreza Hafiz/2341760049 <br>

### **Praktikum Bagian 1. Heterogenous Collection**

1. Buatlah folder baru dengan nama Praktikum10. Di dalamnya, buat class Pegawai <br>

`Pegawai.java`

```java
public class Pegawai {
  String nip;
  String nama;

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
```

2. Tambahkan class Dosen <br>

`Dosen.java`

```java
public class Dosen extends Pegawai {
  public String nidn;

  public Dosen() {

  }

  public Dosen(String nip, String nama, String nidn) {
    super(nip, nama);
    this.nidn = nidn;
  }

  public void displayInfo() {
    super.displayInfo();
    System.out.println("NIDN: " + nidn);
  }

  public void mengajar() {
    System.out.println("Membuat rencana pembelajaran");
    System.out.println("Menyusun materi");
    System.out.println("Melaksanakan PBM");
    System.out.println("Melakukan evaluasi");
  }
}
```

3. Tambahkan class TenagaKependidikan <br>

`TenagaKependidikan.java`

```java
public class TenagaKependidikan extends Pegawai {
  public String kategori;

  public TenagaKependidikan() {

  }

  public TenagaKependidikan(String nip, String nama, String kategori) {
    super(nip, nama);
    this.kategori = kategori;
  }

  public void displayInfo() {
    super.displayInfo();
    System.out.println("Kategori: " + kategori);
  }

}
```

4. Buatlah class Demo beserta fungsi main(). Di dalam fungsi main(), instansiasi beberapa
   object dosen dan tenaga kependidikan sebagai berikut <br>

5. Buatlah arrayList daftarPegawai bertipe ArrayList of Pegawai. <br>

6. Konsep polimorfisme mengizinkan object dosen1, dosen2, tendik1, dan tendik2 untuk ditambahkan ke Array List daftarPegawai meskipun tidak secara eksplisit bertipe Pegawai. <br>

`Main.java `

```java
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
```

7. Compile dan run program untuk memastikan bahwa heterogenous collection dapat dibuat <br>

**Hasil Percobaan**<br>

![hasil](/ss/image.png)<br>

### **Praktikum 2 : Object Casting**

1. Pada langkah sebelumnya, Anda telah membuat object dosen1 yang diinstansiasi dari class Dosen. Object dosen1 bertipe Dosen. Dengan kata lain, object tersebut akan dikenali/diperlakukan sebagai object bertipe Dosen. Oleh karena itu, dosen1 memiliki atribut NIDN dan dapat memanggil method mengajar() <br>
2. Modifikasi fungsi main() sebagai berikut: <br>

`Main.java`

```java
public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen(nip:"19940201", nama:"Widia, S.Kom. M.Kom", nidn:"199482");

        System.out.println(dosen1.nip);
        System.out.println(dosen1.nama);
        System.out.println(dosen1.nidn);
        dosen1.mengajar();
    }
}
```

3. Run dan compile kode program. Amati hasilnya.<br>
   **Hasil Percobaan**<br>

![hasil](/ss/image-1.png)<br>

4. Lakukan upcasting object dosen1 menjadi object dari parent class nya, yaitu Pegawai. Object
   pegawai1 merupakan hasil instansiasi dari class Dosen, tetapi proses upcasting ini membuat
   pegawai1 dikenali dan diperlakukan sebagai object bertipe Pegawai.<br>

`Pegawai.java`

```java
Pegawai pegawai1 = dosen1;
```

5. Modifikasi kode program sebagai berikut: <br>
   `Main.java`

```java
Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M Kom", "199402");

Pegawai pegawai1 = dosen1;

System.out.println(pegawai1.nip);
System.out.println(pegawai1.nama);
System.out.println(pegawai1.nidn);
pegawai1.mengajar();
```

6. Tidak ada compile error pada baris kode upcasting. Error muncul saat mengakses atribut NIDN dan memanggil method mengajar() karena object1 dikenali sebagai object bertipe Pegawai, sementara class Pegawai tidak memiliki atribut NIDN dan method mengajar() <br>

7. Modifikasi fungsi main sebagai berikut : <br>

`Main.java`

```java
Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M Kom", "199402");

Pegawai pegawai1 = dosen1;

System.out.println(pegawai1.nip);
System.out.println(pegawai1.nama);
pegawai1.displayInfo();
```

8. Run dan compile kode program, amati hasilnya<br>

![hasil](/ss/image-2.png)<br>

9. Perhatikan bahwa method displayInfo() dapat dipanggil oleh object pegawai1 karena terdapat method displayInfo() pada class Pegawai sehingga tidak muncul compile error. Tetapi saat program di-run, yang dieksekusi adalah method displayInfo() pada class Dosen, karena adanya overriding<br>

10. Cobalah lakukan downcasting object pegawai1 ke class TenagaKependididikan. Perhatikan bahwa downcasting harus dilakukan secara eksplisit dengan menyebutkan nama subclassnya. <br>

`Main.java`

```java
Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M Kom", "199402");

Pegawai pegawai1 = dosen1;

System.out.println(pegawai1.nip);
System.out.println(pegawai1.nama);
pegawai1.displayInfo();

TenagaKependidikan test = (TenagaKependidikan) pegawai1;
```

11. Tidak terdapat warning pada kode program karena tidak ada compile error sebab TenagaKependidikan merupakan subclass dari class Pegawai. <br>

12. Run program dan amati bahawa terdapat runtime error java.lang.ClassCastException kerena object tersebut bukan instance dari class TenagaKependidikan <br>

13. Cobalah lakukan downcasting object pegawai1 kembali ke class Dosen. <br>

`Main.java`

```java
Dosen newDosen = (Dosen) pegawai1;
```

14. Object newDosen sekarang sudah dikenali kembali sebagai object bertipe Dosen. Oleh karena itu, atribut NIDN dapat diakses dan method mengajar() juga dapat dipanggil <br>

`Main.java`

```java
Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");

Pegawai pegawai1 = dosen1;

System.out.println(pegawail.nip);
System.out.println(pegawai1.nama);
pegawai1.displayInfo();

Dosen newDosen = (Dosen) pegawail;

System.out.println(newDosen.nama);
System.out.println(newDosen.nidn);
newDosen.mengajar();
```

15. Run dan compile kode program kemudian amati hasilnya <br>

![hasil](/ss/modifikasi%205.png) <br>

### **Praktikum 3 : Polymorphic Arguments & instanceOf**

Konsep polimorfisme juga memungkinkan parameter dari suatu method menerima argument dengan berbagai bentuk object asalkan berada dalam hirarki inheritance.
<br>

1. Misalnya pada class Demo terdapat method train() yang bertujuan untuk memberikan pelatihan bagi pegawai baru. <br>

`Main.java`

```java
public static void train(Pegawai pegawai){ System.out println("Memberikan pelatihan untuk pegawai"); pegawai.displayInfo();}
```

2. Dengan konsep polimorfisme, method train() tidak hanya dapat dipanggil dengan argument bertipe Pegawai, tetapi juga subclass Pegawai, yaitu Dosen dan TenagaKependidikan. <br>
3. Modifikasi kode program sebagai berikut <br>

`Main.java`

```java
public class Main {
Run | Debug
public static void main(String[] args) {
Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");

train(dosen1);
train(tendik1);
}

public static void train(Pegawai pegawai){
System.out.println("Memberikan pelatihan untuk pegawai"); pegawai.displayInfo();
  }
}
```

4. Perhatikan bahwa terdapat proses upcasting dalam polymorphic argument, artinya di dalam method train() object pegawai akan dikenali sebagai object bertipe Pegawai, sehingga atribut NIDN dan kategori tidak dapat diakses. Di samping itu, method mengajar() juga tidak dapat dipanggil. <br>

`Main.java`

```java
public class Main {

public static void main(String[] args) {
Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");

train(dosen1);
train(tendik1);
}

public static void train(Pegawai pegawai){
System.out.println("Memberikan pelatihan untuk pegawai"); pegawai.displayInfo();
//hanya test
System.out.println(pegawai.nidn);
System.out.println(pegawai.kategori);
pegawai.mengajar
  }
}
```

5. Jika object perlu dikenali sebagai class asalnya lakukan proses downcasting seperti percobaan sebelumnya. <br>
6. Misalnya method train() memiliki proses yang sedikit berbeda untuk dosen dan tenaga
   kependidikan. Keyword instanceOf dapat digunakan untuk mengetahui dari class mana suatu
   object diinstansiasi. <br>

`Main.java`

```java
public class Main {

public static void main(String[] args) {
Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");

train(dosen1);
train(tendik1);
}

public static void train(Pegawai pegawai){
pegawai.displayInfo();
System.out.println("Mengenalkan lingkungan kampus") ; System.out.println ("Menginfokan SOP/Juknis");

if (pegawai instanceof Dosen) {
System.out.println("Memberikan pelatihan pedagogik");
    }
  }
}
```

7. Run program kemudian amati hasilnya <br>

![hasil](/ss/image-3.png)<br>

### **Pertanyaan**

1. Apakan upcasting dapat dilakukan dari suatu class terhadap class lain yang tidak memiliki relasi inheritance? <br>
   **Jawab:** Tidak, upcasting hanya bisa dilakukan antara kelas yang memiliki relasi inheritance (kelas anak ke kelas induk). Jika tidak ada relasi inheritance, upcasting tidak mungkin dilakukan. <br>

2. Dari 2 baris kode program berikut, manakah proses upcasting yang tepat? Jelaskan

```java
Pegawai pegawai1 = new Dosen();
Pegawai pegawai1 = (Pegawai) new Dosen();
```

**Jawab:**

```java
Pegawai pegawai1 = new Dosen();
```

Upcasting terjadi secara otomatis (implicit upcasting). Karena Dosen adalah subclass dari Pegawai, objek Dosen dapat disimpan di referensi bertipe Pegawai tanpa perlu cast eksplisit. <br>

```java
Pegawai pegawai1 = (Pegawai) new Dosen();
```

Upcasting dilakukan secara eksplisit dengan (Pegawai), meskipun sebenarnya tidak diperlukan karena compiler secara otomatis memahami relasi inheritance di antara kelas Dosen dan Pegawai. <br>

3. Apa fungsi dari keyword instanceOf? <br>
   **Jawab:** Operator instanceof memungkinkan kita untuk memeriksa apakah suatu object milik class tertentu. <br>

4. Apa yang dimaksud heterogenous collection? <br>
   **Jawab:** Heterogeneous collection adalah koleksi yang dapat menyimpan objek dari berbagai tipe data atau kelas. Dalam Java, ini biasanya dicapai dengan menggunakan tipe `Object` atau generics tanpa pembatasan jenis, sehingga koleksi bisa menyimpan objek dari kelas yang berbeda. <br>

5. Sebuah object diinstansiasi dari class Pegawai Kemudian dilakukan downcasting menjadi object bertipe Dosen. Apakah hal ini dapat dilakukan? Lakukan percobaan untuk membuktikannya. <br>
   **Jawab:**

```java
class Pegawai {
    public void kerja() {
        System.out.println("Pegawai bekerja");
    }
}

class Dosen extends Pegawai {
    public void mengajar() {
        System.out.println("Dosen mengajar");
    }
}

public class Main {
    public static void main(String[] args) {
        // Kasus 1: Instansiasi dari Dosen, lalu downcasting ke Dosen
        Pegawai pegawai1 = new Dosen();
        if (pegawai1 instanceof Dosen) {
            Dosen dosen = (Dosen) pegawai1; // Downcasting yang aman
            dosen.mengajar(); // Output: "Dosen mengajar"
        }

        // Kasus 2: Instansiasi dari Pegawai, lalu mencoba downcasting ke Dosen
        Pegawai pegawai2 = new Pegawai();
        if (pegawai2 instanceof Dosen) {
            Dosen dosen = (Dosen) pegawai2; // Akan menghasilkan ClassCastException
            dosen.mengajar();
        } else {
            System.out.println("pegawai2 bukan objek dari kelas Dosen, downcasting tidak aman.");
        }
    }
}
```
