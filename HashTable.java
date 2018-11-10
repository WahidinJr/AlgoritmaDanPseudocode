import java.util.Hashtable;
import java.util.Enumeration;

public class HashTable {
 
 public static void main(String[] args) {
 
   Enumeration names;
   String key;
 
   // Creating a Hashtable
   Hashtable<String, String> hashtable = 
              new Hashtable<String, String>();
 
   // Adding Key and Value pairs to Hashtable
   hashtable.put("Key1","WAHIDIN");
   hashtable.put("Key2","ABDILLAH");
   hashtable.put("Key3","WAHYU");
   hashtable.put("Key4","ISRA");
   hashtable.put("Key5","JUNIOR");
 
   names = hashtable.keys();
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " +
      hashtable.get(key));
   }
 }
}
