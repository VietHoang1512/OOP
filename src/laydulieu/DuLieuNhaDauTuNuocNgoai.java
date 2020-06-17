package laydulieu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cackieudulieu.NhaDauTuNuocNgoai;

public class DuLieuNhaDauTuNuocNgoai extends LayDuLieuCSV {
	private static NhaDauTuNuocNgoai generateData(List<String> i) {
		NhaDauTuNuocNgoai data = new NhaDauTuNuocNgoai();
		data.setType(i.get(0));
		data.setKhoiLuongMua(Long.parseLong(i.get(1)));
		data.setGiaTriMua(Long.parseLong(i.get(2)));
		data.setKhoiLuongBan(Long.parseLong(i.get(3)));
		data.setGiaTriBan(Long.parseLong(i.get(4)));
		data.setKhoiLuongRong(Long.parseLong(i.get(5)));
		data.setGiaoDichRong(Long.parseLong(i.get(6)));
		data.setRoomConLai(Long.parseLong(i.get(7)));
		data.setDangSoHuu(Double.parseDouble(i.get(8)));
		return data;
		
	}

	public static List<NhaDauTuNuocNgoai> CSV_Extract (String csvPath) {
		List<NhaDauTuNuocNgoai> datalist = new ArrayList<>();
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(csvPath));
            br.readLine();
            while ((line = br.readLine()) != null) {
                datalist.add(generateData(parseCsvLine(line)));
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
