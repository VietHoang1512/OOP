package tintuc;

import java.util.ArrayList;
import java.util.List;

public class TraiPhieuChungKhoan implements ChungKhoan {
	public static List<String> traiPhieu = new ArrayList<String>();

	@Override
	public boolean checkKey(String s) {
		if (s.toLowerCase().contains("trái phiếu"))
			return true;
		else
			return false;
	}

	@Override
	public boolean checkData(String s) {

		return true;
	}

	@Override
	public void addList(String s) {
		if (checkKey(s) && checkData(s))
			traiPhieu.add(s);
	}
}
