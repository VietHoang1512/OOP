package tintuc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class LayDuLieu {
	public List<String> cauChungKhoan =new ArrayList<String>();
	public void layCau() throws IOException {
	String link1="https://vnexpress.net/kinh-doanh/chung-khoan";
        String rawLink="https://vietnambiz.vn/chung-khoan";
	String link;
        
            for(int i=1;i<=99;i++) {
	    	Document docPage = Jsoup.connect(link1+"-p"+i).timeout(20000).get();  
	    	Elements elementPage = docPage.select(".description a[data-medium]");
	    	for(int j=0;j<elementPage.size();j++) {
	    		cauChungKhoan.add(elementPage.get(j).ownText());
	    	}
            }
        
            for(int i=1;i<=99;i++) {
		if(i==1) {
                    link = rawLink+".htm";
		}
		else {
                    link = rawLink+"/trang-"+i+".htm";
		}
		Document docPage = Jsoup.connect(link).timeout(20000).get();  
	    	Elements elementPage = docPage.select(".sapo");
	    	for(int j=0;j<elementPage.size();j++) {
	    		cauChungKhoan.add(elementPage.get(j).ownText());
	    	}
            }
	}
}
