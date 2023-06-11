import java.util.*;
class hashset
{
    public static void main(String args[])
    {
        HashSet<Integer>set  = new HashSet<>();
        
        // for adding
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(3);
        set.add(5);
        
        
        // Size of the set
        System.out.println("The size of the set is" +set.size());
        
        // Printing all elements of the set
        
        System.out.println(set);
        
        
        
        
        //for searching
        
        if(set.contains(5))
        {
            System.out.println(" 5 is present ");
        }
        if(!set.contains(7))
        {
            System.out.println(" 7 is not present");
        }
        
        //for deleting
        
        set.remove(1);
        if(!set.contains(1))
        {
            System.out.println(" 1 is not present");
        }
        
        
        /// creating Iterator and using it
        Iterator it = set.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}