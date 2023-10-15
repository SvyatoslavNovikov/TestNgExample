package testNgExampleWithOneClass;

import org.example.Print;
import org.testng.annotations.*;

public class TestNgExampleWithOneClass {

    @BeforeTest
    public void beforeTestMethod() {
        Print.startMessage()
                .printText("Метод @BeforeTest выполняется перед первым методом @Test")
                .endMessage();
    }

    @BeforeClass
    public void beforeClassMethod() {
        Print.startMessage()
                .printText("Метод @BeforeClass выполняется перед первым методом @Test каждого класса")
                .endMessage();
    }

    @BeforeMethod
    public void beforeMethodMethod() {
        Print.startMessage()
                .printText("Метод @BeforeMethod выполняется перед каждым методом @Test")
                .endMessage();
    }

    @Test
    public void testOne() {
        Print.startMessage()
                .printText("Первый тест")
                .endMessage();
    }

    @Test
    public void testTwo() {
        Print.startMessage()
                .printText("Второй тест")
                .endMessage();
    }

    @Test
    public void testThree() {
        Print.startMessage()
                .printText("Третий тест")
                .endMessage();
    }

    @AfterMethod
    public void afterMethodMethod() {
        Print.startMessage()
                .printText("Метод @AfterMethod выполняется после каждого метода @Test")
                .endMessage();
    }

    @AfterClass
    public void afterClassMethod() {
        Print.startMessage()
                .printText("Метод @AfterClass выполняется после последнего метода @Test каждого класса")
                .endMessage();
    }

    @AfterTest
    public void afterTestMethod() {
        Print.startMessage()
                .printText("Метод @AfterTest выполняется после последнего метода @Test")
                .endMessage();
    }

}
