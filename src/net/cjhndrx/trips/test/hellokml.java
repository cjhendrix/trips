package net.cjhndrx.trips.test;

import java.io.IOException;

import net.cjhndrx.trips.importer.GPXImporter;

public class hellokml {

	public static void main(final String[] args) throws IOException {
		GPXImporter.importGpx();
	}
	// public static void main(final String[] args) throws FileNotFoundException {
	// final Kml kml = new Kml();
	// kml.createAndSetPlacemark().withName("London, UK").withOpen(Boolean.TRUE).createAndSetPoint().addToCoordinates(-0.126236, 51.500152);
	// kml.marshal(new File("HelloKml.kml"));
	// printCoordinates();
	// }
	//
	// public static void printCoordinates() {
	// final Kml kml = Kml.unmarshal(new File("HelloKml.kml"));
	// final Placemark placemark = (Placemark) kml.getFeature();
	// final Point point = (Point) placemark.getGeometry();
	// final List<Coordinate> coordinates = point.getCoordinates();
	// for (final Coordinate coordinate : coordinates) {
	// System.out.println(coordinate.getLatitude());
	// System.out.println(coordinate.getLongitude());
	// System.out.println(coordinate.getAltitude());
	// }
	// }
}
