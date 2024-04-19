import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
PomClass p=new PomClass();
p.setPomClass("Amrutha","sindhu");
p.display();
	}

}
