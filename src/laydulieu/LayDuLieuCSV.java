package laydulieu;

import java.util.ArrayList;
import java.util.List;

public abstract class LayDuLieuCSV {
	private static final String COMMA_DELIMITER = ","; // Split by comma

	public static List<String> parseCsvLine(String csvLine) {
		List<String> result = new ArrayList<String>();
		if (csvLine != null) {
			String[] splitData = csvLine.split(COMMA_DELIMITER);
			for (int i = 0; i < splitData.length; i++) {
				result.add(splitData[i]);
			}
		}
		return result;
	}
}
