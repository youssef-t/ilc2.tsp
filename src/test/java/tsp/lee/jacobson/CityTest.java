package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	City city0 = new City(0,0);
	City city_pos = new City(5,4);
	City city_neg = new City(-5, -4);
	//epsilon used to specify error margin
	double epsilon = 0.001;

	@Test
	/**
	 * GIVEN distanceTO
	 * WHEN distance between city0 and other cities
	 * THEN distance = sqrt(x²+y²)
	 */
	public void distanceTo_city0_distance0() {
		double actual_distance = city_pos.distanceTo(city0);
		double expected_distance = Math.sqrt(city_pos.getX()*city_pos.getX() + city_pos.getY()*city_pos.getY());

		assertEquals(expected_distance, actual_distance, epsilon);
	}

	@Test
	/**
	 * GIVEN distanceTO
	 * WHEN distance between the same city
	 * THEN distance = 0
	 */
	public void distanceTo_sameCity_0(){
		double actual_distance1 = city_pos.distanceTo(city_pos);
		double actual_distance2 = city_neg.distanceTo(city_neg);
		double expected_distance = 0.0;

		assertEquals(expected_distance, actual_distance1, epsilon);
		assertEquals(expected_distance, actual_distance2, epsilon);
	}


}
