package org.ssglobal.training.codes.itemA;

import java.util.Arrays;

public class TestMyFilter {

	public static void main(String[] args) {
		MyFilter filter = new MyFilter();
		String[] arr = { "Simon", "James", "Vilarin", "Racecar" };

		System.out.println(Arrays.toString(MyFilter.filter(arr, filter)));
	}

}
