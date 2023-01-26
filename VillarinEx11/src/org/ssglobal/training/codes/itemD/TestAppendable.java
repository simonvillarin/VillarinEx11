package org.ssglobal.training.codes.itemD;

import java.util.Arrays;

public class TestAppendable {

	public static void main(String[] args) {
		MyString ms = new MyString();
		try {
			ms.append("Simon");
			ms.append("James");
			ms.append("Villarin");
			System.out.println(Arrays.toString(ms.getArr()));
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (ArrayStoreException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		MyListInt mli = new MyListInt();
		try {
			mli.append(1);
			mli.append(2);
			mli.append(3);
			System.out.println(Arrays.toString(mli.geArr()));
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (ArrayStoreException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
