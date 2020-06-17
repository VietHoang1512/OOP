package sosanhdulieuchungkhoantheongay;

import java.util.Comparator;

import cackieudulieu.ChungKhoanTheoNgay;

public class SoSanhTinhOnDinh implements Comparator<ChungKhoanTheoNgay>{

	@Override
	public int compare(ChungKhoanTheoNgay o1, ChungKhoanTheoNgay o2) {
		// Sap xep theo do on dinh
		return Double.compare(o1.getAmplitude(), o2.getAmplitude());
	}

}
