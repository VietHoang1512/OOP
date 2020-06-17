package laydulieu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cackieudulieu.ChiSoINDEX;

public class DuLieuChiSoINDEX extends LayDuLieuCSV {
	private static ChiSoINDEX generateData(List<String> args, String stockCode) {
		ChiSoINDEX data = new ChiSoINDEX();
		data.setStockCode(stockCode);
		data.setDate(args.get(0));
		data.setCloseValue(Double.parseDouble(args.get(1).substring(0, args.get(1).length())));
		data.setChange(args.get(2));
		// Xoa tat ca cac dau "." trong 4 gia tri duoi day va chuyen sang kieu long giup
		// de dang thao tac
		data.setGDKhopLenhVol(Long.parseLong(args.get(3).substring(1, args.get(3).length()).replaceAll("\\.", "")));
		data.setGDKhopLenhval(Long.parseLong(args.get(4).substring(1, args.get(4).length()).replaceAll("\\.", "")));
		data.setGDThoaThuanvol(Long.parseLong(args.get(5).substring(1, args.get(5).length()).replaceAll("\\.", "")));
		data.setGDThoaThuanval(Long.parseLong(args.get(6).substring(1, args.get(6).length()).replaceAll("\\.", "")));
		data.setOpenValue(Double.parseDouble(args.get(7).substring(0, args.get(7).length())));
		data.setHighestValue(Double.parseDouble(args.get(8).substring(0, args.get(8).length())));
		data.setLowestValue(Double.parseDouble(args.get(9).substring(0, args.get(9).length())));
		return data;
	}

	public static List<ChiSoINDEX> CSV_Extract(String csvPath, String stockCode) {
		List<ChiSoINDEX> datalist = new ArrayList<>();
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new FileReader(csvPath));
			// Skip the first line
			br.readLine();
			// How to read file in java line by line?
			while ((line = br.readLine()) != null) {
				datalist.add(generateData(parseCsvLine(line), stockCode));
				// generateData(parseCsvLine(line),stockCode).displayData();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException crunchifyException) {
				crunchifyException.printStackTrace();
			}
		}
		return datalist;
	}
}
