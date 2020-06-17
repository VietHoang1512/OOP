package tintuc;

import java.util.ArrayList;
import java.util.List;

public class CoDongChungKhoan implements ChungKhoan {
	public static List<String> coDong =new ArrayList<String>();
        
	@Override
	public boolean checkKey(String s) {
		if (s.toLowerCase().contains("cổ đông")) return true;
		else return false;
	}

	@Override
	public boolean checkData(String s) {

		return true;
	}
        
	@Override
	public void addList(String s) {
		if (checkKey(s) && checkData(s)) coDong.add(s);
	}


}
