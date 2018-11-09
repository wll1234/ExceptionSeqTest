package jw.test;

public class ExceptionTest {
	
	/**
	 * Exception without any handle.
	 */
	public void justException() {
		System.out.println("justException Start");
		int a = 1 / 0;
		System.out.println("justException End");
	}
	
	/**
	 * Throws Exception Method.
	 * @throws Exception
	 */
	public void throwsException() throws Exception{
		System.out.println("throwsException Start");
		int a = 1 / 0;
		System.out.println("throwsException End");
	}
	
	/**
	 * Use Try-Catch block in throws Exception method.
	 * @throws Exception
	 */
	public void throwsTryCatchException() throws Exception{
		System.out.println("throwsTryCatchException Start");
		try {
			int a = 1 / 0;
		} catch (Exception e) {
			System.out.println("[throwsTryCatchException] "+e.getMessage());
			throw e;
		}
		System.out.println("throwsTryCatchException End");
	}
	
	/**
	 * Just Try-Catch block.
	 */
	public void tryCatchException(){
		System.out.println("tryCatchException Start");
		try {
			int a = 1 / 0;
		} catch (Exception e) {
			System.out.println("[tryCatchException] "+e.getMessage());
		}
		System.out.println("tryCatchException End");
	}
	
	/**
	 * Try but not Catch.
	 * @throws Exception
	 */
	public void throwsTryFinallyException() throws Exception{
		try {
			int a = 1 / 0;
		} finally {
			System.out.println("[throwsTryFinallyException] Finally");
		}
	}
	
	/**
	 * Try-Catch-Final ans throw
	 * @throws Exception
	 */
	public void throwsTryCatchFinallyException() throws Exception{
		try {
			int a = 1 / 0;
		} catch (Exception e) {
			System.out.println("[throwsTryCatchFinallyException] Exception Cause = "+e.getMessage());
			throw e;
		} finally {
			System.out.println("[throwsTryCatchFinallyException] Finally");
		}
	}
}
