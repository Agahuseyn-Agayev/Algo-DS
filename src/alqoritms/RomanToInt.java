package alqoritms;

import java.util.Map;

public class RomanToInt {

    //process from last index of string
    public static int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        if (s == null || s.length() == 0) {
            return -1;
        }
        int prev = 0;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int value = map.get(ch);
            if (value < prev) {
                result -= value;
            } else {
                result += value;
            }
            prev = value;
        }
        return result;
    }

    //process from first index of string
    public static int romaToIntV2(String str){
        Map<Character,Integer> map= Map.of(
                'I',1,
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000
        );
        int index=0;
        int result=0;
        while (index<str.length()){
            int temp=map.get(str.charAt(index));
            if (index+1<str.length()&&temp<map.get(str.charAt(index+1))){
                result=result+map.get(str.charAt(index+1))-temp;
                index=index+1;
            }else {
                result=result+temp;
                index=index+1;
            }
        }
        return result;
    }
}
