package longest_Palindromic_Substring_5;

public class Solution {


    public String longestPalindrome(String s) {
        
        
      String output="";
      String temp="";
      
        if(reverse(s).equals(s))
          return s;
        
        for(int i = 0;i<s.length();i++) {
          int down=i;
          int up=i;
          while(down>=0 && up<s.length()) {
            if(s.charAt(down)==s.charAt(up)) {
              if(down == up) temp+=s.charAt(up);
              else {
                temp=""+s.charAt(down)+temp+s.charAt(up);
              }
            }
            else break;
            down--;
            up++;
          }
          
          if(temp.length()>output.length()) {
            output=temp;
          }
          temp="";
          
        }
        
        
  
        
        for(int i = 0;i<s.length();i++) {
          int down=i;
          int up=i+1;
          while(down>=0 && up<s.length()) {
            if(s.charAt(down)==s.charAt(up)) {
                temp=""+s.charAt(down)+temp+s.charAt(up);
            }
            else break;
            down--;
            up++;
          }
          
          if(temp.length()>output.length()) {
            output=temp;
          }
          temp="";
          
        }
        
    return output;
    }
    
    
    public String reverse(String s) {
      String sr = "";
      for(int i = s.length()-1;i>=0;i--){
          sr+=s.charAt(i);
      }
      return sr;
    }
    
  
    
}


