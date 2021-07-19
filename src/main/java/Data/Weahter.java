package Data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Weahter {

	/*
	public static void main(String[] args) {
		String address="http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=yEHyRBM%2BnMz6F8mx%2B0rc%2F%2B8dOacpD3UioxlwzZbz3TYifm7uFetp0CXhts6jSJ44sZocwYwcyzmkYDMbZ7Vj%2FQ%3D%3D&pageNo=1&numOfRows=10&dataType=XML&CURRENT_DATE=2021071516&HOUR=24&COURSE_ID=1";
		try {
			URL url=new URL(address);
			URLConnection uc=url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			String line;
			while((line=in.readLine())!=null) {
				System.out.println(line);
			}
			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	 */
	
	public String getweatherData() {
		String address="http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=yEHyRBM%2BnMz6F8mx%2B0rc%2F%2B8dOacpD3UioxlwzZbz3TYifm7uFetp0CXhts6jSJ44sZocwYwcyzmkYDMbZ7Vj%2FQ%3D%3D&pageNo=1&numOfRows=10&dataType=XML&CURRENT_DATE=2021071516&HOUR=24&COURSE_ID=1";
		String data="";
		try {
			URL url=new URL(address);
			URLConnection uc=url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			String line;
			while((line=in.readLine())!=null) {
				data+=line;
			}
			in.close();
			return data;
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
			return data;
	}
}
