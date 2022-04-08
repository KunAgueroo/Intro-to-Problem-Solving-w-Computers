import java.util.ArrayList;
public class SongList {
    ArrayList<Song> songList;
       
   public SongList(){
     songList = new ArrayList<Song>();
      }
   
   public boolean isEmpty(){
      return songList.isEmpty();
      }
   
   public void addSong(Song newSong){
     if(newSong != null)
     songList.add(newSong);
      }
   
   public String getSongListAsString(){
      if(songList.isEmpty())
        return "no songs";
      else
        {
        StringBuilder x = new StringBuilder();
   
        for(int i = 1; i <= songList.size(); i++)
        x.append( i + " " + songList.get(i-1).toString() + "\n");
        return x.toString();
        }
      }
   
   public boolean removeSongByTitle(String targetTitle){
      for(int i = 0; i < songList.size(); i++){
         if(songList.get(i).getTitle().equalsIgnoreCase(targetTitle)){
            songList.remove(i);
            return true;
          }
        }
            return false;
      }
   
   public ArrayList<Song> getSongList(){
      return songList;
      }

   public void clearSongList(){
    songList.clear();
      }
    
}