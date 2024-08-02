from node import Node

class LinkedList:
    def __init__(self):
        # Initialize the linked list
        self.head = None
        self.tail = None
#add sonf at the end ofthe list 
    def add_song(self,songName,artistName):
        newNode = Node("HOTTOGO", "ChapelleRoan")
        #lets check if this is the first node in the list
        if not self.head:
            self.head = newNode
            self.tail =newNode
        else:
            #updating what comes next fter the tail
            self.tail.next = newNode
            #setting the tail to be the new node
            self.tail = newNode

    def remove_song(self, songName):
        curr = self.head
        prev = None

        while curr != None:
            if(curr.song_name == songName):
                #now we want to delete this node
                #need to change the next of the previous node
                #we also need to the new node \.next = curr.next 
                if prev!= self.head: #checking if previous is the first node
                    prev.next = curr.next
                #the case in which previous is the first node                      
                else:
                    self.head = curr.next
                #what if it is the tail that we want to remove
                if curr == self.tail:
                    self.tail = prev

                return f"Removed: {songName}"
            prev = curr
            curr = curr.next
        return f"Song '{songName}' not found."    


    def find_song(self,song_name):
        curr = self.head
        position = 1

        while curr != None:
            if curr.song_name == songName:
                return f"Found '{song_name}' at position {position}."
            curr = curr.next
            position += 1

        return f"Song '{song_name}' not found."
