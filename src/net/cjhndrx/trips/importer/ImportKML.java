package net.cjhndrx.trips.importer;

import java.io.File;
import java.util.List;

import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.Point;

public class ImportKML {

	public static void printCoordinates() {
		// final Kml kml = Kml.unmarshal(new File("./resources/La Fierney-La Givrine Route.kml"));
		final Kml kml = Kml.unmarshal(new File("./resources/2014-01-11_14-06_Sat_GEConvert.kml"));
		System.out.println("File unmarshalled");
		final Placemark placemark = (Placemark) kml.getFeature();
		final Point point = (Point) placemark.getGeometry();
		final List<Coordinate> coordinates = point.getCoordinates();
		for (final Coordinate coordinate : coordinates) {
			System.out.println(coordinate.getLatitude());
			System.out.println(coordinate.getLongitude());
			System.out.println(coordinate.getAltitude());
		}
	}
}
