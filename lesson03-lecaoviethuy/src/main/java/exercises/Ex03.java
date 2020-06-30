package exercises;

public class Ex03 {
	public static void main(String[] args) {
		int[][] numbers = {
				{47, 47, 36},
				{23, 43, 31},
				{46, 7, 29}
		};
		/*
		 * tìm phần từ nhỏ nhất trong hàng: minNumber
		 * so sánh xem thử phần tử đấy có là lớn nhất trong cột hay không
		 * nếu có thì return kết quả, không thì duyệt tiếp
		 */
		for(int i = 0; i < numbers.length; i++) {
			boolean isHorseSaddleElement = true;
			int minNumber = numbers[i][0];
			int minX = 0;
			for(int j = 1; j < numbers.length; j++) {
				if(numbers[i][j] < minNumber) {
					minNumber = numbers[i][j];
					minX = j;
				}
			}
			
			for(int z = 0; z < numbers.length; z++) {
				if(z == i) {
					continue;
				} else {
					if(numbers[z][minX] > minNumber) {
						isHorseSaddleElement = false;
						break;
					}
				}
			}
			
			if(isHorseSaddleElement) {
				System.out.printf("Có phần tử yên ngựa tại A[%d][%d] = %d\n", i, minX, minNumber);
				return;
			}
		}
		
		System.out.println("Không có phần tử yên ngựa!");
	}
}
