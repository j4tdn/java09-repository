package immutable;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		String[] musics = { "d:/music/foreverandone.mp4", "d:/music/somethingulike.mp3", "d:/music/stronger.mp4",
				"d:/music/weakness.mp3" };
		System.out.println(getMp3Songs(musics));
	}

	private static String getMp3Songs(String[] musics) {
		String[] result = new String[musics.length];
		int index = 0;
		for (String music : musics) {
			if (music.endsWith(".mp3")) {
				result[index++] = music.substring(music.lastIndexOf("/") + 1, music.lastIndexOf("."));
			}
		}
		return String.join(", ", Arrays.copyOfRange(result, 0, index));
	}
}
