package exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShapeAnalyzer {
	public static List<Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea) {
		List<Shape> result = new ArrayList<>();
		for (Shape shape : shapes) {
			if (shape.getArea() >= minArea) {
				result.add(shape);
			}
		}
		return result;
	}

	public static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes) {
		//Am besten mit Iterator arbeiten
		if (shapes.isEmpty()) {
			return null;
		}

		Shape maxShape = null;
		double maxArea = -10000;

		for (Shape shape : shapes) {
			double area = shape.getArea();
			if (maxShape == null || area > maxArea) {
				maxArea = area;
				maxShape = shape;
			}
		}

		return maxShape;
	}

	public static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shapes) {
		Map<String, List<T>> grouped = new HashMap<>();
		
		for(T shape : shapes) {
			String type = shape.getClass().getSimpleName();
			
			if(!grouped.containsKey(type)) {
				grouped.put(type, new ArrayList<>());
			}
			
			grouped.get(type).add
			return null;
	}
}
