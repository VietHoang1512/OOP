package sosanhdulieubiendongchungkhoan;
import java.util.Comparator;

import cackieudulieu.BienDongChungKhoan;

public class ChangeComparator implements Comparator<BienDongChungKhoan> {

	@Override
	public int compare(BienDongChungKhoan arg0, BienDongChungKhoan arg1) {
		// TODO Auto-generated method stub
		if(arg0.getTodayChange() == arg1.getTodayChange())
			return 0;
		else if(arg0.getTodayChange() > arg1.getTodayChange())
			return -1;
		else 
			return 1;
	}

}
