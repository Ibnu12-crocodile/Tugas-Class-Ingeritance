public class Main {
    public static void main(String[] args) {

//        Inisiasi untuk class void
        Mobil mobil = new Mobil();
        Motor motor = new Motor();

//        Inisiasi class Mobil
        Mobil.nyalakanMesin();
        Mobil.nyalaLampu();
        Mobil.gas();
        Mobil.klakson();
        Mobil.belokKanan();
        Mobil.klakson();
        Mobil.belokKiri();
        Mobil.klakson();
        Mobil.klakson();
        Mobil.rem();
        mobil.ketilang();
        Mobil.matiLampu();


        System.out.println("");
//        Inisiasi class Motor
        Motor.nyalakanMesin();
        Motor.nyalaLampu();
        Motor.gas();
        Motor.klakson();
        Motor.belokKiri();
        Motor.klakson();
        Motor.belokKanan();
        Motor.klakson();
        Motor.klakson();
        Motor.rem();
        motor.ketilang();
        Motor.matiLampu();

    }
}