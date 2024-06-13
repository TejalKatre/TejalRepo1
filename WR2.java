import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wronglogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
	
		
		Thread.sleep(5000);
		
        driver.get("https://authv2.prestashop.com/login?login_challenge=5tHlvOL0Dt6pa46V5JXsX2YgNjfT5cnlwYWCSB5G7b8BX5m1wH9fuj2-u9suPJ_QdV3_8hkNqn5GD71OOkVt8HZVve56TBZCWSpJhnpKb3HaVLk1caiw74QnsWqfLZOQ3AeUrAUq9kXzlqaf-emwDLj-QK552msxw4wN9cU6DS7cIswB4H5-q4ydl-FCI3Nc9X2B3WKZEUqCJ6VjU-oTfWUP4mVfKK3eQeCptvtPo54-fP-GCEbu0w0o2NgAiDQi5uPlOqaE97-9DCwNl0qQ6dhJ8GhimhF-7XYFSKD8nsJgpTkpxnOBSx_IHyUiQp2k9GGg-eaJvp_4dfNmsAs2XxXWn-1YH5BlU1zZR36k1hXTubwgQ3ytXZ40yV9Gn6ivkXhdCF3liwwWe53B25bZC9k9vNEY5uQ3KxuvKEG1OoMrd9f9oyXFbbbI8UkX2n7iVIlq01c7udc9eEjiqWC5AsmaBZb-E55ywKKEaD_Mk4ehAECmJz4itmUKUD6Np1kZ80XnJ1VHAoTymQANCHFEchc5m21pbd35EjLLyU1xNO82gJ1fjuNJ4QEHlIzL_dbOMlISBOdRis6yb3qqaoVEYB0lE1K-ziz8grjYGjk9K1SsAqv0LjIdmxKp6sddAY0gZK0B4FTvD1M745DEjMRDIAz9lm613aRudCxbdu9QhqzSe6JDzMbhFApPVkm01P63bRuB-30pWaOSTPSEe8XQDnnFLc-YIsbuG0pI-tDP5mQ397lUFDotoxYe507ePOdZ0Y97oz1jPnulPx7c23IVS8KCM8uRF7eTe4snZ4fNeE_GvJTjrD9Hn2SLsD2V5B0zcCRTcMdKcb_LBRMGf84PQs_49Nt_f_m65-5tjnQZGF0FXUVvNjfOBSuRPHTBu8sybt82li0rO9U8Mt5s4fOBCWkesKNezHz023SYrUrMGjlnGfMhmp_hChoTMKCcB9home-Phv3z9g0sy0RG2qdzjoXAUJx3CrwO4b4cKmP_bGPSmqOSHQ-eWiFILkBmo8BhpoC7zwcFr1crzrsWQKgB7jh3-e0ekUvBXnyzbFmGRGPIXWuQMl9UpqxWW7ipi08o20oFuv-hwn6KObhWUZw6BCn9P_MAfMSO55Lhm31gXCbHEXNsMwgTbXFQPrYy7OsocA8Zsb6pWuRFi7IuOHe4c3fg30nhag-WFuMN5Hm4MGVdjkjBd6xP3CEsVoqiPKPjDJJ0rt-EJ289UlUIKOywdCHFmT97UQiTr9cvdpFe1l5hQ5dwVQa3-1WScxxoSP6bBybv1iA74rsKRN5cjCJSTdsirFqqpzGB76Nxg57KJkHynf41vCfJ_yammVEenJDXcJQGoeW73n2lFmvh7x-bg40iJ-T5PeyFZS7SAuWr7qwkVCDTtfmsFA3gM9PwwwYbbEaFE7F4ltBYKC1axwhxvXC-i_5XWmcG9CImMksUDgvK_jgQLI_30hvOOw2jJCa19GVjNb4i86dJ_larHBYlPmjx4vjNqFaVd8nUCcLC3_S9osWZhomhbfDKbJQqwZ1KDpXTNvSY3-dP7BX0448AZ4oP8gGhS5VRl0DClyeKKQPhHd95GGaeAEum3Nkicc56J3hzBwvYA1qk7YerFW_3-nGFEvpsWAnBgbhcVfuLU4wygw%3D%3D");
        
       
        
       // Entered here wrong login details
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@id='email' and @placeholder = 'Enter your email address']")).sendKeys("ay.bh@gmail.com");
        
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@id='password' and @placeholder = 'Enter your password']")).sendKeys("tejalk1");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
              
       // Here we are verifying Expected text by capturing text with 'get.Text()' method. And will verify it against ExpectedResult String we have declared.
        
        String ExpectedResult = "wrong login";
        
        String ActualResult = driver.findElement(By.xpath("//span[contains(text(),'The email address or the password are invalid.']")).getText();
        
           SoftAssert softAssert = new SoftAssert();
           
           
           softAssert.assertEquals(ActualResult,ExpectedResult);
                
        	
	}

}
