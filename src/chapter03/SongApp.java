package chapter03;

public class SongApp {

	public static void main(String[] args) {
		
		Song song = new Song("좋은 날","아이유","좋은 날","이민수",2010,3);
		
//		song.setAlbum("Real");
//		song.setArtist("아이유");
//		song.setComposer("이민수");
//		song.setTitle("좋은 날");
//		song.setYear(2010);
//		song.setTrack(3);
		
		song.show();

		Song song2 = new Song("원더우먼", "브라운아이드걸스");
		
//		song2.setTitle("원더우먼");
//		song2.setArtist("브라운아이드걸스");
		
		song2.show();
	}
		

}
