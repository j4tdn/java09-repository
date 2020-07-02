package exercise03;

public class SaddleElement {
	public static void main(String[] args) {
		int[][] numbers = new int[][] { 
			{ 47, 47, 3 },
			{ 46, 7, 8 },
			{ 7, 7, 29 } };
		System.out.println(isHaveSaddleElement(numbers));
	}

	public static boolean isHaveSaddleElement(int[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			boolean result = true;
			int min = numbers[i][0];
			int minX = 0;
			for (int j = 0; j < numbers[0].length; j++) {
				if (numbers[i][j] < min) {
					min = numbers[i][j];
					minX = j;
				}
			}

			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j][minX] > min) {
					result = false;

				} else if (numbers[j][minX] == min && j != i) {
					result = false;
				}
				
			}


			if(result) {
				System.out.println("có phần tử yên ngựa tại :" + " hàng " + (i +1)+ ", cột " + (minX+1));
				return true;
			}
		}
		System.out.println("Không có phần tử yên ngựa");
		return false;
	}

}
