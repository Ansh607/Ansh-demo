package Hashmaps;

import java.util.HashSet;

public class AddSameNameInSet {



        public static void main (String[]args){
            HashSet<String> set = new HashSet<>();
            AddSameNameInSet obj = new AddSameNameInSet();
            String[] words = {"cd", "ac", "dc", "ca", "dc", "tu"};
            int result = obj.maximumNumberOfStringPairs(words);
            System.out.println("Maximum Number of String Pairs: " + result);
//        set.add("Raghav");
//        set.add("Raghav");
//        set.add("Raghav");
//        set.add("Raghav");
//        set.add("Raghav");
//        set.add("Himanshu");
//        set.add("Gagan");
//        set.add("Harish");
//        System.out.println(set+" "+set.size());
//        set.remove("Raghav");
//        System.out.println(set+" "+set.size());


        }

        public int maximumNumberOfStringPairs (String[]words){
            HashSet<String> set = new HashSet<>();
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                String rev = reverse(words[i]);
                if (set.contains(rev)) {
                    count++;
                    set.remove(rev);
                } else set.add(words[i]);
            }
            return count;
        }

            public String reverse (String s){
                StringBuilder sb = new StringBuilder(s);
                sb.reverse();
                return sb.toString();
            }
        }AddSameNameInSet









