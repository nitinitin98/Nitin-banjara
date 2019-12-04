package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
	 public static List<Integer> gradingStudents(List<Integer> grades) {

//		Integer[] a = grades.toArray(new Integer[grades.size()]);
//		for(int i=0;i< a.length;i++) {
//			if(a[i]>=40 ) {
//				 Integer n= (5-a[i]%10);
//				 a[i]= n>3?n+a[i]:a[i];
//				 
//				 
//			 }
//			System.out.println(a[i]);
//		}
//		return Arrays.asList(a);
		 
		 for(int i=0;i< grades.size();i++) {
			 if(grades.get(i)>=40 && grades.get(i)%5!=0) {
				 Integer n= (5-grades.get(i)%5);
				 
				 Integer b= n<=3?n+grades.get(i):grades.get(i);
				 
				grades.set(i, b);
			 }
		 }  
//		 
//		 
//		 // Write your code here
		 return grades;
		    }
	 public static void main(String[] args) {
		 List<Integer> b = new ArrayList<Integer>();
		 b.add(20);
		 b.add(73);
		gradingStudents(b);
	}
	 
}

