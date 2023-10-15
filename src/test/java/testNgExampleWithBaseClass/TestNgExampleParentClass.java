package testNgExampleWithBaseClass;

import org.example.Print;
import org.testng.annotations.*;

public abstract class TestNgExampleParentClass {

    public Object parentBeforeTestObject;
    public Object parentBeforeClassObject;
    public Object parentBeforeMethodObject;

    @BeforeTest
    public void beforeTestParentMethod() {
        parentBeforeTestObject = new Object();

        Print.startMessage()
                .printText("Метод @BeforeTest выполняется перед первым методом @Test")
                .printText("Метод Before родительского класса выполняется перед методом Before наследником")
                .endMessage();
    }

    @BeforeClass
    public void beforeClassParentMethod() {
        parentBeforeClassObject = new Object();

        Print.startMessage()
                .printText("Метод @BeforeClass выполняется перед первым методом @Test каждого класса")
                .printText("Метод Before родительского класса выполняется перед методом Before наследником")
                .endMessage();
    }

    @BeforeMethod
    public void beforeMethodParentMethod() {
        parentBeforeMethodObject = new Object();

        Print.startMessage()
                .printText("Метод @BeforeMethod выполняется перед каждым методом @Test")
                .printText("Метод Before родительского класса выполняется перед методом Before наследником")
                .endMessage();
        ;
    }

    @AfterMethod
    public void afterMethodParentMethod() {
        Print.startMessage()
                .printText("Метод @AfterMethod выполняется после каждого метода @Test")
                .printText("Метод After родительского класс выполняется после метода After наследника")
                .endMessage();
    }

    @AfterClass
    public void afterClassMethod() {
        Print.startMessage()
                .printText("Метод @AfterClass выполняется после последнего метода @Test каждого класса")
                .printText("Метод After родительского класс выполняется после метода After наследника")
                .endMessage();
    }

    @AfterTest
    public void afterTestMethod() {
        Print.startMessage()
                .printText("Метод @AfterTest выполняется после последнего метода @Test")
                .printText("Метод After родительского класс выполняется после метода After наследника")
                .endMessage();
    }

}
