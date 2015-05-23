public class Calculate {
	public static void main (String[] args)	{
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]); // ѕреобразование строки в интересующий нас тип + ввод значение с клавиатуры через пробел
		int second = Integer.valueOf(args[1]); 
		
		double third = Double.valueOf(args[2]);
		float fourth = Float.valueOf(args[3]);
		short fifth = Short.valueOf(args[4]);
		long sixth = Long.valueOf(args[5]);
				
		int sum = first + second;
		int minus = first - second;
		int mult = first * second;
		int divide = first / second;
		
		System.out.println("sum  =" + sum);
		System.out.println("minus =" + minus);
		System.out.println("mult =" + mult);
		System.out.println("divide = " + divide);

		int seventh = (int) Math.pow(third,fourth);
		System.out.println(seventh);
		
		int eighth = (int) Math.pow(fifth,sixth);
		System.out.println(eighth);

		
		
		
		
		


		
		
	}
}
