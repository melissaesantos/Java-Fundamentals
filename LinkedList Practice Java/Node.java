

public class Node {
    String songName;
    String artistName;
    Node next;
    //node has a memory address for where it is located in the computer
    //a singly linked list has a head ->Node(value).next-> Node2(value).bext->
    //accessing or looking for a node is O(n)
    //adding or subrtracting a node is O(1)
    //DOublly linked list also has a prev 
   public Node(String songName, String artistName){
        this.songName = songName;
        this.artistName= artistName;
        this.next = null; //intially the next is null 
   }

   @Override
   public String toString(){
    return songName + "by" + artistName;
   }
}
