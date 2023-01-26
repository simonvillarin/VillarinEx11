package org.ssglobal.training.codes.itemB;

public class Matrix<T> {
	private Object [][]values;
	private T rows;
	private T cols;
	
	public void create(T r, T c)  throws NegativeArraySizeException, NumberFormatException, Exception {
		if (r instanceof Integer && c instanceof Integer) {
			int rows = (Integer) r;
			int cols = (Integer) c;
			
			try {
				this.values = new Object[rows][cols];
			} catch (NegativeArraySizeException e) {
				throw new NegativeArraySizeException("Invalid index size.");
			}
		} else if (r instanceof Double && c instanceof Double) {
			double rows = (Double) r;
			double cols = (Double) c;
			
			try {
				this.values = new Object[(int) rows][(int) cols];
			} catch (NegativeArraySizeException e) {
				throw new NegativeArraySizeException("Invalid index size.");
			}
		} else if (r instanceof Character && c instanceof Character) {
			char rows = (Character) r;
			char cols = (Character) c;
			
			try {
				this.values = new Object[(int) rows][(int) cols];
			} catch (NegativeArraySizeException e) {
				throw new NegativeArraySizeException("Invalid index size.");
			}
		} else if (r instanceof String && c instanceof String) {
			String rows = (String) r;
			String cols = (String) c;
			
			try {
				this.values = new Object[Integer.parseInt(rows)][Integer.parseInt(cols)];
			} catch (NegativeArraySizeException e) {
				throw new NegativeArraySizeException("Invalid index size.");
			} catch (NumberFormatException e) {
				throw new ArrayIndexOutOfBoundsException("Invalid Index.");
			}
		} else {
			System.out.println("Invalid raw type.");
		}
	}
	
	public void set(T r, T c, T v) throws ArrayIndexOutOfBoundsException, NumberFormatException, Exception{
		if (r instanceof Integer && c instanceof Integer) {
			int rows = (Integer) r;
			int cols = (Integer) c;
			
			try {
				this.values[rows][cols] = v;
			} catch(ArrayIndexOutOfBoundsException e) {
				throw new ArrayIndexOutOfBoundsException("Invalid Index.");
			}
		} else if (r instanceof Double && c instanceof Double) {
			double rows = (Double) r;
			double cols = (Double) c;
			
			try {
				this.values[(int) rows][(int) cols] = v;
			} catch(ArrayIndexOutOfBoundsException e) {
				throw new ArrayIndexOutOfBoundsException("Invalid Index.");
			}
		} else if (r instanceof Character && c instanceof Character) {
			char rows = (Character) r;
			char cols = (Character) c;
			
			try {
				this.values[rows][cols] = v;
			} catch(ArrayIndexOutOfBoundsException e) {
				throw new ArrayIndexOutOfBoundsException("Invalid Index.");
			}
		} else if (r instanceof String && c instanceof String) {
			String rows = (String) r;
			String cols = (String) c;
			
			try {
				this.values[Integer.parseInt(rows)][Integer.parseInt(cols)] = v;
			} catch (NumberFormatException e) {
				throw new NumberFormatException("Wrong number format.");
			} catch(ArrayIndexOutOfBoundsException e) {
				throw new ArrayIndexOutOfBoundsException("Invalid Index.");
			}
		} else {
			System.out.println("Invalid raw type.");
		}
	}
	
	@SuppressWarnings("unchecked")
	public T get(T r, T c) throws ArrayIndexOutOfBoundsException, NumberFormatException, Exception {
		if (r instanceof Integer && c instanceof Integer) {
			int rows = (Integer) r;
			int cols = (Integer) c;
			
			try {
				return (T) values[rows][cols];
			} catch(ArrayIndexOutOfBoundsException e) {
				throw new ArrayIndexOutOfBoundsException("Invalid Index.");
			}
		} else if (r instanceof Double && c instanceof Double) {
			double rows = (Double) r;
			double cols = (Double) c;
			
			try {
				return (T) values[(int) rows][(int) cols];
			} catch(ArrayIndexOutOfBoundsException e) {
				throw new ArrayIndexOutOfBoundsException("Invalid Index.");
			}
		} else if (r instanceof Character && c instanceof Character) {
			char rows = (Character) r;
			char cols = (Character) c;
			
			try {
				return (T) values[rows][cols];
			} catch(ArrayIndexOutOfBoundsException e) {
				throw new ArrayIndexOutOfBoundsException("Invalid Index.");
			}
		} else if (r instanceof String && c instanceof String) {
			String rows = (String) r;
			String cols = (String) c;
			
			try {
				return (T) values[Integer.parseInt(rows)][Integer.parseInt(cols)];
			} catch (NumberFormatException e) {
				throw new NumberFormatException("Wrong number format.");
			} catch(ArrayIndexOutOfBoundsException e) {
				throw new ArrayIndexOutOfBoundsException("Invalid Index.");
			}
		} else {
			return null;
		}
	}
}
