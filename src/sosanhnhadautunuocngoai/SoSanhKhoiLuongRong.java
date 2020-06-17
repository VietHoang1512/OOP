package sosanhnhadautunuocngoai;

import cackieudulieu.*;
import java.util.*;


public class SoSanhKhoiLuongRong implements Comparator<NhaDauTuNuocNgoai> {

	@Override
	public int compare(NhaDauTuNuocNgoai arg0, NhaDauTuNuocNgoai arg1) {
		// TODO Auto-generated method stub
		return Long.compare(arg0.getKhoiLuongRong(), arg1.getKhoiLuongRong());
	}
	
}
