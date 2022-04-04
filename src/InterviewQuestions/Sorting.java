package InterviewQuestions;

import java.util.*;

//With an array of mixed elements input [[3], 4, [2], [5], 1, 6]  ,
// //produce the output as [1, [2],  [3], 4, [5], 6] with Java Programming
public class Sorting {

    public static void main(String[] args) {
        Object[] obj = new Object[]{"3", 4, "2", "5", 1, 6};
        List <Integer> list = new ArrayList<Integer>();
        for (Object o : obj) {
            if(o instanceof String){
                list.add(Integer.parseInt((String) o));
            }else if(o instanceof Integer)
                list.add((Integer)o);
        }
        Object[] objects = list.toArray();
        Arrays.sort(objects);
        for (Object object : objects) {
            System.out.print(object+" ");
        }


    }
}