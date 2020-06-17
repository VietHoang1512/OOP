package sosanhdulieuchungkhoantheongay;

import java.util.Comparator;

import cackieudulieu.ChungKhoanTheoNgay;

public class SoSanhDiemMoPhien implements Comparator<ChungKhoanTheoNgay>{

	@Override
	public int compare(ChungKhoanTheoNgay o1, ChungKhoanTheoNgay o2) {
		// Sap xep theo diem mo phien
		return Double.compare(o1.getOpenValue(), o2.getOpenValue());
	}

}
