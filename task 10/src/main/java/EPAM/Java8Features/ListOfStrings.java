package EPAM.Java8Features;
 
import java.util.*;
import java.util.stream.Collectors;

public class ListOfStrings {
		public static void main(String args[])
	    {
	        List<String> list = new ArrayList<>();
	        list.add("aarthi");
	        list.add("baab");
	        list.add("anu");
	        list.add("amma");
	        list.add("app");
	        list.add("aap");
	        list.add("yvs");
	        list.add("hello");
	        list.add("aus");
	        list.add("amm");

	        list = find(list);

	        for(String names : list)
	            System.out.println(names);
	    }

	    static List<String> find(List<String> list1)
	    {
	        return list1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
	    }
}
