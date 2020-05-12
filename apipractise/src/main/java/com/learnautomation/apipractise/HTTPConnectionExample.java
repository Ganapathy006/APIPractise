package com.learnautomation.apipractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.omg.CORBA.PUBLIC_MEMBER;

public class HTTPConnectionExample {
	
	
	public void getMethod() throws IOException{
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/employees");
		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		
		int statuscode = connection.getResponseCode();
		System.out.println("Status code is: " +statuscode);
		
		String responsemessage = connection.getResponseMessage();
		System.out.println("Message is: " +responsemessage);
		
		InputStream inputstream = connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputstream);
		BufferedReader bufferedreader = new BufferedReader(reader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferedreader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
		
	}
	
	public void postMethodExample() throws IOException{
		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonBody = "{\"name\":\"Ganapathy\", \"salary\":\"120000\", \"age\":\"26\"}"; //can't store ""(quotes) within quotes so using'\'
		byte[] inputJson = jsonBody.getBytes(); //we can't post the body directly as jsonbody so converting as bytes using getBytes method
		
		OutputStream outputstream = connection.getOutputStream();
		outputstream.write(inputJson);
		
		int responsecode = connection.getResponseCode();
		System.out.println("Response code is: "+responsecode); //It should print 201 for post request but in this application its showing 200
		
		String responsemessage = connection.getResponseMessage();
		System.out.println("Response message is: "+responsemessage);
		
		InputStream inputstream = connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputstream);
		BufferedReader bufferedreader = new BufferedReader(reader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedreader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
		
				
	}
	
	
	public void putRequestExample() throws IOException{
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/update/77");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("PUT");
		
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonBody = "{\"name\":\"GanapathyA\", \"salary\":\"120000\", \"age\":\"26\"}"; //can't store ""(quotes) within quotes so using'\'
		byte[] inputJson = jsonBody.getBytes(); //we can't post the body directly as jsonbody so converting as bytes using getBytes method
		
		OutputStream outputstream = connection.getOutputStream();
		outputstream.write(inputJson);
		
		int responsecode = connection.getResponseCode();
		System.out.println("Response code is: "+responsecode); //It should print 201 for post request but in this application its showing 200
		
		String responsemessage = connection.getResponseMessage();
		System.out.println("Response message is: "+responsemessage);
		
		InputStream inputstream = connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputstream);
		BufferedReader bufferedreader = new BufferedReader(reader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedreader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
		
	}
	
	public void deleteRequestExample() throws IOException{
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/delete/74");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("DELETE");
		
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		
		int responsecode = connection.getResponseCode();
		System.out.println("Response code is: "+responsecode); //It should print 201 for post request but in this application its showing 200
		
		String responsemessage = connection.getResponseMessage();
		System.out.println("Response message is: "+responsemessage);
		
		InputStream inputstream = connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputstream);
		BufferedReader bufferedreader = new BufferedReader(reader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedreader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
		
	
		
		
	}
	
	public static void main(String args[]) throws IOException{
		
		HTTPConnectionExample example = new HTTPConnectionExample();
		//example.getMethod();
		//example.postMethodExample();
		//example.putRequestExample();
		//example.deleteRequestExample();
		
	}

}
