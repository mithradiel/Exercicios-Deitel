package q_8_14;
// Fig. 8.7: Date.java 
// Date class declaration.

public class Date 
{
   private int month; // 1-12
   private String monthS;
   private int day; // 1-31 based on month
   private int year; // any year

   private static final int[] daysPerMonth = 
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   private static final String[] months = {
		   "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho","Agosto",
		   "Setembro", "Outubro","Novembro", "Dezembro"
   };
   
   // constructor: confirm proper value for month and day given the year
   public Date(int month, int day, int year)
   {
      // check if month in range
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
      this.monthS = months[month-1];
      this.day = day;
      this.year = year;

      System.out.printf(
         "Date object constructor for date %s%n", this);
   } 
   
   public Date(String month, int day, int year) {
	   
	   for (int i = 0; i < months.length; i++) {
		   if (months[i].equals(month)) {
			   
			   this.month = i+1;
			   this.monthS = month;
		   }
		   else if (i == 12) {
			   throw new IllegalArgumentException("Mês (" + month + ") inexistente.");
		   }
	   }
	   this.day = day;
	   this.year = year;
	   if (day <= 0 || 
		         (day > daysPerMonth[this.month] && !(this.month == 2 && day == 29)))
		         throw new IllegalArgumentException("day (" + day + 
		            ") out-of-range for the specified month and year");

		      // check for leap year if month is 2 and day is 29
		      if (this.month == 2 && day == 29 && !(year % 400 == 0 || 
		           (year % 4 == 0 && year % 100 != 0)))
		         throw new IllegalArgumentException("day (" + day +
		            ") out-of-range for the specified month and year");
		 
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
   public int getDayOfYear() {
	   int days = 0;
	   for (int i = this.month -1; i > 0; i--) {
		   days+= daysPerMonth[i];
	   }
	   days+= this.day;
	   return days;
   }
   
   // return a String of the form month/day/year
   public String toString()
   { 
      return String.format("%d/%d/%d", this.month, this.day, this.year) + System.lineSeparator()
    		  + String.valueOf(this.day) + " de " + this.monthS + " de " + String.valueOf(this.year)
    		  + System.lineSeparator() 
    		  + String.valueOf(getDayOfYear()) + "º dia de " + String.valueOf(this.year);
    		   
   } 
} // end class Date


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
