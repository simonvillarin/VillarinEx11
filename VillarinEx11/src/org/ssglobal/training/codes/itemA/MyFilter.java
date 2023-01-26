package org.ssglobal.training.codes.itemA;

public class MyFilter implements Filter<CharSequence> {
	
	@Override
	public boolean accept(CharSequence x) {
		String word = (String) x;
		
		if (word.length() >= 3) {
			return true;
		} else if (word.endsWith("s")) {
			return true;
		} else if (word.equalsIgnoreCase(new StringBuilder(word).reverse().toString())) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public static <E> E[] filter(E[] a, Filter<CharSequence> f) {
		String[] newArray = new String[0];
		String[] words = (String[]) a;
		String[] temp = new String[words.length];
		
		for (int i = 0; i < words.length; i++) {
			if (f.accept(words[i])) {
				temp[i] = words[i];
			}
		}
		newArray = temp;
		return (E[]) newArray;
	}
}
