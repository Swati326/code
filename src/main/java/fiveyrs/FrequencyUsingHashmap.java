package fiveyrs;

import java.util.EnumMap;
import java.util.HashMap;

public class FrequencyUsingHashmap {

    public static void main(String[] args) {


        int[] a = {1, 2, 4, 3, 5, 2};

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int n: a) {
            if (hashMap.containsKey(n)) {
                hashMap.put(n, hashMap.get(n) + 1);
            } else {
                hashMap.put(n, 1);
            }
        }
        System.out.println(hashMap);

    }
}
