package tintuc;

import java.util.ArrayList;
import java.util.List;

public class NhaDauTuChungKhoan implements ChungKhoan {
	public static List<String> nhaDauTu =new ArrayList<String>();
        
	@Override
	public boolean checkKey(String s) {
		if (s.toLowerCase().contains("nhà đầu tư")) return true;
		else return false;
	}

	@Override
	public boolean checkData(String s) {

		return true;
	}
        
	@Override
	public void addList(String s) {
		if (checkKey(s) && checkData(s)) nhaDauTu.add(s);
	}
}
