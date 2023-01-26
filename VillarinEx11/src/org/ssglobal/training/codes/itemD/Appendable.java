package org.ssglobal.training.codes.itemD;

public interface Appendable<E> {

    void append(E a) throws NullPointerException, IndexOutOfBoundsException, ArrayStoreException, Exception;
}