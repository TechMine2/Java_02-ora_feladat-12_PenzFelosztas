package javaapp_02_penzfelosztas;

import java.util.Scanner;

public class JavaApp_02_PenzFelosztas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy összeget");
        int penz = sc.nextInt();
        
        int[] fizetoEszkoz = {20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};
        
        int kerekitettErtek = (int) (Math.round(penz/5.0)*5);
        
        int i=0;
        do {
            int db=kerekitettErtek / fizetoEszkoz[i];
            if (db > 0) {
                System.out.println(fizetoEszkoz[i] + " Ft: " + db + " db");
            }
            kerekitettErtek %= fizetoEszkoz[i];
            i++;
        } while (kerekitettErtek>0);
    }
    
}
