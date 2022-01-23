package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class myTests {
	
	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, true);
	}


}
