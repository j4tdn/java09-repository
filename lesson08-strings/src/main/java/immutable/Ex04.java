package immutable;

import java.util.Arrays;

public class Ex04 {
	// tìm danh sách bài hát có đuôi mp3
	public static void main(String[] args) {
		String [] musics = {
				"d:/music/foreoverandone.mp4",
				"d:/music/somethingulike.mp3",
				"d:/music/stronger.mov",
				"d:/music/weakness.mp3",
		};
		
		System.out.println(String.join(" - ", getMp3Musics(musics)));
		
		
	}
	
	private static String[] getMp3Musics(String[] musics) {
		String[] result = new String[musics.length];
//		int indexArr = 0;
//		int index = 0;
//		for (int i = 0; i < musics.length; i++) {
//			index = musics[i].lastIndexOf("/") + 1;
//			String sub = musics[i].substring(index);
//			int indexLast = musics[i].lastIndexOf(".");
//			String subLast = musics[i].substring(indexLast + 1);
//			if(subLast.equals("mp3")) {
//				System.out.println(subLast);
//				result = result + musics[i].substring(index, indexLast) + " ";
//			}
//		}
		
		int index = 0;
		for (String music : musics) {
			if(music.endsWith(".mp3")) {
				result[index++] = music.substring(music.lastIndexOf("/")+1, music.lastIndexOf("."));
			}
		}
		
		return Arrays.copyOfRange(result, 0, index);
	}
}
