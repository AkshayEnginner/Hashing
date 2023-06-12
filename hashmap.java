import java.util.*;
class hashmap
{
    public static void main(String args[])
    {
        HashMap <String,Integer> Map = new HashMap<>();
        
        // Insetrion
        
        Map.put("Akshay",26);
        Map.put("Ram",28);
        Map.put("krisna",35);
        Map.put("sonu",37);
        
        // printing
        System.out.println(Map);
        
        //searching
        if(Map.containsKey("Akshay"))
        {
            System.out.println("KEY is present");
        }
        else
        {
            System.out.println("KEY not present");
        }
        
        
        // getting value of particular key
        System.out.println(Map.get("Ram"));
        
        //Iteration
        for(Map.Entry<String, Integer> e : Map.entrySet())
        {
            System.out.println(e.getKey());
             System.out.println(e.getValue());
        }
        
    }
}