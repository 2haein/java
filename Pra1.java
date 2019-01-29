package test;

import java.util.*;

public class Pra1 {

	 public static void main(String[] args) {
		 
         HashMap map = new HashMap();



         map.put("key01", "value01");

         map.put("key02", "value02");

         map.put("key03", "value03");

         map.put("key04", "value04");

         map.put("key05", "value05");



        




Set key = map.keySet();



for (Iterator iterator = key.iterator(); iterator.hasNext();) {

              String keyName = (String) iterator.next();

              String valueName = (String) map.get(keyName);



              System.out.println(keyName +" = " +valueName);

}






}

}