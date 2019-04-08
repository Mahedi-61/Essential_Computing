import java.util.HashMap;

public class HashMapExample{

    //main method
    public static void main(String args[]){
     HashMap hMap = new HashMap();

     hMap.put("name", "Prokash");
     hMap.put("age", 25);
     hMap.put("roll", 61);

     System.out.println(hMap.size());
     hMap.replace("age", 21);
     System.out.println(hMap.get("age"));

    }
} 