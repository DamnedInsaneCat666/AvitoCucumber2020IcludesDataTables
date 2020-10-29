import io.cucumber.datatable.DataTable;
import io.cucumber.java.ParameterType;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepDefs {
    WebDriver driver;

    @Пусть("открыт ресурс авито")
    public void открыт_ресурс_авито() {
        System.out.println("Beginning of Feature");

        System.setProperty("webdriver.chrome.driver", "D:\\Code\\Java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://avito.ru");
        driver.manage().window().maximize();
    }

    //@ParameterType(".*")
   //public Items items(String category) {
    //    return Items.valueOf(category);
    //}

   // @И("в выпадающем списке категорий выбрана {items}")
   // public void в_выпадающем_списке_категорий_выбрана_оргтехника(Items item) {
   //     WebElement categories = driver.findElement(By.id("category"));
   //     categories.click();
//
   //     Select cats = new Select(driver.findElement(By.id("category")));
   //     cats.selectByVisibleText(item.getValue(Items.оргтехника));
   //     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   // }

    @Пусть("в выпадающем списке категорий выбрана \"([^\"]*)\"$")
    public void в_выпадающем_списке_категорий_выбрана_оргтехника(String orgtech) {

        WebElement categories = driver.findElement(By.id("category"));
        categories.click();

        Select cats = new Select(driver.findElement(By.id("category")));
        cats.selectByVisibleText(orgtech);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //@И("в поле поиска введено значение {string}")
    //public void в_поле_поиска_введено_значение_принтер(String printer) {
    //    WebElement search = driver.findElement(By.id("search"));
    //    search.click();
    //    search.sendKeys(printer);
    //    search.sendKeys(Keys.ENTER);
    //}

    @И("в поле поиска введено значение \"([^\"]*)\"$")
    public void в_поле_поиска_введено_значение_принтер(String printer) {
        WebElement search = driver.findElement(By.id("search"));
        search.click();
        search.sendKeys(printer);
        search.sendKeys(Keys.ENTER);
    }

    @Тогда("кликнуть по выпадающему списку региона")
    public void кликнуть_по_выпадающему_списку_региона() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement regions = driver.findElement(By.xpath("//div[@data-marker='search-form/region']/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        regions.click();
    }

   //@Тогда("в поле регион введено значение {string}")
   //public void в_поле_регион_введено_значение_владивосток(String vld) {
   //    WebElement inputRegion = driver.findElement(By.xpath("//input[@data-marker='popup-location/region/input']"));
   //    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   //    inputRegion.sendKeys(vld);
   //    try {
   //        Thread.sleep(5000);
   //    } catch (InterruptedException e) {
   //        e.printStackTrace();
   //    }
   //}

    @Тогда("в поле регион введено значение \"([^\"]*)\"$")
    public void в_поле_регион_введено_значение_владивосток(String vld) {
        WebElement inputRegion = driver.findElement(By.xpath("//input[@data-marker='popup-location/region/input']"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        inputRegion.sendKeys(vld);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @И("нажата кнопка показать объявления")
    public void нажата_кнопка_показать_объявления() {
        WebElement showObs = driver.findElement(By.xpath("//button[@data-marker='popup-location/save-button']"));
        showObs.click();
    }

    //@Тогда("открылась страница рузельтаты по запросу {string}")
    //public void открылась_страница_рузельтаты_по_запросу_принтер(String pr) throws Exception {
    //    try {
    //        Thread.sleep(4000);
    //    } catch (InterruptedException e) {
    //        e.printStackTrace();
    //    }
    //    //String check = "принтер";
    //    WebElement forCheck = driver.findElement(By.xpath("//h1[@data-marker='page-title/text']"));
    //    if (!forCheck.getText().contains(pr))
    //        throw new Exception("Строка не содержит элемент 'принтер'!");
    //}

    @Тогда("открылась страница рузельтаты по запросу \"([^\"]*)\"$")
    public void открылась_страница_рузельтаты_по_запросу_принтер(String pr) throws Exception {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //String check = "принтер";
        WebElement forCheck = driver.findElement(By.xpath("//h1[@data-marker='page-title/text']"));
        if (!forCheck.getText().contains(pr))
            throw new Exception("Строка не содержит элемент 'принтер'!");
    }


    @И("активирован чекбокс только с фотографией")
    public void активирован_чекбокс_только_с_фотографией() {
        WebElement onlyWithPh = driver.findElement(By.xpath("//div[contains(@class, 'filters-root')]/label[2]"));
        onlyWithPh.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //@ParameterType(".*")
    //public Sort sort(String typeOfSort) {
    //    return Sort.valueOf(typeOfSort);
    //}

    //@И("в выпадающем списке сортировка выбрано значение {sort}")
    //public void в_выпадающем_списке_сортировка_выбрано_значение_дороже(Sort sort) {
    //    WebElement sorting = driver.findElement(By.xpath("//div[@class='form-select-v2 sort-select-3QxXG']/select"));
    //    sorting.click();
//
    //    Select sorts = new Select(driver.findElement(By.xpath("//div[@class='form-select-v2 sort-select-3QxXG']/select")));
    //    sorts.selectByVisibleText(sort.getValue(Sort.дороже));
    //    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //    try {
    //        Thread.sleep(5000);
    //    } catch (InterruptedException e) {
    //        e.printStackTrace();
    //    }
    //}

    @И("в выпадающем списке сортировка выбрано значение \"([^\"]*)\"$")
    public void в_выпадающем_списке_сортировка_выбрано_значение_дороже(String sort) {
        WebElement sorting = driver.findElement(By.xpath("//div[@class='form-select-v2 sort-select-3QxXG']/select"));
        sorting.click();

        Select sorts = new Select(driver.findElement(By.xpath("//div[@class='form-select-v2 sort-select-3QxXG']/select")));
        sorts.selectByVisibleText(sort);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //@И("в консоль выведено значение названия и цены {int} первых товаров")
    //public void в_консоль_выведено_значение_названия_и_цены_первых_товаров(int amount) {
    //    List<WebElement> printers = driver.findElements(By.xpath("//div[@class='snippet-list']/div[@data-marker='item']"));
//
    //    for (int i = 0; i < amount; i++) {
    //        try {
    //            Thread.sleep(1000);
    //        } catch (InterruptedException e) {
    //            e.printStackTrace();
    //        }
    //        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", printers.get(i));
    //        System.out.println(printers.get(i).findElement(By.xpath(".//div[@class='description item_table-description']//span")).getText());
    //        System.out.println(printers.get(i).findElement(By.xpath(".//div[@class='snippet-price-row']/span[@itemprop='offers']")).getText() + "\n");
    //    }
    //    driver.quit();
    //    System.out.println("End of Feature");
//
    //}


    @И("в консоль выведено значение названия и цены (-?\\d+) первых товаров$")
    public void в_консоль_выведено_значение_названия_и_цены_первых_товаров(int amount) {
        List<WebElement> printers = driver.findElements(By.xpath("//div[@class='snippet-list']/div[@data-marker='item']"));

        for (int i = 0; i < amount; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", printers.get(i));
            System.out.println(printers.get(i).findElement(By.xpath(".//div[@class='description item_table-description']//span")).getText());
            System.out.println(printers.get(i).findElement(By.xpath(".//div[@class='snippet-price-row']/span[@itemprop='offers']")).getText() + "\n");
        }
        //System.out.println("HERE IT IS " + amount);
        driver.quit();
        System.out.println("End of Feature");

    }
}
