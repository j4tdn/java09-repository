package demo;

public class Ex01 {
	public static void main(String[] args) {
		String[] strs = new String[] {"(1 1)","(1 3)","(3 1)","(3 3)"};
	}
	
	public static String ArrayChallenge(String[] strArr) {
		final int n = strArr.length;
		int[][] grid = new int[4][2];
		for (int i = 0; i < n; i++) {
			final String str = strArr[i];
			grid[i][0] = Integer.parseInt(str.charAt(1) + "");
			grid[i][1] = Integer.parseInt(str.charAt(3) + "");
		}
		
		int numberX = grid[0][0];
		int numberY = grid[0][1];
		int height = 0;
		int width = 0;
		
		for (int i = 1; i < n; i++) {
			if (grid[i][0] == numberX) {
				height = Math.abs(grid[i][1] - numberY);
				break;
			}
		}
		
		for (int i = 1; i < n; i++) {
			if (grid[i][1] == numberY) {
				width = Math.abs(grid[i][0] - numberX);
				break;
			}
		}
		
	    return (height * width) + "";
	}
}
