package Mymaven.MavenJava;

import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

public class FirstTest {

	public static void main(String[] args) {
		
		System.out.println("hello");

	}
	@Test
	public void method1() {
		System.out.println("i m method1");
	}
	@BeforeTest
	public void method2() {
		System.out.println("i m from before test");
	}
	@Test
	public void method3() {
		System.out.println("i m method 3");
	}
	

}
