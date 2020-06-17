package tintuc;

import tintuc.ChungKhoan;
import java.util.ArrayList;
import java.util.List;

public class ChiSoChungKhoan implements ChungKhoan {
	public static List<String> chiSo =new ArrayList<String>();
        
	@Override
	public boolean checkKey(String s) {
		if (s.toLowerCase().contains("chỉ số")) return true;
		else return false;
	}

	@Override
	public boolean checkData(String s) {

		return true;
	}
        
	@Override
	public void addList(String s) {
		if (checkKey(s) && checkData(s)) chiSo.add(s);
	}


}
