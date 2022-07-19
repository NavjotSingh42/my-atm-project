package s1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class UserBill {
	
	private String name;
	private String ph_no;
	
	public UserBill(String name, String ph_no) {
		this.name = name;
		this.ph_no = ph_no;
	}
	
	private static String getDateTime() {
		
		LocalDateTime objDT = LocalDateTime.now();
	    DateTimeFormatter objFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String datetime = objDT.format(objFormat);
	    return(datetime);
	    
	}

	public void genBill() {
		System.out.println(this.name+"  "+this.ph_no);
		System.out.println(getDateTime());
	}

}