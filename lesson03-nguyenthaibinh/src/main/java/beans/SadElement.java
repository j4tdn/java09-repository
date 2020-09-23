package beans;

import java.util.Scanner;

public class SadElement {
	public static void main(String[] args) {
		int nRow, nCol;
		int[][] myNumbers = null;
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap so hang: ");
		nRow = ip.nextInt();
		System.out.println("Nhap so cot: ");
		nCol = ip.nextInt();
		myNumbers = new int[nRow][nCol];
		inputNumbers(myNumbers, nRow, nCol);
		printNumbers(myNumbers, nRow, nCol);
		if(checkSadElement(myNumbers, nRow, nCol)) {
			System.out.println("Co phan tu yen ngua");
		} else {
			System.out.println("Khong co phan tu yen ngua");
		}
	}
	public static void inputNumbers(int[][] myNumbers, int nRow, int nCol) {
		Scanner ip = new Scanner(System.in);
		int iRow, iCol;
		for(iRow = 0; iRow < nRow; iRow++) {
			for(iCol = 0; iCol < nCol; iCol++) {
				System.out.println("MyNumbers[" + iRow + "][" + iCol + "] = ");
				myNumbers[iRow][iCol] = ip.nextInt();
			}
		}
	}
	public static void printNumbers(int[][] myNumbers, int nRow, int nCol) {
		int iCol,iRow;
		for(iRow = 0; iRow < nRow; iRow++) {
			System.out.println("\n");
			for(iCol = 0; iCol < nCol; iCol++) {
				System.out.printf("%2s",myNumbers[iRow][iCol]);
			}
		}
	}
	public static boolean checkSadElement(int[][] myNumbers, int nRow, int nCol) {
		int iCol,iRow;
		int max,min;
		int tmp = 0;
		for(iRow = 0; iRow < nRow; iRow++) {
			 min = myNumbers[iRow][0];
			 for(iCol = 1; iCol < nCol; iCol++) {
				 if(min > myNumbers[iRow][iCol]) {
					 min = myNumbers[iRow][iCol];
					 tmp = iCol;
				 }
			 }
			 max = myNumbers[0][tmp];
			 for(int i = 1; i < nRow; i++) {
				 if(max < myNumbers[i][tmp]) {
					 max = myNumbers[i][tmp];
				 }
			 }
			 if(min == max) {
				 return true;
			 }
		}
		return false;
	}
	
}
