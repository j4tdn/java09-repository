package immutable;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		String s1 = "D:/music/foreverandone.mp3";
		String s2 = "D:/music/somethingyoulike.mp3";
		String s3 = "D:/music/stronger.mp4";
		String s4 = "D:/music/nostronger.mp4";
		String[] musics = { s1, s2, s3, s4 };
		String[] result=getMp3Songs(musics);
		System.out.println(String.join(" - ",result));

	}

	private static String[] getMp3Songs(String[] musics) {
		String[] result = new String[musics.length];
		int index = 0;
		for (String music : musics) {
			if (music.endsWith(".mp3")) {
				int lastSlashIndex = music.lastIndexOf('/');
				int lastDotIndex = music.lastIndexOf('.');
				result[index++] = music.substring(lastSlashIndex + 1, lastDotIndex);
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}

}
