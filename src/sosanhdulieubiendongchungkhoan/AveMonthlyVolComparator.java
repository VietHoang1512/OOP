package sosanhdulieubiendongchungkhoan;

import java.util.Comparator;

import cackieudulieu.BienDongChungKhoan;

public class AveMonthlyVolComparator implements Comparator<BienDongChungKhoan>  {

	@Override
	public int compare(BienDongChungKhoan o1, BienDongChungKhoan o2) {
		// TODO Auto-generated method stub
		if(o1.getAveMonthlyVol() == o2.getAveMonthlyVol())
			return 0;
		else if(o1.getAveMonthlyVol() > o2.getAveMonthlyVol())
			return -1;
		else 
			return 1;
	}

}
