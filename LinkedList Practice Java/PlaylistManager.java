import java.util.Scanner;

public class PlaylistManager {
    public static void main(String[] args) {
        LinkedList playlist = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nPlaylist Manager");
            System.out.println("1. Add song");
            System.out.println("2. Remove song");
            System.out.println("3. Find song");
            System.out.println("4. Display playlist");
            System.out.println("5. Play next song");
            System.out.println("6. Exit");
            
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    System.out.print("Enter song name: ");
                    String songName = scanner.nextLine();
                    System.out.print("Enter artist name: ");
                    String artistName = scanner.nextLine();
                    playlist.addSong(songName, artistName);
                    break;
                case "2":
                    System.out.print("Enter song name to remove: ");
                    songName = scanner.nextLine();
                    System.out.println(playlist.removeSong(songName));
                    break;
                case "3":
                    System.out.print("Enter song name to find: ");
                    songName = scanner.nextLine();
                    System.out.println(playlist.findSong(songName));
                    break;
                case "4":
                    playlist.displayPlaylist();
                    break;
                case "5":
                    playlist.playNextSong();
                    break;
                case "6":
                    System.out.println("Exiting the Playlist Manager.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
