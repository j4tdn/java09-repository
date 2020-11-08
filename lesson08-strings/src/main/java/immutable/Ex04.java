package immutable;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		String[] musics = {
			"d:/music/foreverandone.mp4",
			"d:/music/somethingulike.mp3",
			"d:/music/stronger.mov",
			"d:/music/weakness.mp3"
		};
		String [] result = getMp3Songs(musics);
		System.out.println(String.join(", ", result));
	}
	
	private static String[] getMp3Songs (String[] musics) {
		String[] result = new String[musics.length];
		int index = 0;
		for(String x : musics) {
			if (x.endsWith(".mp3")) {
				String nameSong = x.substring(x.lastIndexOf("/"));
				result[index++]= nameSong.substring(1,nameSong.lastIndexOf(".mp3")) ;
			}
		}
		return Arrays.copyOfRange(result, 0,index);
	}
}
