# Tugas PBO Pertemuan 4

Nama: Muhammad Dhaffa Ardhana Rianto Putra
NIM: 312110029
Kelas: TI.21.C.2

Disini saya akan menunjukkan tutorial mengeksekusi Java untuk membuat objek Person diantaranya Anton dan Riko

## Buat file dan kode Java

- Buat file dengan nama bebas dengan ekstensi file `.java`
- Tulis kode java seperti berikut

```
public class PersonPBO {
	public static void main(String[] args) {
	
	}
}
```

- Untuk membuat objek constructor, buat file di folder yang sama dengan nama `Person.java`
- Tulis kode java seperti berikut

```
public class Person {
	String Nama;
	String JenisKelamin;
	int Umur;
}
```

- Di dalam file diawal, tambahkan kode didalam `main()` dengan kode sebagai berikut, untuk menambahkan objek baru dari objek constructor yang sudah dibuat

```
Person orang1 = new Person();
```

- Tambahkan `Nama`, `JenisKelamin`, dan `Umur` untuk properti objek `orang1` dan assign value nya dengan nama Anton, jenis kelamin, dll. seperti berikut

```
orang1.Nama = "Anton Ramadhan";
orang1.JenisKelamin = "Laki-laki";
orang1.Umur = 20;
```

- Print hasil dengan kode berikut

```
System.out.println("Nama saya " + orang1.Nama);
System.out.println("Saya " + orang1.JenisKelamin);
System.out.println("Umur saya " + orang1.Umur);
```

- Lakukan hal yang sama pada `orang2` namun dengan nama Riko
- Print juga hasil untuk Riko
- Save semua file
- Buka cmd (Command Prompt)
- Pergi menuju folder yang sudah dibuat dengan menggunakan `cd ...`
- Lalu eksekusi dengan mengetik

```
javac TugasSaya.java
```

dan

```
javac Person.java
```

- Jika berhasil dan tidak ada error, ketik

```
java TugasSaya
```

- Tampilan nya akan seperti ini

```
Nama saya Anton Ramadhan
Saya Laki-laki
Umur saya 20

Nama saya Riko Raulramos
Saya Laki-laki
Umur saya 22
```

![Screenshot Hasil]{/cmd javac PersonPBO.png}

___
Terima kasih untuk membaca tutorial saya. Tak lupa juga untuk dosen saya dan teman-teman saya yang sudah membantu saya.
