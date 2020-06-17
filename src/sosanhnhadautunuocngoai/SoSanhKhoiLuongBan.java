package sosanhnhadautunuocngoai;
import java.util.Comparator;
import cackieudulieu.NhaDauTuNuocNgoai;

public class SoSanhKhoiLuongBan implements Comparator<NhaDauTuNuocNgoai> {

	@Override
	public int compare(NhaDauTuNuocNgoai arg0, NhaDauTuNuocNgoai arg1) {
		// TODO Auto-generated method stub
		return Long.compare(arg0.getKhoiLuongBan(), arg1.getKhoiLuongBan());
	}
	
}
