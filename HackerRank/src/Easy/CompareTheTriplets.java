package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> x = Arrays.asList(0,1,2,3,4,5,6,2,1,3,4);
        List<Integer> y = Arrays.asList(1,3,4);
        x.removeAll(y);
        System.out.println(x.toString());
        
//        for (int i =0 ;i<a.size();i++){
//            if(a.get(i)>b.get(i))
//            	{
//            	x.set(0, x.get(0)+1);
//            	
//            	}
//            else if(a.get(i)<b.get(i)) {
//            	x.set(1, x.get(1)+1);
//            }
//            	}
    return x;    
	}
        public static void main(String[] args) {
        	
		}
}
