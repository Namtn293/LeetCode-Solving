import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstring {
    static int lengthOfLongestSubstring(String s) {
        List<Character> list=new ArrayList<>();
        int start=0,size=0;
        for (int i=0;i<s.length();i++){
            if (list.contains(s.charAt(i))){
                int j=i-1;
                while(s.charAt(j)!=s.charAt(i)) j--;
                start=j+1;
            } else list.add(s.charAt(i));
            size=Math.max(size,i-start+1);
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }
}
