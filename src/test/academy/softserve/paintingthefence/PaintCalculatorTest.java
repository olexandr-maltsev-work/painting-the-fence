package academy.softserve.paintingthefence;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PaintCalculatorTest {

    private PaintCalculator paintCalculator;

    @Before
    public void setUp() {
        paintCalculator = new PaintCalculator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void post_is_null() {
        paintCalculator.countWays(0,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void color_is_negative() {
        paintCalculator.countWays(23, -3);
    }

    @Test
    public void posts_are_two_color_are_four() {
        BigDecimal expected = new BigDecimal(16);

        BigDecimal actual = paintCalculator.countWays(2, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void post_is_one_color_are_four() {
        BigDecimal expected = new BigDecimal(4);

        BigDecimal actual = paintCalculator.countWays(1, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void check_big_value() {
        BigDecimal expected = new BigDecimal("8716000251518839966464803175767138100592946456125862931906850885070054788361699042500");

        BigDecimal actual = paintCalculator.countWays(50, 50);

        assertEquals(expected, actual);
    }
}