package sosanhdulieubiendongchungkhoan;
import cackieudulieu.BienDongChungKhoan;
import java.util.*;

public class AveMonthlyValComparator implements Comparator<BienDongChungKhoan> {

	@Override
	public int compare(BienDongChungKhoan arg0, BienDongChungKhoan arg1) {
		// TODO Auto-generated method stub
		if(arg0.getAveMonthlyVal() == arg1.getAveMonthlyVal())
			return 0;
		else if(arg0.getAveMonthlyVal() > arg1.getAveMonthlyVal())
			return -1;
		else 
			return 1;
	}

}
