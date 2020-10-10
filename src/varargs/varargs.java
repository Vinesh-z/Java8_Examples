package varargs;

import java.util.Arrays;
import java.util.Collections;

public class varargs {

	public static void main(String[] args)
	{
		int[] array={3,5,6};
		fun(10);
		fun(1,2,3);
		fun(array);

	}


	static void fun(Object...a)
	{
		for(Object o: a) {

			if(o.getClass().isArray()) {
				System.out.println();			
			} else {
				System.out.println(o);
			}
		}
	}
}
