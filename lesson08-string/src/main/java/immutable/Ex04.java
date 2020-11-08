package immutable;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		String[] musics= {
				"d:/music/foreverandone.mp4",
				"d:/music/somethingyoulike.mp3",
				"d:/music/stronger.mov",
				"d:/music/weakness.mp3",
		};
		String[] result=getMp3Songs(musics);
		System.out.println(String.join(",", result));
	}
	private static String[] getMp3Songs(String[] musics) {
		String[] result=new String[musics.length];
		int index=0;
		for(String music:musics) {
			if(music.endsWith("mp3")){
			int lastSlashIndex=music.lastIndexOf("/");
			int lastDotIndex=music.lastIndexOf(".");
			String name=music.substring(lastSlashIndex+1, lastDotIndex);
			result[index++]=name;
		}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
}
