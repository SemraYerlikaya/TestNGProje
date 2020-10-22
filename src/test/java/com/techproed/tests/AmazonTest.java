package com.techproed.tests;

import com.techproed.pages.AmazonPage;
import com.techproed.pages.GooglePage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class AmazonTest extends TestBase {
    @Test
    public void aramaTesti(){
        driver.get("http://amazon.com");
        AmazonPage googlePage=new AmazonPage(driver);
        googlePage.aramaKutusu.sendKeys("Baby Stroller");

    }
}
