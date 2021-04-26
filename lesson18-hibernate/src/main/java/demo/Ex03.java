package demo;

public class Ex03 {
	static int n;
	static int[] inputs;
	static int[] combinations;
	static int max = 0;
	static int k;

	public static void main(String[] args) {
		inputs = new int[] {5,7,16,1,2};
		ArrayChallenge(inputs);
	}

	private static boolean getCombination(int i) {
		for (int j = (combinations[i - 1] + 1); j < (n - k + i); j++) {
			combinations[i] = j;
			if (i == k) {
				if (sumAll() == max) {
					return true;
				}
			} else {
				if (getCombination(i + 1) == true) {
					return true;
				};
			}
		}
		
		return false;
	}

	public static boolean ArrayChallenge(int[] inputs) {
		n = inputs.length;
		combinations = new int[n];
		
		max = inputs[0];
		int maxIndex = 0;
		
		for (int i = 1; i < n; i++) {
			if (max < inputs[i]) {
				max = inputs[i];
				maxIndex = i;
			}
		}
		
		int tmp = inputs[n - 1];
		inputs[n - 1] = max;
		inputs[maxIndex] = tmp;

		
		for (int i = 1; i < n; i++) {
			k = i;
			if(getCombination(1) == true) {
				System.out.println("true");
				return true;
			}
		}
		System.out.println("false");
		return false;
	}

	private static int sumAll() {
		int sum = 0;
		for (int i = 1; i <= k; i++) {
			sum += inputs[combinations[i] - 1];
		}
		return sum;
	}
	
	/*
	 * static int n;
	  static int[] inputs;
	  static int[] combinations;
	  static int max = 0;
	  static int k;
	
	  public static boolean ArrayChallenge(int[] arr) {
	    inputs = arr;
	    n = arr.length;
	    combinations = new int[n];
	    max = inputs[0];
	    int maxIndex = 0;
	
	    for (int i = 1; i < n; i++){
	      if (max < inputs[i]){
	        max = inputs[i];
	        maxIndex = i;
	      }
	    }
	
	    int tmp = inputs[n - 1];
	    inputs[n - 1] = max;
	    inputs[maxIndex] = tmp;
	
	    for (int i = 1; i < n; i++){
	      k = i;
	      if (getCombinations(1) == true){
	        return true;
	      }
	    }
	
	    return false;
	  }
	
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(ArrayChallenge(s.nextLine())); 
	  }
	
	  public static boolean getCombinations(int i){
	    for (int j = (combinations[i - 1] + 1); j < (n - k + i); j++){
	      combinations[i] = j;
	      if (i == k){
	        if (sumAll() == max){
	          return true;
	        }
	      } else {
	        if (getCombinations(i + 1) == true){
	          return true;
	        }
	      }
	    }
	
	    return false;
	  }
	
	  public static int sumAll(){
	    int sum = 0;
	    for (int i = 1; i <= k; i++){
	      sum += inputs[combinations[i] - 1];
	    }
	    return sum;
	  }
	 */
}
