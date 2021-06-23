package com.points;

public class PointDemo {

	public static Point addPoints(Point p1, Point p2) {
		int x = p1.getX() + p2.getX();
		int y = p1.getY() + p2.getY();
		return new Point(x, y);
	}

	public static Point subractPoints(Point p1, Point p2) {
		int x = p1.getX() - p2.getX();
		int y = p1.getY() - p2.getY();
		return new Point(x, y);

}}
