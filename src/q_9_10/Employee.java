package q_9_10;
// Fig. 8.12: Employee.java
// Static variable used to maintain a count of the number of 
// Employee objects in memory.

public class Employee 
{
   private static int count = 0; // number of Employees created
   private String firstName;
   private String lastName;
   private int numero;

   // initialize Employee, add 1 to static count and 
   // output String indicating that constructor was called
   public Employee(String firstName, String lastName, int nSeguroSocial)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.numero = nSeguroSocial;

      ++count;  // increment static count of employees
   } 

   // get first name
   public String getFirstName() 
   { 
      return firstName; 
   } 

   // get last name
   public String getLastName() 
   { 
      return lastName; 
   } 

   // static method to get static count value
   public static int getCount() 
   { 
      return count; 
   } 
   
   public String toString() {
	   return String.format("Employee constructor: %s %s; count = %d%n; número de seguro social; %i",
		         firstName, lastName, count,this.numero);
   }
   
} // end class Employee



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
