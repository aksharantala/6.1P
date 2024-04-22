package sit707_week6;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WeatherAndMathUtilsTest {

	@Test
	public void testWeatherAdvice() {
		assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(71.0, 0.0));
		assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 0.0));
		assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(44.0, 0.0));
		assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 7.0));
		assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(0.0, 5.0));
		assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(0.0, 3.0));
		assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(71.0, 5.0));
		assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(46.0, 5.0));
	}

	@Test
	public void testIsEven() {
		assertEquals(true, WeatherAndMathUtils.isEven(2));
		assertEquals(false, WeatherAndMathUtils.isEven(1));
		assertEquals(true, WeatherAndMathUtils.isEven(0));
	}
}