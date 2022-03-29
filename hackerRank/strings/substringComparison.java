package hackerRank.strings;

public class substringComparison {



    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
//         String smallest = s.substring(0,k);
// String largest  = "";
// for(int i=0;i<s.length()-k+1;i++){
// if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
// if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k);
        for(int i=0;i<s.length()-k+1;i++){
            String temp = s.substring(i,i+k);
            if(smallest==""||temp.compareTo(smallest)<0){
                smallest = temp;
            }
            if(largest==""||temp.compareTo(largest)>0){
                largest = temp;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


}
