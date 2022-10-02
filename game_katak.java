import java.util.Scanner;   //library untuk melakukan input
import java.util.Random;    //library untuk menghasilkan angka acak

/**
 * Source code java untuk membuat permainan LOMPAT HAI KATAK, LOMPAT!
 * 
 * @author Muhammad Akbarul Ihsan
 * @version 11.0.15.1
 * {@link https://drive.google.com/file/d/1jl15zN7scomqqhroubcD8UHwqlmaNcP4/view?usp=sharing}
 */

public class game_katak{

    /**
     * The main method that reads input, calls the function 
     * for each question's query, and output the results.
     * @param args Unused.
     * @return Nothing.
     */

    //inisialisasi variabel
    private static int[] kotak = new int[500];
    private static int kesulitan;
    private static int posisi_monster;
    private static int posisi_koin;
    private static String perintah;
    private static int posisi_katak;
    private static int poin;
    private static String lagi;
    private static int nilai_akhir;

    static Random rand = new Random();
  
    public static void PutMonster(int kesulitan){
        int jumlah_monster_cacing;
        int jumlah_monster_slime;
        int jumlah_monster_jamur;
        switch(kesulitan){
            case 1:
                jumlah_monster_cacing = 25;
                for(int i = 0 ; i < jumlah_monster_cacing ; i++){
                    posisi_monster=(int)rand.nextInt(kotak.length);
                    while(kotak[posisi_monster] != 0){
                            if (posisi_monster == (kotak.length - 1)){
                                posisi_monster = 0;
                                continue;
                            }
                        posisi_monster++;
                    }
                    kotak[posisi_monster] = 1;
                }
                jumlah_monster_slime = 15;
                for(int i = 0 ; i < jumlah_monster_slime ; i++){
                    posisi_monster=(int)rand.nextInt(kotak.length);
                    while(kotak[posisi_monster] != 0){
                            if (posisi_monster == (kotak.length - 1)){
                                posisi_monster = 0;
                                continue;
                            }
                        posisi_monster++;
                    }
                    kotak[posisi_monster] = 2;
                }
                jumlah_monster_jamur = 10;
                for(int i = 0 ; i < jumlah_monster_jamur ; i++){
                    posisi_monster=(int)rand.nextInt(kotak.length);
                    while(kotak[posisi_monster] != 0){
                            if (posisi_monster == (kotak.length - 1)){
                                posisi_monster = 0;
                                continue;
                            }
                        posisi_monster++;
                    }
                    kotak[posisi_monster] = 3;
            }
            break;

            case 2:
            jumlah_monster_cacing = 50;
            for(int i = 0 ; i < jumlah_monster_cacing ; i++){
                posisi_monster=(int)rand.nextInt(kotak.length);
                while(kotak[posisi_monster] != 0){
                        if (posisi_monster == (kotak.length - 1)){
                            posisi_monster = 0;
                            continue;
                        }
                    posisi_monster++;
                }
                kotak[posisi_monster] = 1;
            }
            jumlah_monster_slime = 30;
            for(int i = 0 ; i < jumlah_monster_slime ; i++){
                posisi_monster=(int)rand.nextInt(kotak.length);
                while(kotak[posisi_monster] != 0){
                        if (posisi_monster == (kotak.length - 1)){
                            posisi_monster = 0;
                            continue;
                        }
                    posisi_monster++;
                }
                kotak[posisi_monster] = 2;
            }
            jumlah_monster_jamur = 20;
            for(int i = 0 ; i < jumlah_monster_jamur ; i++){
                posisi_monster=(int)rand.nextInt(kotak.length);
                while(kotak[posisi_monster] != 0){
                        if (posisi_monster == (kotak.length - 1)){
                            posisi_monster = 0;
                            continue;
                        }
                    posisi_monster++;
                }
                kotak[posisi_monster] = 3;
        }
        break;

            case 3:
            jumlah_monster_cacing = 70;
            for(int i = 0 ; i < jumlah_monster_cacing ; i++){
                posisi_monster=(int)rand.nextInt(kotak.length);
                while(kotak[posisi_monster] != 0){
                        if (posisi_monster == (kotak.length - 1)){
                            posisi_monster = 0;
                            continue;
                        }
                    posisi_monster++;
                }
                kotak[posisi_monster] = 1;
            }
            jumlah_monster_slime = 50;
            for(int i = 0 ; i < jumlah_monster_slime ; i++){
                posisi_monster=(int)rand.nextInt(kotak.length);
                while(kotak[posisi_monster] != 0){
                        if (posisi_monster == (kotak.length - 1)){
                            posisi_monster = 0;
                            continue;
                        }
                    posisi_monster++;
                }
                kotak[posisi_monster] = 2;
            }
            jumlah_monster_jamur = 30;
            for(int i = 0 ; i < jumlah_monster_jamur ; i++){
                posisi_monster=(int)rand.nextInt(kotak.length);
                while(kotak[posisi_monster] != 0){
                        if (posisi_monster == (kotak.length - 1)){
                            posisi_monster = 0;
                            continue;
                        }
                    posisi_monster++;
                }
                kotak[posisi_monster] = 3;
        }
        break;
        }
    }

    public static void PutKoin(int kesulitan){
        int keping_koin;
        int kantung_koin;
        int karung_koin;
        switch(kesulitan){
            case 1:
            keping_koin = 120;
                for(int i = 0 ; i < keping_koin ; i++){
                    posisi_koin = (int)rand.nextInt(kotak.length);
                    while(kotak[posisi_koin] != 0){
                            if (posisi_koin == (kotak.length - 1)){
                                posisi_koin = 0;
                                continue;
                            }
                        posisi_koin++;
                    }
                    kotak[posisi_koin] = 4;
            }
            kantung_koin = 80;
            for(int i = 0 ; i < kantung_koin ; i++){
                posisi_koin = (int)rand.nextInt(kotak.length);
                while(kotak[posisi_koin] != 0){
                        if (posisi_koin == (kotak.length - 1)){
                            posisi_koin = 0;
                            continue;
                        }
                    posisi_koin++;
                }
                kotak[posisi_koin] = 5;
        }
        karung_koin = 50;
        for(int i = 0 ; i < karung_koin ; i++){
            posisi_koin = (int)rand.nextInt(kotak.length);
            while(kotak[posisi_koin] != 0){
                    if (posisi_koin == (kotak.length - 1)){
                        posisi_koin = 0;
                        continue;
                    }
                posisi_koin++;
            }
            kotak[posisi_koin] = 6;
    }
            break;

            case 2:
            keping_koin = 100;
                for(int i = 0 ; i < keping_koin ; i++){
                    posisi_koin = (int)rand.nextInt(kotak.length);
                    while(kotak[posisi_koin] != 0){
                            if (posisi_koin == (kotak.length - 1)){
                                posisi_koin = 0;
                                continue;
                            }
                        posisi_koin++;
                    }
                    kotak[posisi_koin] = 4;
            }
            kantung_koin = 70;
            for(int i = 0 ; i < kantung_koin ; i++){
                posisi_koin = (int)rand.nextInt(kotak.length);
                while(kotak[posisi_koin] != 0){
                        if (posisi_koin == (kotak.length - 1)){
                            posisi_koin = 0;
                            continue;
                        }
                    posisi_koin++;
                }
                kotak[posisi_koin] = 5;
        }
        karung_koin = 30;
        for(int i = 0 ; i < karung_koin ; i++){
            posisi_koin = (int)rand.nextInt(kotak.length);
            while(kotak[posisi_koin] != 0){
                    if (posisi_koin == (kotak.length - 1)){
                        posisi_koin = 0;
                        continue;
                    }
                posisi_koin++;
            }
            kotak[posisi_koin] = 6;
    }
            break;

            case 3:
            keping_koin = 80;
                for(int i = 0 ; i < keping_koin ; i++){
                    posisi_koin = (int)rand.nextInt(kotak.length);
                    while(kotak[posisi_koin] != 0){
                            if (posisi_koin == (kotak.length - 1)){
                                posisi_koin = 0;
                                continue;
                            }
                        posisi_koin++;
                    }
                    kotak[posisi_koin] = 4;
            }
            kantung_koin = 50;
            for(int i = 0 ; i < kantung_koin ; i++){
                posisi_koin = (int)rand.nextInt(kotak.length);
                while(kotak[posisi_koin] != 0){
                        if (posisi_koin == (kotak.length - 1)){
                            posisi_koin = 0;
                            continue;
                        }
                    posisi_koin++;
                }
                kotak[posisi_koin] = 5;
        }
        karung_koin = 20;
        for(int i = 0 ; i < karung_koin ; i++){
            posisi_koin = (int)rand.nextInt(kotak.length);
            while(kotak[posisi_koin] != 0){
                    if (posisi_koin == (kotak.length - 1)){
                        posisi_koin = 0;
                        continue;
                    }
                posisi_koin++;
            }
            kotak[posisi_koin] = 6;
    }
            break;

        }
    }

    public static void menu(){
        System.out.println("\t ------------------------------------- \t");
        System.out.println("\t |PERMAINAN LOMPAT HAI KATAK, LOMPAT!| \t");
        System.out.println("\t ------------------------------------- \t");
        System.out.println("PILIHAN KESULITAN");
        System.out.println("1. EASY");
        System.out.println("2. INTERMEDIATE");
        System.out.println("3. HARD");
    }

    public static void Lompat(String perintah){
        if (perintah.equals("d") || perintah.equals("D") ){
            posisi_katak += 1;
            System.out.println("\nkatak berada di kotak ke-" + posisi_katak + "\n");
        }
        else if (perintah.equals("a") || perintah.equals("A")){
            posisi_katak -= 1;
            if (posisi_katak < 0){
                System.out.println("\ntidak ada kotak yang dapat dilompati\n");
                posisi_katak += 1;
            }
            System.out.println("\nkatak berada di kotak ke-" + posisi_katak + "\n");
        }
        else if(perintah.equals("e") || perintah.equals("E")){
            posisi_katak += 2;
            if(posisi_katak < 500)
            System.out.println("\nkatak berada di kotak ke-" + posisi_katak + "\n");
            else if (posisi_katak >= 500)
            System.out.println("\nkatak berhasil keluar dari kotak terakhir\n");
        }
        else if(perintah.equals("q") || perintah.equals("Q")){
            posisi_katak -= 2;
            if (posisi_katak < 0){
                System.out.println("\ntidak ada kotak yang dilompati\n");
                posisi_katak += 2;
            }
            System.out.println("\nkatak berada di kotak ke-" + posisi_katak + "\n");
        }
        else {
            System.out.println("\nINPUT YANG ANDA MASUKKAN TIDAK VALID");
            System.out.println("COBA LAGI \n");
            System.out.println("katak masih berada di kotak ke-" + posisi_katak + "\n");
        }
    }

    public static void MenuLompat(){
        System.out.println("\nPilihan gerakan");
        System.out.println("---------------");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("|D = MAJU SELANGKAH || A = MUNDUR SELANGKAH || E = MUNDUR 2 LANGKAH || Q = MUNDUR 2 LANGKAH|");
        System.out.println("-------------------------------------------------------------------------------------------");
        // System.out.println("a = mundur selangkah");
        // System.out.println("e = maju 2 langkah");
        // System.out.println("q = mundur 2 langkah\n");
        System.out.println("Saat ini katak berada di kotak " + posisi_katak);
    }

    public static void Poin(){
        if(kotak[posisi_katak] == 1){
            poin -= 5;
            System.out.println("------------------------------");
            System.out.println("|katak bertemu monster cacing|");
            System.out.println("|   Katak kehilangan FROIN   |");
            System.out.println("------------------------------");
            System.out.println("poin anda : " + poin);
            kotak[posisi_katak] = 0;
        }
        else if(kotak[posisi_katak] == 2){
            poin -= 10;
            System.out.println("-----------------------------");
            System.out.println("|katak bertemu monster slime|");
            System.out.println("|  Katak kehilangan FROIN   |");
            System.out.println("-----------------------------");
            System.out.println("poin anda : " + poin);
            kotak[posisi_katak] = 0;
        }
        else if(kotak[posisi_katak] == 3){
            poin -= 20;
            System.out.println("-----------------------------");
            System.out.println("|katak bertemu monster jamur|");
            System.out.println("|   Katak kehilangan FROIN  |");
            System.out.println("-----------------------------");
            System.out.println("poin anda : " + poin);
            kotak[posisi_katak] = 0;
        }
        if(kotak[posisi_katak] == 4){
            poin += 10;
            System.out.println("----------------------------------");
            System.out.println("|katak mendapatkan sekeping FROIN|");
            System.out.println("----------------------------------");
            System.out.println("poin anda : " + poin);
            kotak[posisi_katak] = 0;
        }
        else if(kotak[posisi_katak] == 5){
            poin += 15;
            System.out.println("---------------------------------");
            System.out.println("|katak mendapatkan kantung FROIN|");
            System.out.println("---------------------------------");
            System.out.println("poin katak anda : " + poin);
            kotak[posisi_katak] = 0;
        }
        if(kotak[posisi_katak] == 6){
            poin += 20;
            System.out.println("--------------------------------");
            System.out.println("|katak mendapatkan karung FROIN|");
            System.out.println("--------------------------------");
            System.out.println("poin katak anda : " + poin);
            kotak[posisi_katak] = 0;
        }
        
    }

    public static void GameOver() {
            System.out.println("-----------------------------");
            System.out.println("|   KATAK KEHABISAN FROIN   |");
            System.out.println("|   PERMAINAN BERAKHIR      |");
            System.out.println("-----------------------------");
        }
    
    public static void Inisial(){
        poin = 100;
        posisi_katak = 0;
        nilai_akhir = 0;
        for(int i = 0 ; i < kotak.length ; i++){
            kotak[i] = 0;
        }
    }

    public static void KomentarAkhir(){
        if (poin >= 0 && poin <= 20 ){
            int min = 1;
            int max = 3;
            int range = max - min + 1;
            nilai_akhir = (int)(Math.random() * range) + min ;
            PilihanKomentar();
        }

        if (poin > 20 && poin <= 700){
            int min = 4;
            int max = 6;
            int range = max - min + 1;
            nilai_akhir = (int)(Math.random() * range) + min ;
            PilihanKomentar();
        }

        if (poin > 700 && poin <= 1500){
            int min = 7;
            int max = 9;
            int range = max - min + 1;
            nilai_akhir = (int)(Math.random() * range) + min ;
            PilihanKomentar();
        } 
        if (poin > 1500){
            int min = 10;
            int max = 12;
            int range = max - min + 1;
            nilai_akhir = (int)(Math.random() * range) + min ;
            PilihanKomentar();
        }
    }

    public static void PilihanKomentar(){
        switch(nilai_akhir){
            case 1:
            System.out.println("\t=======================");
            System.out.println("\tTITIK DARAH PENGHABISAN");
            System.out.println("\t=======================");
            break;

            case 2:
            System.out.println("\t========");
            System.out.println("\tDIE HARD");
            System.out.println("\t========");
            break;
            
            case 3:
            System.out.println("\t===========================");
            System.out.println("\tBAGAI TELUR DI UJUNG TANDUK");
            System.out.println("\t===========================");
            break;

            case 4:
            System.out.println("\t===========");
            System.out.println("\tPRETTY GOOD");
            System.out.println("\t===========");
            break;

            case 5:
            System.out.println("\t================");
            System.out.println("\tSATISFACTORY END");
            System.out.println("\t================");
            break;

            case 6:
            System.out.println("\t===========================");
            System.out.println("\tFROIN AKHIR ANDA BIASA SAJA");
            System.out.println("\t===========================");
            break;

            case 7:
            System.out.println("\t=========");
            System.out.println("\tEXCELLENT");
            System.out.println("\t=========");
            break;

            case 8:
            System.out.println("\t===========");
            System.out.println("\tOUTSTANDING");
            System.out.println("\t===========");
            break;

            case 9:
            System.out.println("\t=============");
            System.out.println("\tLUAR BIASA!!!");
            System.out.println("\t=============");
            break;

            case 10:
            System.out.println("\t==============");
            System.out.println("\tUNBELIEVEABLE");
            System.out.println("\t==============");
            break;

            case 11:
            System.out.println("\t===========");
            System.out.println("\tMAGNUM OPUS");
            System.out.println("\t===========");
            break;

            case 12:
            System.out.println("\t===========");
            System.out.println("\tMASTERPIECE");
            System.out.println("\t===========");
            break;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        do{
        Inisial();
        try{
            menu();
            System.out.print("Pilih kesulitan : " );
            kesulitan = in.nextInt();
            if(kesulitan == 1 || kesulitan == 2 || kesulitan == 3){
                PutMonster(kesulitan);
                PutKoin(kesulitan);   
            }
            else {
                System.out.println("input anda tidak valid");
                break;
            }
        } catch(Exception e){
            System.out.println("Format Input salah");
            break;
        }
        
        while(posisi_katak < 500){
            do{
                MenuLompat();
                System.out.print("masukkann gerakan : ");
                perintah = in.next();
                if (perintah.length() != 1){
                    System.out.println("\nmasukkan 1 huruf saja !!!");
                }
            }while(perintah.length() != 1);
            Lompat(perintah);
            if(posisi_katak >= 500){
                break;  
            }
            Poin();
            if (poin < 0){
                GameOver();
                break;
            }
        }
        if(posisi_katak >= 499){
            System.out.println("SELAMAT ANDA BERHASIL MENCAPAI KOTAK TERAKHIR");
            System.out.println("FROIN YANG BERHASIL ANDA KUMPULKAN SEJAUH INI ADALAH SEBANYAK " + poin);
            KomentarAkhir();
        }
        System.out.println("apakah anda mau main lagi ?");
        System.out.println("jika anda ingin main lagi tekan y");
        System.out.println("jika ingin berhenti tekan n");
        lagi = in.next();
        while(lagi.length() != 1){
            System.out.println("masukkan 1 huruf saja");
            lagi = in.next();
        }

        }while (lagi.equals("y") || lagi.equals("Y"));
        System.out.println("anda telah keluar dari permainan");
        System.out.println("terima kasih telah bermain");
        in.close();
    }
}