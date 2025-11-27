public class DSA_123 {
    
    public static int myAtoi(String s) {
        int sign = 1;
        long result = 0;
        int i = 0;
        int n = s.length();
        while(i < n && s.charAt(i) == ' '){
            i++;
        }
        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            sign = (s.charAt(i) == '-')? -1:1;
            i++;
        }
        while(i < n && Character.isDigit(s.charAt(i))){
            result = result * 10 + (s.charAt(i) - '0');
            if(sign * result >= Integer.MAX_VALUE)return Integer.MAX_VALUE;
            if(sign * result <= Integer.MIN_VALUE)return Integer.MIN_VALUE;

            i++;
        }
        return (int)(sign * result);

    }

    public static void main(String[] args){
        String s = "1337c0d3";
        System.out.println(myAtoi(s));
    }
}

