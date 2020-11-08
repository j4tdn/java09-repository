package immutable;

import java.util.Arrays;

public class TimTenBaiHat {
	public static void main(String[] args) {
		String[] music = {
				//in ten bai hat ket thuc bang mp3
				"d:/music/foreverAlone.mp4",
				"d:/music/SomewhereOnlyWeKnow.mp3",
				"d:/music/Stronger.mov",
				"d:/music/AmthamBenem.mp3",
		};
		String[] result = timTenBaiHat(music);
		System.out.println(String.join("-",result));

	}
	public static String[] timTenBaiHat(String[] music) {
		for (String s : music) {
			String[] words = s.split("/");
			String lastWords = words[words.length-1];
			if (lastWords.endsWith(".mp3")) {
				System.out.println(lastWords.substring(0,lastWords.length()-4));
			}

		}
		//C2:
		int index=0;
		String[] result = new String[10];
		for(String song : music) {
			if(song.endsWith(".mp3")) {
				int lastSlashIndex = song.lastIndexOf("/");
				int lastDotIndex = song.lastIndexOf(".");
				String name = song.substring(lastSlashIndex+1,lastDotIndex);
				result[index++] = name;
				
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
}
