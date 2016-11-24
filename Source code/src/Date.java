/**
 * A class representing a date
 * @author Elis and Lilian
 * @version 1.0, 26/05/2015
 */
public class Date 
{
   private int day;
   private int month;
   private int year;

/**
 * Three-argument constructor. Illegal dates are converted to legal
* dates; a negative year is set to its positive counterpart, a
* month less than 1 is set to 1 and more than 12 is set to 12. A
* day less than 1 is set to 1 and a day more than the last day of
* the specified month is set to this last day
 * @param day
 * @param month
 * @param year
 */
   public Date(int day, int month, int year)
   {
      set(day, month, year);
   }
   
/**
 * Checking is the year is a leap year 
 * @return type boolean: true or false
 */
   public boolean isLeapYear()
   {
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
         return true;
      else
         return false;
   }

   /**
    * Getter for numbers of days in month
    * @return the numbers of days in a specific month
    */
   public int numberOfDaysInMonth()
   {
      int numDays;
      switch (month)
      {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
            numDays = 31;
            break;
         case 4:
         case 6:
         case 9:
         case 11:
            numDays = 30;
            break;
         case 2:
            if (isLeapYear())
               numDays = 29;
            else
               numDays = 28;
            break;
         default:
            return numDays = -1;
      }
      return numDays;
   }

   /**
    * Setter for day, month and year
    * @param day
    * @param month
    * @param year
    */
   public void set(int day, int month, int year)
   {
      if (year < 0)
      {
         year = -year;
      }
      this.year = year;

      if (month < 1)
      {
         month = 1;
      }
      if (month > 12)
      {
         month = 12;
      }
      this.month = month;

      if (day < 1)
      {
         day = 1;
      }
      if (day > numberOfDaysInMonth())
      {
         day = numberOfDaysInMonth();
      }
      this.day = day;
   }

   public int getDay()
   {
      return day;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }

/**
 * Copy a date
 * @return a copy of a date
 */
   public Date copy()
   {
      return new Date(day, month, year);
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Date))
         return false;

      Date other = (Date) obj;

      return day == other.day && month == other.month && year == other.year;
   }

   public String toString()
   {
      String s = "";
      if (day < 10)
      {
         s += "0";
      }
      s += day + "/";
      if (month < 10)
      {
         s += "0";
      }
      s += month + "/" + year;

      return s;
   }
}

