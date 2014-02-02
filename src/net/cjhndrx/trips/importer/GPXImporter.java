package net.cjhndrx.trips.importer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GPXImporter {
	public static void importGpx() throws IOException {
		final File file = new File("./resources/2014-01-11_14-06_Sat.gpx");
		System.out.println("File created");
		final BufferedReader br = new BufferedReader(new FileReader(file));
		int trkptCounter = 0;
		String line;
		while ((line = br.readLine()) != null) {
			if (line.contains("<trkpt ")) {
				trkptCounter += 1;
			}
		}
		System.out.println("Count of trkpt = " + trkptCounter);
		br.close();

	}
}
