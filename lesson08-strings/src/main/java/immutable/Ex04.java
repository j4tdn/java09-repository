package immutable;

import java.util.Arrays;

public class Ex04 {
	// tìm danh sách bài hát có đuôi mp3
	public static void main(String[] args) {
		String[] music = {
				"d:/music/foreoverandone.mp4",
				"d:/music/somthingulike.mp3",
				"d:/music/stronger.mov",
				"d:/music/weakness.mp4",
		
		};
	//	String[] result = getMp3Songs(musics);
		//System.out.println(String.join(" - ", result));
		// output : somethingulike , weakness
	}
	private static String[] getMp3Songs(String[] musics) {
		String[] result = new String[musics.length];
		int index = 0;
		
		for (String music: musics) {
			if(music.endsWith(".mp3")) {
				int lastSlashIndex = music.lastIndexOf("/");
				int lastDotIndex = music.lastIndexOf(".");
				result[index++]  = music.substring(lastSlashIndex + 1);
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
}
