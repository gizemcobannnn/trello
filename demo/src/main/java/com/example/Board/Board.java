package com.example.Board;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Board {
public WebDriver driver;


public void openWeb(){
    driver = new ChromeDriver();
}

public void createBoard(){
        WebElement boardCreateButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div[3]/button"));
        boardCreateButton.click();

        WebElement boardCreateSelect = driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div/nav/ul/li[1]/button"));
        boardCreateSelect.click();

        WebElement boardNameInput = driver.findElement(By.xpath("/html/body/div[4]/div/section/div/form/div[1]/label/input"));
        boardNameInput.sendKeys("My Board");      

        WebElement boardNameCreate = driver.findElement(By.xpath("/html/body/div[4]/div/section/div/form/button"));
        boardNameCreate.click(); 

}

public void addCard(){
        WebElement addCardButton = driver.findElement(By.xpath("//*[@id=\"board\"]/li/div/div[3]/button[1]"));
        addCardButton.click(); 

        WebElement textArea = driver.findElement(By.xpath("//*[@id=\"board\"]/li/div/ol/li/form/textarea"));
        textArea.sendKeys("chart1");

        WebElement submitChart = driver.findElement(By.xpath("//*[@id=\"board\"]/li/div/ol/li[2]/form/div/button[1]"));
        submitChart.click();

        
        WebElement selectEditButton = driver.findElement(By.xpath("//*[@id=\"board\"]/li/div/ol/li[1]/div/button"));
        selectEditButton.click();
    
        WebElement archiveButton = driver.findElement(By.xpath("//*[@id=\"layer-manager-popover\"]/div/div/div/div/button[7]"));
        archiveButton.click();
}

public void closeBoard(){
    WebElement menuBoard = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div/span[2]/button[2]/span/span"));
    menuBoard.click();
    
    WebElement closeBoard = driver.findElement(By.className("board-menu-navigation-item-link board-menu-navigation-item-link-v2 js-close-board"));
    closeBoard.click();    
}

public void closeWeb(){
        driver.quit();
}

}