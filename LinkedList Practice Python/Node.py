class Node:
    def __init__(self, song_name, artist_name):
        # Initialize the node with song and artist details
         self.song_name = song_name  # Store the song name
         self.artist_name = artist_name  # Store the artist name
         self.next = None  # Pointer to the next node in the list, initially None

    def __str__(self):
        # Provide a string representation for easy debugging/printing
        return f"{self.song_name} by {self.artist_name}"