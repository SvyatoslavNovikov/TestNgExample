package testNgExampleWithBaseClass;

import org.example.Print;
import org.testng.annotations.*;

public class TestNgExampleChildClassOne extends TestNgExampleParentClass{

    @BeforeTest
    public void beforeTestChildOneMethod() {
        Print.startMessage()
                .printText("Метод @BeforeTest выполняется перед первым методом @Test")
                .printText("Метод Before класса наследника выполняется после метода Before класса родителя")
                .endMessage();
    }

    @BeforeClass
    public void beforeClassChildOneMethod() {
        Print.startMessage()
                .printText("Метод @BeforeClass выполняется перед первым методом @Test каждого класса")
                .printText("Метод Before класса наследника выполняется после метода Before класса родителя")
                .endMessage();
        ;
    }

    @BeforeMethod
    public void beforeMethodChildOneClass() {
        Print.startMessage()
                .printText("Метод @BeforeMethod выполняется перед каждым методом @Test")
                .printText("Метод Before класса наследника выполняется после метода Before класса родителя")
                .endMessage();
    }

    @Test
    public void testOneChildOne() {
        Print.startMessage()
                .printText("Первый тест первого наследника")
                .printNullResult(parentBeforeTestObject, "parentBeforeTestObject")
                .printNullResult(parentBeforeClassObject, "parentBeforeClassObject")
                .printNullResult(parentBeforeMethodObject, "parentBeforeMethodObject")
                .endMessage();
    }

    @Test
    public void testTwoChildOne() {
        Print.startMessage()
                .printText("Второй тест первого наследника")
                .printNullResult(parentBeforeTestObject, "parentBeforeTestObject")
                .printNullResult(parentBeforeClassObject, "parentBeforeClassObject")
                .printNullResult(parentBeforeMethodObject, "parentBeforeMethodObject")
                .endMessage();
    }

    @Test
    public void testThreeChildOne() {
        Print.startMessage()
                .printText("Третий тест первого наследника")
                .printNullResult(parentBeforeTestObject, "parentBeforeTestObject")
                .printNullResult(parentBeforeClassObject, "parentBeforeClassObject")
                .printNullResult(parentBeforeMethodObject, "parentBeforeMethodObject")
                .endMessage();
    }

    @AfterMethod
    public void afterMethodChildOneClass() {
        Print.startMessage()
                .printText("Метод @AfterMethod выполняется после каждого метода @Test")
                .printText("Метод After класса наследника выполняется перед методом After класса родителя")
                .endMessage();
    }

    @AfterClass
    public void afterClassChildOneMethod() {
        Print.startMessage()
                .printText("Метод @AfterClass выполняется после последнего метода @Test каждого класса")
                .printText("Метод After класса наследника выполняется перед методом After класса родителя")
        ;
    }

    @AfterTest
    public void afterTestChildOneMethod() {
        Print.startMessage()
                .printText("Метод @AfterTest выполняется после последнего метода @Test")
                .printText("Метод After класса наследника выполняется перед методом After класса родителя")
                .endMessage();
    }

}
