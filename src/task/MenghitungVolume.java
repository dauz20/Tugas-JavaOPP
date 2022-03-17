package task;

public class MenghitungVolume {
    public static void main(String[] args) {
        System.out.println("Volume");
        System.out.println("Kubus : " + volumeKubus(10));
        System.out.println("Balok : " + volumeBalok(3, 6, 10));
        System.out.println("Tabung :" + volumeTabung(7, 10));

    }

    public static int volumeKubus(int s) {
        return s * s * s;
    }

    public static int volumeBalok(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    public static int volumeTabung(int radius, int tinggi) {
        return 22 * radius * radius * tinggi / 7;
    }
}
