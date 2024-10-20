import java.util.Scanner;

public class Kendaraan {

    Scanner scanner = new Scanner(System.in);

    public static void gas(){
        System.out.println("Kendaraan Maju");
    }
    public static void rem(){
        System.out.println("Kendaraan Berhenti");
    }
    public static void nyalaLampu(){
        System.out.println("Lampu Kendaraan Menyala");
    }
    public static void matiLampu(){
        System.out.println("Lampu Kendaraan Mati");
    }
    public static void belokKiri(){
        System.out.println("Belok Kiri");
    }
    public static void belokKanan(){
        System.out.println("Belok Kanan");
    }
    public  void ketilang(){
        System.out.println("Kendaraan Ketilang");
        System.out.println("Pilih damai atau tilang");
        String pilihanHati = scanner.nextLine();
        String pilihanPasti = pilihanHati.toUpperCase();

        switch (pilihanPasti){
            case "DAMAI" ->System.out.println("Kasih 100 Ribu");
            case "TILANG" -> System.out.println("Urus di kantor");
            default -> System.out.println("Di Penjara");
        }

    }
    public static void klakson(){
        System.out.println("Tiiiiittttttttt");
    }
}
