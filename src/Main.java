import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Playlist playlist = new Playlist();
        playlist.addMusic("Trust・Last", "Koda Kumi x Shonan no Kaze");
        playlist.addMusic("liveDevil", "Da-iCE ft. Subaru Kimura");
        playlist.addMusic("ALMIGHTY ~ Kamen no Yakusoku", "Tokyo Ska Paradise Orchestra with Yoohei Kawakami");
        playlist.addMusic("REAL×EYEZ", "LUNA SEA bassist J featuring Takanori Nishikawa");


        int option;

        do {
            System.out.println("Welcome to playlist");
            System.out.println("What do you want to do ?");
            System.out.println("1. Show playlist");
            System.out.println("2. add music");
            System.out.println("3. Show current music");
            System.out.println("4. Go to the next music");
            System.out.println("5. Go to the previous music");
            System.out.println("6. Exit");

            System.out.print("Please input your option : ");
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1 -> {
                    playlist.printPlaylist();
                    scan.nextLine();
                }
                case 2 -> {
                    System.out.print("Input music title : ");
                    String title = scan.nextLine();
                    System.out.print("Input music perfomer : ");
                    String performer = scan.nextLine();
                    playlist.addMusic(title, performer);
                }
                case 3 -> {
                    playlist.printCurrentMusic();
                    scan.nextLine();
                }
                case 4 -> playlist.next();
                case 5 -> playlist.prev();
                case 6 -> System.out.println("Thank you");
                default -> System.out.println("Invalid input");
            }
        } while(option != 6);
    }
}