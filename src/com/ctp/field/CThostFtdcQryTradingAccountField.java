/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcQryTradingAccountField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryTradingAccountField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcQryTradingAccountField obj)
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
				ctpJNI.delete_CThostFtdcQryTradingAccountField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcQryTradingAccountField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcQryTradingAccountField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value)
	{
		ctpJNI.CThostFtdcQryTradingAccountField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID()
	{
		return ctpJNI.CThostFtdcQryTradingAccountField_InvestorID_get(swigCPtr, this);
	}

	public void setCurrencyID(String value)
	{
		ctpJNI.CThostFtdcQryTradingAccountField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID()
	{
		return ctpJNI.CThostFtdcQryTradingAccountField_CurrencyID_get(swigCPtr, this);
	}

	public CThostFtdcQryTradingAccountField()
	{
		this(ctpJNI.new_CThostFtdcQryTradingAccountField(), true);
	}
}
