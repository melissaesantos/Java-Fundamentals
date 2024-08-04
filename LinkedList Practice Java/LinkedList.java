public class LinkedList {
    private Node head;
    private Node tail;
    

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addSong(String songName, String artistName){
        Node newNode = new Node(songName, artistName);
        //check ig this is the first song in the playlist
        if (head ==null){
            head = newNode;
            tail = newNode;
        }else{
            //this is not the first song so we are adding it to the end
            tail = newNode;
            tail.next = newNode;
        }

        
    }

    public String removeSong(String songName, String artistName){
        Node curr = head;
        Node prev = null;

        while(curr!= null){
            if(curr.songName.equals(songName)){
                //now we need to check if its the first one in the list or not
                if(prev != null){
                    prev.next = curr.next;
                }else{
                    head = curr.next;
                }
                //here we are checking if it is the last song we want to remove
                if (curr == tail){
                    tail = prev;
                }
                return "Removed" + songName;
            }
            prev = curr;
            curr = curr.next;
        }
        return "Song '" + songName + "' not found.";
    }


    public String findSong(String songName){
        Node curr = head;
        int pos = 1;
        while(curr!=null){
            if(curr.songName.equals(songName)){
                return "Found '" + songName + "' at position " + pos + ".";
            }
            curr = curr.next;
            pos++;
        }
        return "Song '" + songName + "' not found.";
    }

    public void displayPlaylist(){
        if(head == null){
            System.out.println("The Playlist is empty.");
            return;
        }

        Node curr = head;
        while(curr!=null){
            System.out.println(curr);
            curr = curr.next;
        }
    }
}
