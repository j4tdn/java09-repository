package immutable;

import java.util.Arrays;

public class Ex04 {
	//tìm danh sách bài hát có đuôi .mp3
	public static void main(String[] args) {
		String[] musics = {
				"d:/music/foreverandonde.mp4",
				"d:/music/somethinglikeyou.mp3",
				"d:/music/stronger.mov",
				"d:/music/weakness.mp3",
		};
		String[] result = getMp3Songs(musics);
		System.out.println(String.join(" - ", result));
		//output: somethinglikeyou, weakness
		//System.out.println(getMp3Songs(musics));
	}
	
	private static String[] getMp3Songs(String[] musics) {
		String[] result = new String[musics.length];
		int index = 0;
		for(String music:musics) {
			if (music.endsWith(".mp3")) {
				int beginIndex = music.lastIndexOf("/");
				int endIndex = music.lastIndexOf(".");
				result[index++] = music.substring(beginIndex + 1, endIndex);
			}
		}
		
		return Arrays.copyOfRange(result, 0, index);
	}
}
