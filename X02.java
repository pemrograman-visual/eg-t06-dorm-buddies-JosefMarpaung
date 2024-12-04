// 12S24005 - MIA NATHANIA SIBUEA
// 12S24036 - JOSEP CHRISTIAN MARPAUNG
import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nama = new String[10];
        int i;

        i = 0;
        add(nama);
        ruang(nama);
        output(nama);
    }
    
    public static void add(String[] nama) {
        nama[0] = "";
        nama[1] = "";
        nama[2] = "";
        nama[3] = "";
        nama[4] = "";
        nama[5] = "";
        int i;

        i = 0;
    }
    
    public static void output(String[] nama) {
        int i;

        for (i = 0; i <= 3; i++) {
            if (nama[i].equals("---")) {
                i = i + 1;
            } else {
                System.out.println(nama[i]);
            }
        }
    }
    
    public static void ruang(String[] nama) {
        int i;

        for (i = 0; i <= 5; i++) {
            nama[i] = "";
            while (i < 4) {
                nama[i] = input.nextLine();
                if (nama[i].equals("---")) {
                    i = 4;
                } else {
                    i = i + 1;
                }
            }
        }
    }
}

