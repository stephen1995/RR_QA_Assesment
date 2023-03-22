import java.util.ArrayList;
import java.util.HashMap;

public class Question4 {

    public static void main(String args[]){

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Thanks");
        strings.add("For");
        strings.add("Attempting");
        strings.add("A");
        strings.add("Randall");
        strings.add("Reilly");
        strings.add("Coding");
        strings.add("Exercise");

        System.out.println(longestString(strings));


    }
    public static String longestString(ArrayList<String> input){
        HashMap<String, Integer> hashy = new HashMap<>();

        int max = Integer.MIN_VALUE;
        for(String x : input){
            if(!hashy.containsKey(x)){
                hashy.put(x,x.length());
            }
            if(x.length()>max){
                max = x.length();
            }
        }

        for(String x : hashy.keySet()){
            if(hashy.get(x)==max)
                return x;
        }
        return "";
    }
}
