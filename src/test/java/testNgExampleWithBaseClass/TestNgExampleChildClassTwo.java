package testNgExampleWithBaseClass;

import org.example.Print;
import org.testng.annotations.*;

public class TestNgExampleChildClassTwo extends TestNgExampleParentClass{

    @BeforeTest
    public void beforeTestChildTwoMethod() {
        Print.startMessage()
                .printText("Метод @BeforeTest выполняется перед первым методом @Test")
                .printText("Метод Before класса наследника выполняется после метода Before класса родителя")
                .endMessage();
    }

    @BeforeClass
    public void beforeClassChildTwoMethod() {
        Print.startMessage()
                .printText("Метод @BeforeClass выполняется перед первым методом @Test каждого класса")
                .printText("Метод Before класса наследника выполняется после метода Before класса родителя")
                .endMessage();
        ;
    }

    @BeforeMethod
    public void beforeMethodChildTwoClass() {
        Print.startMessage()
                .printText("Метод @BeforeMethod выполняется перед каждым методом @Test")
                .printText("Метод Before класса наследника выполняется после метода Before класса родителя")
                .endMessage();
    }

    @Test
    public void testOneChildTwo() {
        Print.startMessage()
                .printText("Первый тест второго наследника")
                .printNullResult(parentBeforeTestObject, "parentBeforeTestObject")
                .printNullResult(parentBeforeClassObject, "parentBeforeClassObject")
                .printNullResult(parentBeforeMethodObject, "parentBeforeMethodObject")
                .endMessage();
    }

    @Test
    public void testTwoChildTwo() {
        Print.startMessage()
                .printText("Второй тест второго наследника")
                .printNullResult(parentBeforeTestObject, "parentBeforeTestObject")
                .printNullResult(parentBeforeClassObject, "parentBeforeClassObject")
                .printNullResult(parentBeforeMethodObject, "parentBeforeMethodObject")
                .endMessage();
    }

    @Test
    public void testThreeChildTwo() {
        Print.startMessage()
                .printText("Третий тест второго наследника")
                .printNullResult(parentBeforeTestObject, "parentBeforeTestObject")
                .printNullResult(parentBeforeClassObject, "parentBeforeClassObject")
                .printNullResult(parentBeforeMethodObject, "parentBeforeMethodObject")
                .endMessage();
    }

    @AfterMethod
    public void afterMethodChildClass() {
        Print.startMessage()
                .printText("Метод @AfterMethod выполняется после каждого метода @Test")
                .printText("Метод After класса наследника выполняется перед методом After класса родителя")
                .endMessage();
    }

    @AfterClass
    public void afterClassChildMethod() {
        Print.startMessage()
                .printText("Метод @AfterClass выполняется после последнего метода @Test каждого класса")
                .printText("Метод After класса наследника выполняется перед методом After класса родителя")
        ;
    }

    @AfterTest
    public void afterTestChildMethod() {
        Print.startMessage()
                .printText("Метод @AfterTest выполняется после последнего метода @Test")
                .printText("Метод After класса наследника выполняется перед методом After класса родителя")
                .endMessage();
    }

}
