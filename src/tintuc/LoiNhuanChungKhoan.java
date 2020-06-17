package tintuc;

import java.util.ArrayList;
import java.util.List;

public class LoiNhuanChungKhoan implements ChungKhoan {
	public static List<String> loiNhuan =new ArrayList<String>();
        
	@Override
	public boolean checkKey(String s) {
		if (s.toLowerCase().contains("lợi nhuận")) return true;
		else return false;
	}

	@Override
	public boolean checkData(String s) {

		return true;
	}
        
	@Override
	public void addList(String s) {
		if (checkKey(s) && checkData(s)) loiNhuan.add(s);
	}
}
