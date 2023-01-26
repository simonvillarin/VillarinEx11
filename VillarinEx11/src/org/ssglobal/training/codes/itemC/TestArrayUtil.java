package org.ssglobal.training.codes.itemC;

public class TestArrayUtil {

	public static void main(String[] args) {	
		try {
			String result = ArrayUtil.getCentral(new String[] {"Simon", "James", "Hatamosa", "Villarin"});
			System.out.println(result);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Character result = ArrayUtil.getCentral(new Character[] {'a', 'b', 'c', 'd', 'e'});
			System.out.println(result);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Integer result = ArrayUtil.getCentral(new Integer[] {10, 11, 12, 13, 14, 15});
			System.out.println(result);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
