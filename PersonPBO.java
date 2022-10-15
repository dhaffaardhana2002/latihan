public class PersonPBO {
	public static void main(String[] args) {
		Person anton = new Person();

		anton.Nama = "Anton Ramadhan";
		anton.JenisKelamin = "Laki-laki";
		anton.Umur = 20;

		System.out.println("Nama saya " + anton.Nama);
		System.out.println("Saya " + anton.JenisKelamin);
		System.out.println("Umur saya " + anton.Umur);


		Person riko = new Person();

		riko.Nama = "Riko Raulramos";
		riko.JenisKelamin = "Laki-laki";
		riko.Umur = 22;

		System.out.println("\nNama saya " + riko.Nama);
		System.out.println("Saya " + riko.JenisKelamin);
		System.out.println("Umur saya " + riko.Umur);
	}
}