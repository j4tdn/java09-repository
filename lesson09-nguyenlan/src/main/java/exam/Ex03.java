package exam;

public class Ex03 {
	public static void main(String[] args) {
		String s = "xyzt";
		permutation(s);
	}
	private static void permutation(String s) {
		char[] arr = new char[s.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(i);
		}
		permute(arr);
	}
	private static void permute(char[] arr){
	    permuteHelper(arr, 0);
	}
	
	
	private static void permuteHelper(char[] arr, int index){
	    if(index >= arr.length - 1){
	        for(int i = 0; i < arr.length - 1; i++){
	            System.out.print(arr[i]);
	        }
	        if(arr.length > 0) 
	            System.out.println(arr[arr.length - 1]);
	        return;
	    }

	    for(int i = index; i < arr.length; i++){
	        char t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	        
	        permuteHelper(arr, index+1);

	        t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	    }
	}
}
