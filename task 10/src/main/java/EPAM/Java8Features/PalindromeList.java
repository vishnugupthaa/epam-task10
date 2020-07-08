package EPAM.Java8Features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeList {
public static void main(String args[]) {
	List<String> list=new ArrayList<>();
	list.add("amma");
	list.add("vaishu");
	list.add("123321");
	list.add("java");
	list.add("madam");
	list.add("lambda");
	list.add("sir");
	list.add("sus");
	list.add("0.1.0");
	list.add("/>/<+</>/");
	
	list=palindrome(list);
	System.out.println("The palindromes in the string list are: ");
	
	for(String Palindromes:list)
		System.out.println(Palindromes);
}

    static List<String> palindrome(List<String> list)
    {
        List<String> l=new ArrayList<>();
        for(String Palindrome : list)
        {String i = Palindrome.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,i.length()/2).noneMatch(j -> i.charAt(j)!= i.charAt(i.length()-j-1)))
                l.add(Palindrome);}
        return l;
    }
}
	
