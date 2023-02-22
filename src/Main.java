import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sint = new Scanner(System.in);
        Scanner sstr = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Player> player = new ArrayList<>();

        int random;
        int hpPLayer = 100;
        int punchPlayer = 10;
        int kickPlayer = 7;
        int ultPlayer = 30;
        String statusPlayer = "No";
        int hpBot = 100;
        int punchBot = 5;
        int kickBot = 3;
        int ultBot = 30;
        String statusBot = "No";
        int pilihan;
        do {
            System.out.println("""
                    +==TekKn==+
                    1. Play
                    2. History
                    0. Exit
                    """);
            System.out.print(">>");
            pilihan = sint.nextInt();

            if (pilihan == 1){
                String nama;
                int pilihanMove;
                System.out.print("Insert name: ");
                nama = sstr.nextLine();
            while (hpPLayer > 0){
                    player.add(new Player(nama,0));
                    System.out.println("+========== Fight ==========+");
                    System.out.println(nama + "                 " + " Bot");
                    System.out.println("[//////////]" + "     " + " [//////////]");
                    System.out.println("HP : " + hpPLayer + "          " + "HP : " + hpBot);
                    System.out.println("Punch : " + punchPlayer + "        " + "Punch : " + punchBot);
                    System.out.println("Kick : " + kickPlayer + "          " + "Kick : " + kickBot);
                    System.out.println("Status : " + statusPlayer + "       " + "Status : " + statusBot);
                    System.out.println("+========== ===== ==========+");
                    System.out.println("1. Punch");
                    System.out.println("2. Kick");
                    System.out.println("3. Guard");
                    System.out.println("4. Ult");
                    System.out.print(">>");
                    pilihanMove = sint.nextInt();
                    if (pilihanMove == 1){
                        System.out.println("Player uses punch");
                        if (hpBot <= 30){
                            random = rand.nextInt(0,4);
                        }else{
                            random = rand.nextInt(0,3);
                        }
                        if (random == 2){
                            System.out.println("Bot uses guard");
                            System.out.println("Punch Blocked");
                        }else if (random == 1){
                            System.out.println("Bot uses kick");
                            System.out.println("Your punch hits");
                            hpPLayer = hpPLayer - kickBot;
                            hpBot = hpBot - punchPlayer;
                        } else if (random == 0) {
                            System.out.println("Bot uses punch");
                            System.out.println("Your punch hits");
                            hpPLayer = hpPLayer - punchBot;
                            hpBot = hpBot - punchPlayer;
                        } else if (random == 3) {
                        System.out.println("Bot uses ult");
                        System.out.println("Your punch hits");
                        hpPLayer = hpPLayer - ultBot;
                        hpBot = hpBot - punchPlayer;
                        }
                    } else if (pilihanMove == 2) {
                        System.out.println("Player uses kick");
                        if (hpBot <= 30){
                            random = rand.nextInt(0,4);
                        }else{
                            random = rand.nextInt(0,3);
                        }
                        if (random == 2){
                            System.out.println("Bot uses guard");
                            System.out.println("Your kick hits");
                            hpBot = hpBot - kickPlayer;
                        }else if (random == 1){
                            System.out.println("Bot uses kick");
                            System.out.println("Your kick hits");
                            hpPLayer = hpPLayer - kickBot;
                            hpBot = hpBot - kickPlayer;
                        } else if (random == 0) {
                            System.out.println("Bot uses punch");
                            System.out.println("Your kick hits");
                            hpPLayer = hpPLayer - punchBot;
                            hpBot = hpBot - kickPlayer;
                        } else if (random == 3) {
                            System.out.println("Bot uses ult");
                            System.out.println("Your kick hits");
                            hpPLayer = hpPLayer - ultBot;
                            hpBot = hpBot - kickPlayer;
                        }
                    } else if (pilihanMove == 3) {
                        System.out.println("Player uses guard");
                        if (hpBot <= 30){
                            random = rand.nextInt(0,4);
                        }else{
                            random = rand.nextInt(0,3);
                        }
                        if (random == 2){
                            System.out.println("Bot uses guard");
                        }else if (random == 1){
                            System.out.println("Bot uses kick");
                            System.out.println("Your guard broke");
                            hpPLayer = hpPLayer - kickBot;
                        } else if (random == 0) {
                            System.out.println("Bot uses punch");
                            System.out.println("Successfully blocked");
                        } else if (random == 3) {
                            System.out.println("Bot uses ult");
                            hpPLayer = hpPLayer - ultBot;
                        }
                    } else if (pilihanMove == 4) {
                        System.out.println("Player uses ult");
                        if (hpBot <= 30){
                            random = rand.nextInt(0,4);
                        }else{
                            random = rand.nextInt(0,3);
                        }
                        if (random == 2){
                            System.out.println("Bot uses guard");
                            System.out.println("Your ult hits");
                            hpBot = hpBot - ultPlayer;
                        }else if (random == 1){
                            System.out.println("Bot uses kick");
                            System.out.println("Your ult hits");
                            hpPLayer = hpPLayer - kickBot;
                            hpBot = hpBot - ultPlayer;
                        } else if (random == 0) {
                            System.out.println("Bot uses punch");
                            System.out.println("Your ult hits");
                            hpPLayer = hpPLayer - punchBot;
                            hpBot = hpBot - ultPlayer;
                        } else if (random == 3) {
                            System.out.println("Bot uses ult");
                            System.out.println("Your ult hits");
                            hpPLayer = hpPLayer - ultBot;
                            hpBot = hpBot - ultPlayer;
                        }
                    }
                }
            }
        }while (pilihan != 0);
    }
}