package tintuc;

import java.util.ArrayList;
import java.util.List;

public class PhienChungKhoan implements ChungKhoan {
	public static List<String> phien = new ArrayList<String>();

	@Override
	public boolean checkKey(String s) {
		if (s.toLowerCase().contains("phiên"))
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
			phien.add(s);
	}
}
