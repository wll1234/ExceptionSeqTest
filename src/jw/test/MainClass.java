package jw.test;

public class MainClass {

	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		try {
			et.justException();
		} catch (Exception e) {
			System.out.println("[MAIN-justException] "+e.getMessage());
		}
		System.out.println();
		try {
			et.throwsException();
		} catch (Exception e) {
			System.out.println("[MAIN-throwsException] "+e.getMessage());
		}
		System.out.println();
		try {
			et.throwsTryCatchException();
		} catch (Exception e) {
			System.out.println("[MAIN-throwsTryCatchException] "+e.getMessage());
		}
		System.out.println();
		try {
			et.tryCatchException();
		} catch (Exception e) {
			System.out.println("[MAIN-tryCatchException] "+e.getMessage());
		}
		System.out.println();
		try {
			et.throwsTryFinallyException();
		} catch (Exception e) {
			System.out.println("[MAIN-throwsTryFinallyException] "+e.getMessage());
		}
		System.out.println();
		try {
			et.throwsTryCatchFinallyException();
		} catch (Exception e) {
			System.out.println("[MAIN-throwsTryCatchFinallyException] "+e.getMessage());
		}
	}
}
