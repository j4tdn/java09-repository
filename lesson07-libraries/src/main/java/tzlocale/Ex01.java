package tzlocale;
import java.util.Calendar;
import java.util.Locale;

public class Ex01 {
	//locale : language country
		//used : => Calendar#getDayOfWeek();
		
		public static Locale VIETNAM = new Locale("vi", "VN");
		public static void main(String[] args) {
			System.out.println(Locale.getDefault());
			System.out.println("fdow" + Calendar.getInstance(VIETNAM).getFirstDayOfWeek());
		}
}
