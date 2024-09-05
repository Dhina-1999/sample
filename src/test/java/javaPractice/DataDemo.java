package javaPractice;
import java.util.*;
import java.text.SimpleDateFormat;

public class DataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dt = new Date();
		System.out.println(dt);
		//formatdate1
		
		
	}
	public void formatedate1() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(df.format(null));
	}
}
