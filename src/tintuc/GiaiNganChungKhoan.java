package tintuc;

import java.util.ArrayList;
import java.util.List;

public class GiaiNganChungKhoan implements ChungKhoan {
	public static List<String> giaiNgan =new ArrayList<String>();
        
	@Override
	public boolean checkKey(String s) {
		if (s.toLowerCase().contains("giải ngân")) return true;
		else return false;
	}

	@Override
	public boolean checkData(String s) {

		return true;
	}
        
	@Override
	public void addList(String s) {
		if (checkKey(s) && checkData(s)) giaiNgan.add(s);
	}


}
