package homework_03;

public class Ex03 {
	public static void main(String[] args) {
		int[][] numbers = { { 47, 47, 36 }, { 23, 43, 31 }, { 46, 7, 29 } };

		int c=0;
		int temt=0;
		for (int i = 0; i < numbers.length; i++) {
			int min = numbers[i][0];
			for (int j=1; j < numbers.length;j++) {
				if (numbers[i][j] < min) {
					min = numbers[i][j];
					 temt=j;
				}
			}
				for (int z=0 ; z<numbers.length;z++) {
					if(numbers[z][temt] > min) {
						c=0;
						break;
					} else {
						c=1;
					}
				}
		
				
				if(c==1) {
					System.out.println("có phan tu yen ngua "+"hang "+i+","+"cot "+temt+","+min);
					return;
				} else {
					System.out.println("khong có ptu yen ngua");
				}
			
		}
	}
}