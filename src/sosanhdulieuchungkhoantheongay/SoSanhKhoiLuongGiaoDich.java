package sosanhdulieuchungkhoantheongay;
import java.util.Comparator;

import cackieudulieu.ChungKhoanTheoNgay;

public class SoSanhKhoiLuongGiaoDich implements Comparator<ChungKhoanTheoNgay>{

	@Override
	public int compare(ChungKhoanTheoNgay o1, ChungKhoanTheoNgay o2) {
		// Sap xep theo khoi luong giao dich
		return Double.compare(o1.getVolume(), o2.getVolume());
	}

}
