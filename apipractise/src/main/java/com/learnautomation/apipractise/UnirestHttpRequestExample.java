package com.learnautomation.apipractise;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestHttpRequestExample {
	
	
	public void getRequestexample() throws UnirestException{
		
		HttpResponse<JsonNode> httpresponse = Unirest.get("http://dummy.restapiexample.com/api/v1/employees").asJson();
		
		System.out.println("Response code: " +httpresponse.getStatus());
		System.out.println("Response message: " +httpresponse.getStatusText());
		System.out.println(httpresponse.getBody());
		
	}
	
	
	public void postResquestExample() throws UnirestException{
		
		HttpResponse<JsonNode> httpresponse = Unirest.post("http://dummy.restapiexample.com/api/v1/create").
		body("{\"name\":\"Karthik\", \"salary\":\"150000\", \"age\":\"2\"}").asJson();
		
		System.out.println("Response code: " +httpresponse.getStatus());
		System.out.println("Response message: " +httpresponse.getStatusText());
		System.out.println(httpresponse.getBody());
		
	}
	
	public void putRequestExample() throws UnirestException{
		
		HttpResponse<JsonNode> httpresponse = Unirest.put("http://dummy.restapiexample.com/api/v1/update/88").
		body("{\"name\":\"Karthik\", \"salary\":\"150000\", \"age\":\"28\"}").asJson();
		
		System.out.println("Response code: " +httpresponse.getStatus());
		System.out.println("Response message: "+httpresponse.getStatusText());
		System.out.println(httpresponse.getBody());
		
		
	}
	
	public void deleteRequestExample() throws UnirestException{
		
		HttpResponse<JsonNode> httpresponse = Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/88").asJson();
				
				System.out.println("Response code: " +httpresponse.getStatus());
				System.out.println("Response message: "+httpresponse.getStatusText());
				System.out.println(httpresponse.getBody());
		
	}

	public static void main(String[] args) throws UnirestException {
		
		UnirestHttpRequestExample example = new UnirestHttpRequestExample();
		//example.getRequestexample();
        //example.postResquestExample();  //id=88
		//example.putRequestExample();
		example.deleteRequestExample();
		
		
	}

}
