package Operators;

public class TypeCast1 {

	public static void main(String[] args) {
		//Narrowing casting(Explicit/Manual)
		//convert larger datatype to smaller datatype
		//data loss may happen
		double num = 10.75;
		int num2 = (int) num;
		System.out.println(num2);

	}

}
