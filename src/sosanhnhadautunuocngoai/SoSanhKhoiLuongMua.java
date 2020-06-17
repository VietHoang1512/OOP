package sosanhnhadautunuocngoai;
import java.util.Comparator;
import cackieudulieu.NhaDauTuNuocNgoai;

public class SoSanhKhoiLuongMua implements Comparator<NhaDauTuNuocNgoai>{

	@Override
	public int compare(NhaDauTuNuocNgoai o1, NhaDauTuNuocNgoai o2) {
		// TODO Auto-generated method stub
		return Long.compare(o1.getKhoiLuongMua(), o2.getKhoiLuongMua());
	}

}
