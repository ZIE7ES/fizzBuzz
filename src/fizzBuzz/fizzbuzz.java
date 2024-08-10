package fizzBuzz;

public class fizzbuzz {

	public static void main(String[] args) {
		
      //Iterar del 1 al 100
		
		for (int i = 1; i <= 100; i++) {
			//Verificar si el número es múltiplo de 3 o de 5
			if (i % 3 == 0 && i % 5 ==0) {
				System.out.println("fizzbuzz");	
			
			}
			else if (i % 3 == 0) {
				//Verificar si el número es múltiplo de 3
				System.out.println("fizz");
			}
			else if (i % 5 == 0) {

				//Verificar si el número es múltiplo de 5
				
				System.out.println("buzz");
			}
			else {				
				//Si no es múltiplo ni de 3 ni de 5
				
				System.out.println(i);
			}
		
		}
	}

}
