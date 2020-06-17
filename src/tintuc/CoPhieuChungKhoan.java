package tintuc;

import java.util.ArrayList;
import java.util.List;

public class CoPhieuChungKhoan implements ChungKhoan {
	public static List<String> coPhieu =new ArrayList<String>();
        
	@Override
	public boolean checkKey(String s) {
		if (s.toLowerCase().contains("cổ phiếu")) return true;
		else return false;
	}

	@Override
	public boolean checkData(String s) {

		return true;
	}
        
	@Override
	public void addList(String s) {
		if (checkKey(s) && checkData(s)) coPhieu.add(s);
	}


}
