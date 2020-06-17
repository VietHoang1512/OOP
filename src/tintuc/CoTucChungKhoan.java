package tintuc;

import java.util.ArrayList;
import java.util.List;

public class CoTucChungKhoan implements ChungKhoan {
	public static List<String> coTuc =new ArrayList<String>();
        
	@Override
	public boolean checkKey(String s) {
		if (s.toLowerCase().contains("cổ tức")) return true;
		else return false;
	}

	@Override
	public boolean checkData(String s) {

		return true;
	}
        
	@Override
	public void addList(String s) {
		if (checkKey(s) && checkData(s)) coTuc.add(s);
	}


}
