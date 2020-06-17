package laydulieu;

import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import cackieudulieu.BienDongChungKhoan;
import cackieudulieu.ChiSoINDEX;

import java.lang.Double;

public class DuLieuBienDongChungKhoan extends LayDuLieuCSV {
	private static BienDongChungKhoan generateData(List<String> args) {
		BienDongChungKhoan data = new BienDongChungKhoan();
		data.setName(args.get(1));
		data.setVonHoa(args.get(2));
		data.setTodayValandChange(args.get(3));
		data.setTodayVol(args.get(4));
		data.setAveMonthlyVal(args.get(5));
		data.setAveMonthlyVol(args.get(7));
		return data;
	}
	
	public static List<BienDongChungKhoan> CSV_Extract(String csvPath) {
		List<BienDongChungKhoan> datalist = new ArrayList<>();
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(csvPath));
            // Skip the first line
            br.readLine();
            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                datalist.add(generateData(parseCsvLine(line)));
                //generateData(parseCsvLine(line)).displayData();
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

