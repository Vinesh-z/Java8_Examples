package functionalInterfaceJ8;

public class FunctioanlInterfaceEg implements CompanyInfoInterface{

	public static void main(String Args[]) {
		
		
		//Implementation
		FunctionalInterfaceEg functioalInterfaceEgImpl = () -> System.out.println("Implementing the interface");
		
		functioalInterfaceEgImpl.myFunctiaonlInterfaceFunction();
		
		FnInterfaceWithArgs argsIntergerAddition = (a, b) -> {
			return (int)a + (int)b;
		};
		
		FnInterfaceWithArgs argsDoubleAddition = (a, b ) -> {
			return a+b;
		};
		
		FnInterfaceWithArgs argsDoubleSub = (a, b ) -> {
			return a-b;
		};
		
		FnInterfaceWithArgs argsDoubleMul = (a,b) -> {
			return a*b;
		};
		
		System.out.println(argsIntergerAddition.calulate(2.3, 3.3));
		
		System.out.println(argsDoubleAddition.calulate(2.3, 3.3));
		
		System.out.println(argsDoubleSub.calulate(2.3, 3.3));
		
		System.out.println(argsDoubleMul.calulate(2.3, 3.3));
		
		
		
	}
}

