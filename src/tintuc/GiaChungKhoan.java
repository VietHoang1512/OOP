package tintuc;

import java.util.ArrayList;
import java.util.List;

public class GiaChungKhoan implements ChungKhoan {
	public static List<String> gia =new ArrayList<String>();
        
	@Override
	public boolean checkKey(String s) {
		if (s.toLowerCase().contains("giá")) return true;
		else return false;
	}

	@Override
	public boolean checkData(String s) {

		return true;
	}
        
	@Override
	public void addList(String s) {
		if (checkKey(s) && checkData(s)) gia.add(s);
	}

}
