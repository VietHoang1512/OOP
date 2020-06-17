package tintuc;

import java.util.ArrayList;
import java.util.List;

public class SanGiaoDichChungKhoan implements ChungKhoan {
	public static List<String> sanGiaoDich = new ArrayList<String>();

	@Override
	public boolean checkKey(String s) {
		if (s.toLowerCase().contains("sàn giao dịch"))
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
			sanGiaoDich.add(s);
	}
}