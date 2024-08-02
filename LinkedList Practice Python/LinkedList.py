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

