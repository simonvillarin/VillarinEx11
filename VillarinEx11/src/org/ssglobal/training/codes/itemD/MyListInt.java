package org.ssglobal.training.codes.itemD;

public class MyListInt implements Appendable<Integer> {

	private Integer[] arr = new Integer[0];

    public Integer[] geArr() {
        return arr;
    }

    @Override
    public void append(Integer a) throws NullPointerException, 
    IndexOutOfBoundsException, ArrayStoreException,  Exception {
        try {
            Integer[] temp = new Integer[arr.length + 1];
            System.arraycopy(arr, 0, temp, 0, temp.length - 1);
            temp[temp.length - 1] = a;
            arr = temp;
        } catch (NullPointerException e) {
            throw new NullPointerException("cannot add the specified Integer");
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("cannot add the specified Integer");
        } catch (ArrayStoreException e) {
            throw new ArrayStoreException("trying to add a wrong type of object");
        }
    }
}
