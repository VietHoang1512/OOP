package tintuc;

import java.util.Collections;
import java.util.List;

public class PhanLoai {
	ChiSoChungKhoan cs = new ChiSoChungKhoan();
	CoDongChungKhoan cd = new CoDongChungKhoan();
	CoPhieuChungKhoan cp = new CoPhieuChungKhoan();
	CoTucChungKhoan ct = new CoTucChungKhoan();
	GiaChungKhoan g = new GiaChungKhoan();
	GiaiNganChungKhoan gn = new GiaiNganChungKhoan();
	LoiNhuanChungKhoan ln = new LoiNhuanChungKhoan();
	NhaDauTuChungKhoan ndt = new NhaDauTuChungKhoan();
	PhienChungKhoan p = new PhienChungKhoan();
	SanGiaoDichChungKhoan sgd = new SanGiaoDichChungKhoan();
	ThanhKhoanChungKhoan tk = new ThanhKhoanChungKhoan();
	TraiPhieuChungKhoan tp = new TraiPhieuChungKhoan();
        
	public void phanLoai(String s) {
		cs.addList(s);
		cd.addList(s);
		cp.addList(s);
		ct.addList(s);
		g.addList(s);
		gn.addList(s);
		ln.addList(s);
		ndt.addList(s);
		p.addList(s);
		sgd.addList(s);
		tk.addList(s);
		tp.addList(s);
	}
//	public static void inNhom(List<String> p) {
//		Collections.shuffle(p);
//		for (int i =0;(i<5);i++) {
//		try {
////		Collections.shuffle(p);
//		String s = p.get(i);
//		System.out.println(s);
//		}
//		catch(Exception ex)
//		{System.out.println("Rỗng");}
//		}
//	}
}
