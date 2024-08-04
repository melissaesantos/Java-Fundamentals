

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
            newNode.previous = tail;
            tail = newNode;
            tail.next = newNode;
        }

        
    }

    public String removeSong(String songName){
        Node curr = head;
        Node prev = null;

        while(curr!= null){
            if(curr.songName.equals(songName)){
               if(curr == head){
                head = curr.next;
                if(head!=null){
                    head.previous =null;
                }
               }else if(curr == tail){
                tail = curr.previous;
                tail.next = null;
               }else{//here we are removing from the middle of the list
                curr.previous.next = curr.next;
                curr.next.previous = curr.previous;

               }
            }
          // prev = curr;
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

    public void playNextSong(){
        if(head == null){
            System.out.println("The playlist is empty");
        }
        System.out.println("Playing: " + head);
        head = head.next;
        if(head != null){
            head.previous = null;
        }else{
            tail = null;      //if head is null then the list is empty   
        }
    }
// now we are going to implement the doubly linked list 
    public void playPrevious(){
        if(tail == null){
            System.out.println("No pervious song to play");
            return;
        }
        System.out.println("Playing: " + tail);
        tail = tail.previous;
        if(tail!= null){
            tail.next = null; //uodating the tails next to be null
        }else{
            head = null;
        }

    }
}
