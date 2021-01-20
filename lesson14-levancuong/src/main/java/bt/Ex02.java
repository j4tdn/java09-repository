package bt;

public class Ex02 {
	public static void main(String[] args) {
		int hours = 1;
		int minutes = 15;
		int timeSleep = hours * 60 + minutes;

		int timeBeginSleep = 23 * 60;

		int age = 22;

		int timeGetup = timeGetup(age, timeSleep, timeBeginSleep);
		System.out.println("result:" + timeGetup / 60 + ":" + timeGetup % 60);

	}

	private static int timeGetup(int age, int timeSleep, int timeBeginSleep) {
		int timeSleepMin = timeSleepMin(age);
		int timeRemain = timeSleepMin - timeSleep;
		int result = 0;
		result = timeRemain + timeBeginSleep;
		if (result >= 24 * 60) {
			result -= 24 * 60;
		}
		return result;
	}

	private static int timeSleepMin(int age) {
		int result = 0;
		if (age >= 1 && age <= 3) {
			result = 20 * 60;
		}
		if (age >= 4 && age <= 13) {
			result = 11 * 60;
		}
		if (age >= 14 && age <= 17) {
			result = 9 * 60;
		}
		if (age >= 18 && age <= 64) {
			result = 8 * 60;
		}
		if (age > 65) {
			result = (int) 7.5 * 60;
		}

		return result;

	}
}
