package pkg1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
@SuppressWarnings("deprecation")
@DisplayName("JUnit 5 Standard Test Class Example")
@RunWith(JUnitPlatform.class)
public class StandradTest {

	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("Before all test cases");
	}
	
	@BeforeEach
	public  void beforeEach()
	{
		System.out.println("Before each test cases");
	}
	@DisplayName("Standard test")
	@Test
	public  void test()
	{
		System.out.println("Test case 1");
	}
	@Test
	public  void test1()
	{
		System.out.println("Test case 2");
	}
	
	@AfterEach
	public  void afterEach()
	{
		System.out.println("After each test case");
	}
	@AfterAll
	public static void afterAll()
	{
		System.out.println("After all test case");
	}
	
	@Disabled
	@Test
	public void skippedTest()
	{
		System.out.println("Skipped test case");
	}
	
	
	
}