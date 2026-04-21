public class StringToInteger {
    public int myAtoi(String s) {
        long sign=1;
        long kq=0;
        final int max1=Integer.MAX_VALUE;
        final int min1=Integer.MIN_VALUE;

        int i=0,n=s.length();

        while (i<n && s.charAt(i)==' ') i++;
        if (i==n) return 0;

        if (s.charAt(i)=='+'){
            i++;
        } else if (s.charAt(i)=='-'){
            i++;
            sign=-1;
        }

        while(i<n && Character.isDigit(s.charAt(i))){
            kq=(s.charAt(i)-'0')+kq*10;i++;
            if (sign*kq<=min1) return min1;
            if (sign*kq>=max1) return max1;
        }
        return (int)(kq*sign);
    }
}
