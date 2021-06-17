import java.util.*;
import java.text.*;

public class Test_1 {
  public static void main(String[] args)
   {
   //Unix seconds
   var unix_seconds = 1538737955;
   //convert seconds to milliseconds
   Date date = new Date(unix_seconds*1000L); 
   // format of the date
   SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
   jdf.setTimeZone(TimeZone.getTimeZone("GMT-5"));
   String java_date = jdf.format(date);
   System.out.println("\n"+java_date+"\n");
   }
}
