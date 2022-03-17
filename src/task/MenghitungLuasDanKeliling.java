package task;

public class MenghitungLuasDanKeliling {
    public static void main(String[] args) {
        System.out.println("Luas");
        int luasPersegi = luasPersegi(4);
        int luasSegitiga = luasSegitiga(3, 4);
        int luaspersegiPanjang = luaspersegiPanjang(7, 8);
        System.out.println("Persegi: " + luasPersegi);
        System.out.println("Segitiga: "+ luasSegitiga);
        System.out.println("Persegi Panjang: " + luaspersegiPanjang);
        System.out.println("");
        System.out.println("Keliling");
        int kelilingPersegi = kelilingPersegi(4);
        int kelilingSegitiga = kelilingSegitiga(4);
        int kelilingPersegiPanjang = kelilingPersegiPanjang(7, 8);
        System.out.println("Persegi: " + kelilingPersegi);
        System.out.println("Segitiga: " + kelilingSegitiga);
        System.out.println("Persegi Panjang: " + kelilingPersegiPanjang);
    }

    public static int luasPersegi(int s) {
        return s * s;
    }

    public static int luasSegitiga(int alas, int tinggi) {
        return alas * tinggi / 2;
    }

    public static  int luaspersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static int kelilingPersegi(int sisi) {
        return 4 * sisi;
    }

    public static int kelilingSegitiga(int sisi) {
        return sisi + sisi + sisi;
    }

    public static int kelilingPersegiPanjang(int panjang, int lebar) {
        return panjang + lebar + panjang + lebar;
    }
}