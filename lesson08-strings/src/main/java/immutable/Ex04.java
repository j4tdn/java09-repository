package immutable;

import java.util.Arrays;

public class Ex04 {
	// Tìm danh sách bài hát có đuôi mp3
	public static void main(String[] args) {
		String[] musics = { "d:/music/foreoverandone.mp4", "d:/music/somethingulike.mp3", "d:/music/stronger.mov",
				"d:/music/weakness.mp3", };
		// output:somthingulike, weakness
		String[] result = getMp3Songs(musics);
		System.out.println(String.join("-",result));//trả về Chuỗi String cách nhau dấu "-"
	}

	private static String[] getMp3Songs(String[] musics) {
		String[] result = new String[musics.length];
		int index = 0;
		for (String music : musics) {
			if (music.endsWith(".mp3")) {
				int lastSlashindex = music.lastIndexOf("/");
				int lastDotIndex = music.lastIndexOf(".");
				result[index++] = music.substring(lastSlashindex + 1, lastDotIndex);

			}
		} // result={"x","y",null,null};
		return Arrays.copyOfRange(result, 0, index);// hàm trả về mảng 2 phần tử
	}
}
