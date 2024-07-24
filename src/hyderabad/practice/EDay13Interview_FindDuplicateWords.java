package hyderabad.practice;

import java.util.HashSet;

public class EDay13Interview_FindDuplicateWords {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String str = "java,selenium,python,java,python";
        String[] s = str.split(",");
        HashSet<String> hs = new HashSet<String>();
        for(int i=0;i<s.length;i++){
            boolean j = hs.add(s[i]);
            if(!j){
                System.out.println("dupliacte "+ s[i]);
            }
           }
        }
    
	}


