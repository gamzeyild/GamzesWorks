package Dogrulama;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class UrunIslem extends Dogrulama {
    public void UrunAramaKontrolu (){
        Random rnd = new Random();
        int index =rnd.nextInt(28)+1;
        driver.get("https://www.n11.com/");
        driver.findElement(By.id("searchData")).sendKeys("Bilgisayar");
        driver.findElement(By.id("searchBtn")).click();
        List<WebElement> fiyatListesi =driver.findElements(By.cssSelector("class='proDetail'"));
        String fiyat = fiyatListesi.get(index).getText();
        List <WebElement> urunListesi =driver.findElements(By.cssSelector("li[class='column']"));
        fiyatListesi.get(index).click();
        String sepettekiFiyat =driver.findElement(By.id("priceArea")).getText();
        Assert.assertEquals("Ürün fiyatı , arama sayfasında ve sepette aynı değil",sepettekiFiyat,fiyat);
        driver.findElement(By.id("btnAddBasket")).click();
        driver.findElement(By.id("class=spinnerUp spinnerArrow")).click();
        driver.findElement(By.id("class=removeProd svgIcon svgIcon_trash")).click();
        driver.findElement(By.cssSelector("class='pagination'[https://www.n11.com/arama?q=Bilgisayar&amp;pg=2"));



    }
}
