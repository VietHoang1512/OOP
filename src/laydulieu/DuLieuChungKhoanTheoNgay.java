package laydulieu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import cackieudulieu.ChungKhoanTheoNgay;

public class DuLieuChungKhoanTheoNgay extends LayDuLieuCSV{
	public DuLieuChungKhoanTheoNgay() {
		
	}
	private static ChungKhoanTheoNgay generateData(List<String> i, String stockCode) {
		ChungKhoanTheoNgay data = new ChungKhoanTheoNgay();
		data.setStockCode(stockCode);
		data.setTicker(i.get(0));
		data.setDate(i.get(1));
		data.setOpenValue(Double.parseDouble(i.get(2)));
		data.setHighestValue(Double.parseDouble(i.get(3)));
		data.setLowestValue(Double.parseDouble(i.get(4)));
		data.setCloseValue(Double.parseDouble(i.get(5)));
		data.setVolume(Integer.parseInt(i.get(6)));
		return data;
	}

	public static List<ChungKhoanTheoNgay> CSV_Extract (String csvPath, String stockCode) {
		List<ChungKhoanTheoNgay> datalist = new ArrayList<>();
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(csvPath));
            br.readLine();
            while ((line = br.readLine()) != null) {
                datalist.add(generateData(parseCsvLine(line),stockCode));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return datalist;
        }
	
}

