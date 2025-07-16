package collections.list;

import java.util.List;

// Music Player Playlist (Add/Remove Songs)  :: LinkedList
// Create a playlist to add songs : same songs should be added in playlist
// should allow add and remove songs from playlist
// every playlist should have a name
class Songs {
  String id;
  String name;
  String artist;
}

class PlayList {
  String id;
  String name;
  List<Songs> songs;
}

public class MusicPlayer {
}
