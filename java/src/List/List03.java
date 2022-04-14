package List;

import java.util.LinkedList;
import java.util.List;

public class List03 {



	    public static void main(String[] args) {
	        List<String>list=new LinkedList<>();
	        String[] a={"a","b","a","l","b","l","k","k","k"};

	        for (int i=0;i<a.length;i++){
	            int count=0;
	            for (int j=i;j<a.length;j++){
	                if (a[i].equals(a[j])){
	                     count++;
	                }
	            }
	            if (count>=2){
	                continue;
	            }else {list.add(a[i]);}
	        }
	        System.out.println(list);
	    }
	}


