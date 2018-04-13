package classes;

public class Jukebox {
	private int songs_available;
	private MusicGenre genre;
	public Jukebox(MusicGenre genre, int songs){
		this.genre = genre;
		this.songs_available=songs;
	}
	
	public int getSongs_available() {
		return songs_available;
	}
	public MusicGenre getGenre() {
		return genre;
	}
	@Override
	public String toString(){
		return "There are "+ this.songs_available + " songs available in the "+this.genre+ " genre";
	}
}
