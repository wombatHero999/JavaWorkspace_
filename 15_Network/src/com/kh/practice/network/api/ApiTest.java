package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiTest {
	
	public static void main(String[] args) {
		try {
			//0) 홈페이지에서 요청주소, 요청변수 확인후 필수값에 해당하는 변수 초기화
			String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";
			String serviceKey = "o%2FmfuKVSlG%2Fs3V9BUqGWcBSjDPWCOL7XAuWO132ZOxEy9zVOHZQhX7db4rk3dNQaOSYeEnQBf9cIsWsijCYwvA%3D%3D";
			String stationName = URLEncoder.encode("종로구","UTF-8");
			String dataTerm = "DAILY"; 
			
			serviceUrl += "?serviceKey="+serviceKey
			           + "&stationName="+ stationName
			           + "&dataTerm="+dataTerm;
			
			URL url = new URL(serviceUrl);
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader
					(url.openConnection().getInputStream()))){
				String line = null;
				while( (line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
