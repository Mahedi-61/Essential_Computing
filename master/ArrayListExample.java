import java.util.ArrayList;
import java.util.Iterator;

//Sample Java Program for ArrayList

public class ArrayListExample{

    //main method
    public static void main(String args[]){
       ArrayList aList = new ArrayList();
       
       //adding values
       aList.add(1);
       aList.add(2);
       aList.add("Manarat");
       aList.add(3.53);

       //System.out.println(aList.get(3));
       Iterator it = aList.iterator();

       while(it.hasNext())
            System.out.println(it.next());
    }
} 