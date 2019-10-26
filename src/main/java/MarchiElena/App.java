package MarchiElena;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dammi xp: ");
        int current_xp = scan.nextInt();
        System.out.println("Dammi livello: ");
        int target_lvl = scan.nextInt();
        scan.close();
        System.out.println("Punti: " + xp_to_target_lvl(current_xp, target_lvl));
    }

    public static String xp_to_target_lvl(int current_xp, int target_lvl) {

        if (target_lvl < 0 || target_lvl > 171 || current_xp < 0) {
            return "Input is invalid";
        }

        int livello = 1;
        int xp = 314;
        int percentule = 25;
        int somma = 0;
        while (livello < target_lvl) {
            somma += xp;
            livello++;
            int riduzioneXP = livello / 10;
            xp += (int) xp * (percentule - riduzioneXP) / 100;

        }
        int diff = somma;
        if (diff <= 0) {
            return "You have already reached level " + target_lvl + ".";
        } else {
            return "" + diff;
        }
    }
}
