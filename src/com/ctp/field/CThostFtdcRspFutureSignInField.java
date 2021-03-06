/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcRspFutureSignInField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcRspFutureSignInField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcRspFutureSignInField obj)
	{
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize()
	{
		delete();
	}

	public synchronized void delete()
	{
		if (swigCPtr != 0)
		{
			if (swigCMemOwn)
			{
				swigCMemOwn = false;
				ctpJNI.delete_CThostFtdcRspFutureSignInField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_TradeCode_set(swigCPtr, this, value);
	}

	public String getTradeCode()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_TradeCode_get(swigCPtr, this);
	}

	public void setBankID(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_BankBranchID_set(swigCPtr, this, value);
	}

	public String getBankBranchID()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_BankBranchID_get(swigCPtr, this);
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_BrokerID_get(swigCPtr, this);
	}

	public void setBrokerBranchID(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_BrokerBranchID_set(swigCPtr, this, value);
	}

	public String getBrokerBranchID()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_BrokerBranchID_get(swigCPtr, this);
	}

	public void setTradeDate(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_TradeDate_set(swigCPtr, this, value);
	}

	public String getTradeDate()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_TradeDate_get(swigCPtr, this);
	}

	public void setTradeTime(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_TradeTime_set(swigCPtr, this, value);
	}

	public String getTradeTime()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_TradeTime_get(swigCPtr, this);
	}

	public void setBankSerial(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_BankSerial_set(swigCPtr, this, value);
	}

	public String getBankSerial()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_BankSerial_get(swigCPtr, this);
	}

	public void setTradingDay(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_TradingDay_get(swigCPtr, this);
	}

	public void setPlateSerial(int value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_PlateSerial_set(swigCPtr, this, value);
	}

	public int getPlateSerial()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_PlateSerial_get(swigCPtr, this);
	}

	public void setLastFragment(char value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_LastFragment_set(swigCPtr, this, value);
	}

	public char getLastFragment()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_LastFragment_get(swigCPtr, this);
	}

	public void setSessionID(int value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_SessionID_get(swigCPtr, this);
	}

	public void setInstallID(int value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_InstallID_get(swigCPtr, this);
	}

	public void setUserID(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_UserID_get(swigCPtr, this);
	}

	public void setDigest(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_Digest_get(swigCPtr, this);
	}

	public void setCurrencyID(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_CurrencyID_get(swigCPtr, this);
	}

	public void setDeviceID(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_DeviceID_set(swigCPtr, this, value);
	}

	public String getDeviceID()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_DeviceID_get(swigCPtr, this);
	}

	public void setBrokerIDByBank(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_BrokerIDByBank_set(swigCPtr, this, value);
	}

	public String getBrokerIDByBank()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_BrokerIDByBank_get(swigCPtr, this);
	}

	public void setOperNo(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_OperNo_set(swigCPtr, this, value);
	}

	public String getOperNo()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_OperNo_get(swigCPtr, this);
	}

	public void setRequestID(int value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_RequestID_get(swigCPtr, this);
	}

	public void setTID(int value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_TID_set(swigCPtr, this, value);
	}

	public int getTID()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_TID_get(swigCPtr, this);
	}

	public void setErrorID(int value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_ErrorID_set(swigCPtr, this, value);
	}

	public int getErrorID()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_ErrorID_get(swigCPtr, this);
	}

	public void setErrorMsg(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_ErrorMsg_set(swigCPtr, this, value);
	}

	public String getErrorMsg()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_ErrorMsg_get(swigCPtr, this);
	}

	public void setPinKey(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_PinKey_set(swigCPtr, this, value);
	}

	public String getPinKey()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_PinKey_get(swigCPtr, this);
	}

	public void setMacKey(String value)
	{
		ctpJNI.CThostFtdcRspFutureSignInField_MacKey_set(swigCPtr, this, value);
	}

	public String getMacKey()
	{
		return ctpJNI.CThostFtdcRspFutureSignInField_MacKey_get(swigCPtr, this);
	}

	public CThostFtdcRspFutureSignInField()
	{
		this(ctpJNI.new_CThostFtdcRspFutureSignInField(), true);
	}
}
