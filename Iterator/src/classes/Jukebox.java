package classes;

/**
 * @author smileperience
 * Class for storing sample data
 */
public class Jukebox {
	private int songs_available;
	private MusicGenre genre;
	/**
	 * @param genre  - Genre of a song for jukebox to keep
	 * @param songs - Number of songs stored in jukebox
	 */
	public Jukebox(MusicGenre genre, int songs){
		this.genre = genre;
		this.songs_available=songs;
	}
	
	/**
	 * @return number of songs available in jukebox
	 */
	public int getSongs_available() {
		return songs_available;
	}
	/**
	 * @return Genre of music stored in jukebox
	 */
	public MusicGenre getGenre() {
		return genre;
	}
	@Override
	public String toString(){
		return "There are "+ this.songs_available + " songs available in the "+this.genre+ " genre";
	}
}
