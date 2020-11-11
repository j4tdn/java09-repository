package immutable;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		String[] music = { "d:/music/tanka.mp3", "d:/music/doibo.mp4", "d:/music/ngaytan.mp3",
				"d:/music/ngaytan.mp5", };
		System.out.println(String.join("-",getMp3Songs(music)));
	}

	private static String[] getMp3Songs(String[] musics) {
		String[] result = new String[musics.length];
		int a=0;
		for (String music : musics) {
			if (music.endsWith(".mp3")) {
				int firt = music.lastIndexOf("/");
				int last = music.lastIndexOf(".");
				result[a]= music.substring(firt+1, last);
				a++;
			}
		}

		return Arrays.copyOfRange(result, 0, a);
	}
}
