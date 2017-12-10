package q_8_12;

public class DateAndTime {
		   private int hour; // 0 - 23
		   private int minute; // 0 - 59
		   private int second; // 0 - 59
		   private int month; // 1-12
		   private int day; // 1-31 based on month
		   private int year; // any year

		   private static final int[] daysPerMonth = 
		      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		   public DateAndTime(int month, int day, int year, int hour, int minute, int second) 
		   { 
		      if (hour < 0 || hour >= 24)
		         throw new IllegalArgumentException("hour must be 0-23");

		      if (minute < 0 || minute >= 60)
		         throw new IllegalArgumentException("minute must be 0-59");

		      if (second < 0 || second >= 60)
		         throw new IllegalArgumentException("second must be 0-59");
		      else {
		          this.second = second + minute*60 + hour*60*60;  
		      }
		      
		      if (month <= 0 || month > 12)
		          throw new IllegalArgumentException(
		             "month (" + month + ") must be 1-12");

		       // check if day in range for month
		       if (day <= 0 || 
		          (day > daysPerMonth[month] && !(month == 2 && day == 29)))
		          throw new IllegalArgumentException("day (" + day + 
		             ") out-of-range for the specified month and year");

		       // check for leap year if month is 2 and day is 29
		       if (month == 2 && day == 29 && !(year % 400 == 0 || 
		            (year % 4 == 0 && year % 100 != 0)))
		          throw new IllegalArgumentException("day (" + day +
		             ") out-of-range for the specified month and year");

		       this.month = month;
		       this.day = day;
		       this.year = year;

		       System.out.printf(
		          "Date object constructor for date %s%n", this);
		    } 
		      


		   public void setTime(int hour, int minute, int second)
		   {
		      if (hour < 0 || hour >= 24)
		         throw new IllegalArgumentException("hour must be 0-23");

		      if (minute < 0 || minute >= 60)
		         throw new IllegalArgumentException("minute must be 0-59");

		      if (second < 0 || second >= 60)
		         throw new IllegalArgumentException("second must be 0-59");

		      this.second = second + minute*60 + hour*60*60; 
		   } 

		// validate and set hour 
		   public void setHour(int hour) 
		   { 
		      if (hour < 0 || hour >= 24)
		         throw new IllegalArgumentException("hour must be 0-23");

		      this.second = second + minute*60 + hour*60*60; 
		   } 

		   // validate and set minute 
		   public void setMinute(int minute) 
		   { 
		      if (minute < 0 || minute >= 60)
		         throw new IllegalArgumentException("minute must be 0-59");

		      this.second = second + minute*60 + hour*60*60; 
		   } 

		   // validate and set second 
		   public void setSecond(int second) 
		   { 
		      if (second < 0 || second >= 60)
		         throw new IllegalArgumentException("second must be 0-59");

		      this.second = second + this.minute*60 + this.hour*60*60; 
		   } 

		   // Get Methods
		   // get hour value
		   public int getHour() 
		   { 
		      return second/60/60; 
		   } 

		   // get minute value
		   public int getMinute() 
		   { 
		      return (this.second - getHour()*60*60)/60; 
		   } 

		   // get second value
		   public int getSecond() 
		   { 
		      return (this.second-(getHour()*60*60)-(getMinute()*60)); 
		   } 
		   
		   public void incrementSecond() {
			   this.second++;
			   if (this.second >= 86400) {
				   this.second -=86400; 
				   this.addDay();
			   }
		   }
		   public void incrementMinute() {
			   
			   this.second +=60;
			   if (this.second >= 86400) {
				   this.second -=86400; 
				   this.addDay();
			   }
		   }
		   public void incrementHour() {
			   this.second+=60*60;
			   if (this.second >= 86400) {
				   this.second -=86400;
				   this.addDay();
				   
			   }
		   }

		   
		   public void addDay() {
			   this.day+=1;
			   if (this.day > daysPerMonth[this.month]) {
				   this.day = 1;
				   this.month++;
				   if (this.month>12) {
					   this.month=1;
					   this.year++;
				   }
			   }
		   }
		   
		   public void addMonth() {
			   this.month++;
			   if (this.month>12) {
				   this.month=1;
				   this.year++;
			   }
			   
		   }
		   
		   public void addYear() {
			   this.year++;
			   
		   }

		   // convert to String in universal-time format (HH:MM:SS)
		   public String toUniversalString()
		   {
		      return String.format(
		         "%02d:%02d:%02d" + "       " + "%d/%d/%d", getHour(), getMinute(), getSecond(), this.month, this.day, this.year);
		   } 

		   // convert to String in standard-time format (H:MM:SS AM or PM)
		   public String toString()
		   {
		      return String.format("%d:%02d:%02d %s"+ "       " + "%d/%d/%d", 
		         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
		         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"), this.month, this.day, this.year);
		   } 
} 


