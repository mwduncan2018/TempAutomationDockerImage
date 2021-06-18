package dunit.dsg;

import static org.junit.Assert.fail;

import java.net.URL;
import java.net.InetAddress;

import org.junit.Test;
import org.junit.BeforeClass;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AlphaTest {
	private static String ubuntuHub = "http://172.29.210.59:4444/wd/hub";
	private static String windowsIpv4Hub = "http://192.168.1.12:4444/wd/hub";
	private static String windowsLocalHub = "http://localhost:4444/wd/hub";
	private static String windows127Hub = "http://127.0.0.1:4444/wd/hub";
	private static String windowsIpv4DnsHub = "http://192.168.1.1:4444/wd/hub"; // Does not work
	private static String hub;
	
	@BeforeClass
	public static void beforeAll() {
		hub = windowsIpv4Hub;
	}
	
	@Test
	public void alphaTest() throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(new URL(hub), dc);
		driver.get("https://www.ultimateguitar.com");
		System.out.println("..." + driver.getCurrentUrl());
		driver.quit();
	}

	@Test
	public void betaTest() throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(new URL(hub), dc);
		driver.get("https://www.duckduckgo.com");
		System.out.println("..." + driver.getCurrentUrl());
		driver.quit();
	}

	@Test
	public void charlieTest() throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(new URL(hub), dc);
		driver.get("https://www.google.com");
		System.out.println("..." + driver.getCurrentUrl());
		driver.quit();
	}

	@Test
	public void deltaTest() throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(new URL(hub), dc);
		driver.get("https://www.yahoo.com");
		System.out.println("..." + driver.getCurrentUrl());
		driver.quit();
	}

}