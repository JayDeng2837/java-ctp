package com.jctp;

import com.ctp.MdApi;

public class MdApiTest {

	public static void main(String[] args) throws Throwable {
		MdApi mdApi = MdApi.CreateFtdcMdApi("tcp://180.168.146.187:10010");
		System.out.println(MdApi.GetApiVersion());
		mdApi.Init();
		System.out.println(mdApi.GetTradingDay());
		
	}
}
