import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class DateExample{

    //main method
    public static void main(String args[]){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yy : hh:mm:ss");
        
        String str_date = df.format(date);
        System.out.println(str_date);
    }
} 