//Sophia Fisher
//12 November 2019

import java.util.Scanner;
import java.util.TimeZone;
import java.util.Calendar;

public class TimeChanges
{
   private static String answer;
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Calendar myCalendar = Calendar.getInstance();
      String ending;
      TimeZone myTimeZone = TimeZone.getTimeZone("America/Denver");
      System.out.println("What place would you like to know the time of?");
      System.out.println("(Luxembourg, Japan, Sao Tome, Portugal, Dominica)");
      System.out.print("Country: ");
      answer = keyboard.nextLine();
      
      if(answer.equals("Luxembourg"))
      {
         myTimeZone = TimeZone.getTimeZone("Europe/Luxembourg");
      }
      
      else if(answer.equals("Japan"))
      {
         myTimeZone = TimeZone.getTimeZone("Japan");
      }
      
      else if(answer.equals("Sao Tome"))
      {
         myTimeZone = TimeZone.getTimeZone("Africa/Sao_Tome");
      }
      
      else if(answer.equals("Portugal"))
      {
         myTimeZone = TimeZone.getTimeZone("Portugal");
      }
      
      else if(answer.equals("Dominica"))
      {
         myTimeZone = TimeZone.getTimeZone("America/Dominica");
      }
      
      myCalendar.setTimeZone(myTimeZone);
      long minutes = (myCalendar.getTimeInMillis()/60000)%60;
      int hours = myCalendar.get(Calendar.HOUR_OF_DAY);
      int dayNum = myCalendar.get(Calendar.DAY_OF_WEEK);
      String day = "";
            
      if(hours>12)
      {
         hours -= 12;
         ending = " PM";
      }
      
      else
      {
         ending = " AM";
      }
      
      if(dayNum == 4)
      {
         day = "Wedneday ";
      }
      
      if(dayNum == 3)
      {
         day = "Tuesday ";
      }
      
       if(dayNum == 2)
      {
         day = "Monday ";
      }
      
      System.out.print("It is currently " + day + hours  + ":" + minutes + ending + " in " + answer);
      System.out.println("\n" + myCalendar.toString());

      //System.out.println(minutes);
   }
}