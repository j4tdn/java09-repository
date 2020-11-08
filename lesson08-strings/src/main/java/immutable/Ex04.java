package immutable;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// tim danh sach bai hat co duoi mp3
		String[] musics = { "d:/music/foreverandone.mp4", 
				"d:/music/somethingyoulike.mp3", 
				"d:/music/stronger.mov",
				"d:/music/weakness.mp3" };
		// ouput :somethingyoulike, weakness
		String [] result = getMP3Songs(musics);
		//System.out.println(getMP3Songs(musics));
		
		
		
		System.out.println(String.join("," , result));
	}

	private static String[] getMP3Songs(String[] musics) {
		String[] result = new String[musics.length];
		int index = 0;
		for (String music : musics) {
			if (music.endsWith(".mp3")) {
				int lastSlashIndex = music.lastIndexOf("/");
				int lastDotIndex = music.lastIndexOf(".");
				result[index++] = music.substring(lastSlashIndex + 1, lastDotIndex);

			}
		}

		return Arrays.copyOfRange(result, 0, index);

	}

}
