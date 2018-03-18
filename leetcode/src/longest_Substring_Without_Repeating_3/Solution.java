package longest_Substring_Without_Repeating_3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    char[] sc = s.toCharArray();
    int max = 0;
    for(int i = 0;i<sc.length;i++){
        int num =i;
        int size = 1;
        Set<Character> books = new HashSet<Character>();
        books.add(sc[num]);
        if(num<sc.length-1){
        while(!books.contains(sc[num+1])){
            size++;
            books.add(sc[num+1]);
            num++;
            if(num==sc.length-1)
                break;
        }
        }
        if(max<=size)
            max=size;
    }
    return max;
}
  
  
}
