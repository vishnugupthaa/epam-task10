package EPAM.Java8Features;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average {
	    public static void main(String args[])
	    {
	        IntStream stm = IntStream.of(0,5,10,15,20,25,30,35,40,45,50);
	        OptionalDouble obj = stm.average();
	        if(obj.isPresent())
	        {
	            System.out.println("Average of list of Intergers is " + obj.getAsDouble());
	        }
	        else
	        {
	            System.out.println(-1);
	        }
	    }
	}

