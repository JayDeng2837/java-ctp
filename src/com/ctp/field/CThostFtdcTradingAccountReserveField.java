/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcTradingAccountReserveField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcTradingAccountReserveField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcTradingAccountReserveField obj)
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
				ctpJNI.delete_CThostFtdcTradingAccountReserveField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcTradingAccountReserveField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcTradingAccountReserveField_BrokerID_get(swigCPtr, this);
	}

	public void setAccountID(String value)
	{
		ctpJNI.CThostFtdcTradingAccountReserveField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID()
	{
		return ctpJNI.CThostFtdcTradingAccountReserveField_AccountID_get(swigCPtr, this);
	}

	public void setReserve(double value)
	{
		ctpJNI.CThostFtdcTradingAccountReserveField_Reserve_set(swigCPtr, this, value);
	}

	public double getReserve()
	{
		return ctpJNI.CThostFtdcTradingAccountReserveField_Reserve_get(swigCPtr, this);
	}

	public void setCurrencyID(String value)
	{
		ctpJNI.CThostFtdcTradingAccountReserveField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID()
	{
		return ctpJNI.CThostFtdcTradingAccountReserveField_CurrencyID_get(swigCPtr, this);
	}

	public CThostFtdcTradingAccountReserveField()
	{
		this(ctpJNI.new_CThostFtdcTradingAccountReserveField(), true);
	}
}
