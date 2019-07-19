import org.junit.Test;

public class TestAllExamples extends AbstractTestExamples {
    @Test
    public void testEmptyProgram() {
        testExample("Programming Basics/Hello, World!/Examples/src/EmptyProgram.kt",
                EmptyProgramKt::main);
    }

    @Test
    public void testHamsters() {
        testExample("Introduction to Objects/Property Accessors/Examples/src/Hamsters.kt", propertyaccessors.HamstersKt::main);
    }
}