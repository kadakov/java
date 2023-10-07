import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void calculateMySolution_withK0() {
        Main main = new Main(0.5, 10);
        double result = main.calculateMySolution(10, 0.5);
        assertTrue(Math.abs(0.2962962963 - result) < 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculateMySolution_withK1() {
        Main main = new Main(0.4, 3);
        double result = main.calculateMySolution(3, 0.4);
        assertTrue(Math.abs(main.calculateSystemSolution(0.4) - result) < 0.01);
    }
}