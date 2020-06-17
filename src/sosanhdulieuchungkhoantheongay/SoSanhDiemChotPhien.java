package sosanhdulieuchungkhoantheongay;

import java.util.Comparator;

import cackieudulieu.ChungKhoanTheoNgay;

public class SoSanhDiemChotPhien implements Comparator<ChungKhoanTheoNgay>{

	@Override
	public int compare(ChungKhoanTheoNgay o1, ChungKhoanTheoNgay o2) {
		// Sap xep theo diem chot phien
		return Double.compare(o1.getCloseValue(), o2.getCloseValue());
	}

}
