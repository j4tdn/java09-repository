package immutable;

public class Ex06 {
	public static void main(String[] args) {
		String students = " LeNa, LeTeo, HoangNa, VanTeo, LeTa";
		System.out.println(String.join(" - ", result));
	}
	private static String[] getStudents(String students, String prefix);{
		String[] studentArray = students.split(" , ");
		String[] result = new String[studenArray.length()];
		int index = 0;
		for(String student: studentArray) {
			if(student.startsWith(prefix)) {
				result[index++]= student;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
		
	}
}
