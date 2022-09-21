package week3.day2.homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		/* NOTE: Java code is attached for your reference.

		 1. Launch the URL https://www.ajio.com/
		 2. In the search box, type as "bags" and press enter
		 3. To the left  of the screen under " Gender" click the "Men"
		 4. Under "Category" click "Fashion Bags"
		 5. Print the count of the items Found. 
		 6. Get the list of brand of the products displayed in the page and print the list.
		 7. Get the list of names of the bags and print it */
		
		// 1.  setup the path
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		
		// 2. disable notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		
		// 3. create instance
		ChromeDriver driver=new ChromeDriver(options);
				
		// 4	Launch the browser
		driver.get("https://www.ajio.com/");
		
		// 5. manage ur window
		driver.manage().window().maximize();
		
		// 6. add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// 7. In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys(Keys.ENTER);
		
		// 8. Click on Men
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(5000);
		
		// 9. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(10000);
		
		// 10. Print the count of the items Found. 
		String total = driver.findElement(By.xpath("(//div[@class='filter']/div)[1]")).getText();
		System.out.println("Total number of matches found = " + total);
		
		// 11. Get the list of brand of the products displayed in the page and print the list.
		
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println("  Total number of Brands available = " + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		// 12. Get the list of names of the bags and print it 
		
		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		Thread.sleep(3000);
		System.out.println(" Size :" + bagName.size());
		System.out.println(" Names of the Bags = ");
		for (WebElement bags : bagName) {
			String b = bags.getText();
			System.out.println(b);
		}
		
		//Thread.sleep(4000);
		//driver.close();
		
	}

}
