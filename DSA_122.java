public class DSA_122 {
    public static String longestpallindrome(String str){
        String LPS = "";
        for(int i = 1; i < str.length(); i++){
            int low = i;
            int high = i;
            while(low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == str.length()){
                    break;
                }
            }
            String pallindrome1 = str.substring(low+1, high);
            if(pallindrome1.length() > LPS.length()){
                LPS = pallindrome1;
            }

            //even length
            low = i-1;
            high = i;
            while(low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == str.length()){
                    break;
                }
            }
            String pallindrome = str.substring(low+1, high);
            if(pallindrome.length() > LPS.length()){
                LPS = pallindrome;
            }
        }
        return LPS;
    }

    public static void main(String[] args){
        String s = "EBBABDF";
        System.out.println(longestpallindrome(s));
    }
}
