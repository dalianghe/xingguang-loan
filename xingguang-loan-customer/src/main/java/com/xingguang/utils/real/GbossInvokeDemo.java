package com.xingguang.utils.real;

import org.apache.http.HttpStatus;
import org.apache.log4j.Logger;

import cn.id5.gboss.GbossClient;
import cn.id5.gboss.GbossConfig;
import cn.id5.gboss.http.HttpResponseData;

/**
 * @author pony
 * @date 2017年5月31日
 */
public class GbossInvokeDemo {

	private static final Logger logger = Logger.getLogger(GbossInvokeDemo.class);
	
	
	/**
	 * @return
	 */
	private static GbossConfig getConfig() {
		
		GbossConfig config = new GbossConfig();
		config.setEndpoint("https://gbossapp.id5.cn/services/QueryValidatorServices?wsdl");
		
		config.setDesKey("12345678");
		config.setEncrypted(false);
		
		
		//分配帐号
		config.setAccount("###############");
		
		//分配密码
		config.setAccountpwd("###############");
		config.setDesCharset("GB18030");
		config.setTimeout(15000);
		return config;
		
	}
	
	//初始化一次
	protected static GbossClient client = new GbossClient(getConfig());

	
	public static void main(String[] args) {
	
		try {
			String product = "5R010101";
			
			String param = "";
			
			HttpResponseData httpdata = client.invokeSingle(product, param);
			logger.info("gboss 调用耗时  = " + httpdata.getTime());
			
			logger.info("gboss data = " + httpdata.getData());
			
			if(httpdata.getStatus()==HttpStatus.SC_OK){
				
			}
			
		} catch (Exception e) {
			logger.error("",e);
		}
		
		
	}


	
}
