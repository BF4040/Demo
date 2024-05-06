package demo;

public class Clock {
	public static void main(String[] args) {
		String s = "12:00:00am";
		boolean in=true;
		String[] time = s.split(":");
		if (Integer.parseInt(time[0]) > 9) {
			String ampm = s.substring(8);

			if (ampm.equalsIgnoreCase("AM") && Integer.parseInt(s.substring(0, 2)) >= 12) {
				in=false;
				int hh = Integer.parseInt(s.substring(0, 2)) - 12;
				String mm = s.substring(3, 5);
				String ss = s.substring(6, 8);
				if (hh==0) {
					s = "00" + ":" + mm + ":" + ss;
				} else {
					s = hh + ":" + mm + ":" + ss;
				}
				
			} else if (ampm.equalsIgnoreCase("PM") && Integer.parseInt(s.substring(0, 2)) < 12) {
				in=false;
				int hh = Integer.parseInt(s.substring(0, 2)) + 12;
				String mm = s.substring(3, 5);
				String ss = s.substring(6, 8);
				s = hh + ":" + mm + ":" + ss;
			}
		} else {
			if (Integer.parseInt(time[0]) > 10) {
				String ampm = s.substring(7);
				if (ampm.equalsIgnoreCase("PM") && Integer.parseInt(s.substring(0, 1)) < 12) {
					in=false;
					int hh = Integer.parseInt(s.substring(0, 1)) + 12;
					String mm = s.substring(2, 4);
					String ss = s.substring(5, 7);
					s = hh + ":" + mm + ":" + ss;
				}
			}else {
				String ampm = s.substring(8);
				if (ampm.equalsIgnoreCase("PM") && Integer.parseInt(s.substring(0, 1)) < 12) {
					in=false;
					int hh = Integer.parseInt(s.substring(0, 2)) + 12;
					String mm = s.substring(3, 5);
					String ss = s.substring(6, 8);
					s = hh + ":" + mm + ":" + ss;
				}
			}
		}
		if (in) {
			System.out.println(s.substring(0,8));
		}else {
			System.out.println(s);
		}
		

	}
}
