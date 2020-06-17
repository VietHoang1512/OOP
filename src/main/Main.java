/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;

import giaodien.MainJFrame;
import tintuc.LayDuLieu;
import tintuc.PhanLoai;

/**
 *
 * @author Tu
 */
public class Main {
	public static void main(String[] args) throws IOException {
//        String [] list={"HNX","HSX","UPCOM"};
//        Random rd = new Random();
		LayDuLieu dl = new LayDuLieu();
		dl.layCau();
		PhanLoai pl = new PhanLoai();
		for (String s : dl.cauChungKhoan) {
			pl.phanLoai(s);
		}

		new MainJFrame().setVisible(true);
	}
}
