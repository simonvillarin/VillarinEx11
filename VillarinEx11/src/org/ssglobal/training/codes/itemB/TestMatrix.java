package org.ssglobal.training.codes.itemB;

public class TestMatrix {

	public static void main(String[] args) {
		Matrix<Integer> matrix = new Matrix<Integer>();
		try {
			matrix.create(2, 2);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			matrix.set(1, 1, 10);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(matrix.get(1, 1));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Matrix<Double> matrix1 = new Matrix<Double>();
		try {
			matrix1.create(3.0, 3.0);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			matrix1.set(2.0, 2.0, 10.0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(matrix1.get(2.0, 2.0));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Matrix<Character> matrix2 = new Matrix<Character>();
		try {
			matrix2.create('a', 'b');
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			matrix2.set('A', 'A', 'c');
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(matrix2.get('A', 'A'));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Matrix<String> matrix3 = new Matrix<String>();
		try {
			matrix3.create("3", "3");
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			matrix3.set("2", "2", "10");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(matrix3.get("2", "2"));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
