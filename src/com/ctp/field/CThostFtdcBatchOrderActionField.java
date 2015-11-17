/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcBatchOrderActionField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcBatchOrderActionField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcBatchOrderActionField obj)
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
				ctpJNI.delete_CThostFtdcBatchOrderActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_InvestorID_get(swigCPtr, this);
	}

	public void setOrderActionRef(int value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_OrderActionRef_set(swigCPtr, this, value);
	}

	public int getOrderActionRef()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_OrderActionRef_get(swigCPtr, this);
	}

	public void setRequestID(int value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_RequestID_get(swigCPtr, this);
	}

	public void setFrontID(int value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_FrontID_get(swigCPtr, this);
	}

	public void setSessionID(int value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_SessionID_get(swigCPtr, this);
	}

	public void setExchangeID(String value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_ExchangeID_get(swigCPtr, this);
	}

	public void setActionDate(String value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_ActionDate_set(swigCPtr, this, value);
	}

	public String getActionDate()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_ActionDate_get(swigCPtr, this);
	}

	public void setActionTime(String value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_ActionTime_set(swigCPtr, this, value);
	}

	public String getActionTime()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_ActionTime_get(swigCPtr, this);
	}

	public void setTraderID(String value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_TraderID_get(swigCPtr, this);
	}

	public void setInstallID(int value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_InstallID_get(swigCPtr, this);
	}

	public void setActionLocalID(String value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_ActionLocalID_set(swigCPtr, this, value);
	}

	public String getActionLocalID()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_ActionLocalID_get(swigCPtr, this);
	}

	public void setParticipantID(String value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_ClientID_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_BusinessUnit_get(swigCPtr, this);
	}

	public void setOrderActionStatus(char value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
	}

	public char getOrderActionStatus()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_OrderActionStatus_get(swigCPtr, this);
	}

	public void setUserID(String value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_UserID_get(swigCPtr, this);
	}

	public void setStatusMsg(String value)
	{
		ctpJNI.CThostFtdcBatchOrderActionField_StatusMsg_set(swigCPtr, this, value);
	}

	public String getStatusMsg()
	{
		return ctpJNI.CThostFtdcBatchOrderActionField_StatusMsg_get(swigCPtr, this);
	}

	public CThostFtdcBatchOrderActionField()
	{
		this(ctpJNI.new_CThostFtdcBatchOrderActionField(), true);
	}
}