package try0502;

public class tryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tryCatchFinally01();
		System.out.println("--------");
		tryCatchFinally02();
		System.out.println("--------");
		tryCatchFinally03();
		System.out.println("--------");
	}

	// 1 catch
	private static void tryCatchFinally01() {
		try {
			int arr[] = new int[5];
			arr[10] = 7;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("索引值超出範圍");
			System.out.println("訊息：" + e);
		} finally {
			System.out.println("finally 中敘述");
		}
		System.out.println("try-catch-finally 敘述之外");
	}

	// 2 catch
	private static void tryCatchFinally02() {
		try {
			int arr[] = new int[5];
			arr[10] = 7;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("索引值超出範圍");
			System.out.println("訊息：" + e);
		} catch (Exception e) {
			System.out.println("訊息：" + e);
		} finally {
			System.out.println("finally 中敘述");
		}
		System.out.println("try-catch-finally 敘述之外");
	}

	// 可能會有疑問，即使沒有撰寫 throw new ArithmeticException(); 
	// 程式也會拋出內建的例外。
	// 本篇的用意在於，若有自己寫的例外類別 程式是無法自動拋出的，
	// 因此必須透過本篇的介紹 來拋出。
	private static void tryCatchFinally03() {
		int a = 10;
		int b = 0;
		
		try {
			if (b==0) {
				throw new ArithmeticException();
			}else {
				System.out.println(a+"/"+b+"="+a/b);
			}
		} catch (ArithmeticException e) {
			System.out.println(e+" 被拋出");
		} catch (Exception e) {
			System.out.println("訊息：" + e);
		} finally {
			System.out.println("finally 中敘述");
		}
		System.out.println("try-catch-finally 敘述之外");
	}
}
