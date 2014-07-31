/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcSyncingInvestorField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcSyncingInvestorField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcSyncingInvestorField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcSyncingInvestorField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcSyncingInvestorField_InvestorID_set(swigCPtr, this,
				value);
	}

	public String getInvestorID() {
		return CtpJNI.CThostFtdcSyncingInvestorField_InvestorID_get(swigCPtr,
				this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcSyncingInvestorField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcSyncingInvestorField_BrokerID_get(swigCPtr,
				this);
	}

	public void setInvestorGroupID(String value) {
		CtpJNI.CThostFtdcSyncingInvestorField_InvestorGroupID_set(swigCPtr,
				this, value);
	}

	public String getInvestorGroupID() {
		return CtpJNI.CThostFtdcSyncingInvestorField_InvestorGroupID_get(
				swigCPtr, this);
	}

	public void setInvestorName(String value) {
		CtpJNI.CThostFtdcSyncingInvestorField_InvestorName_set(swigCPtr, this,
				value);
	}

	public String getInvestorName() {
		return CtpJNI.CThostFtdcSyncingInvestorField_InvestorName_get(swigCPtr,
				this);
	}

	public void setIdentifiedCardType(char value) {
		CtpJNI.CThostFtdcSyncingInvestorField_IdentifiedCardType_set(swigCPtr,
				this, value);
	}

	public char getIdentifiedCardType() {
		return CtpJNI.CThostFtdcSyncingInvestorField_IdentifiedCardType_get(
				swigCPtr, this);
	}

	public void setIdentifiedCardNo(String value) {
		CtpJNI.CThostFtdcSyncingInvestorField_IdentifiedCardNo_set(swigCPtr,
				this, value);
	}

	public String getIdentifiedCardNo() {
		return CtpJNI.CThostFtdcSyncingInvestorField_IdentifiedCardNo_get(
				swigCPtr, this);
	}

	public void setIsActive(int value) {
		CtpJNI.CThostFtdcSyncingInvestorField_IsActive_set(swigCPtr, this,
				value);
	}

	public int getIsActive() {
		return CtpJNI.CThostFtdcSyncingInvestorField_IsActive_get(swigCPtr,
				this);
	}

	public void setTelephone(String value) {
		CtpJNI.CThostFtdcSyncingInvestorField_Telephone_set(swigCPtr, this,
				value);
	}

	public String getTelephone() {
		return CtpJNI.CThostFtdcSyncingInvestorField_Telephone_get(swigCPtr,
				this);
	}

	public void setAddress(String value) {
		CtpJNI.CThostFtdcSyncingInvestorField_Address_set(swigCPtr, this, value);
	}

	public String getAddress() {
		return CtpJNI
				.CThostFtdcSyncingInvestorField_Address_get(swigCPtr, this);
	}

	public void setOpenDate(String value) {
		CtpJNI.CThostFtdcSyncingInvestorField_OpenDate_set(swigCPtr, this,
				value);
	}

	public String getOpenDate() {
		return CtpJNI.CThostFtdcSyncingInvestorField_OpenDate_get(swigCPtr,
				this);
	}

	public void setMobile(String value) {
		CtpJNI.CThostFtdcSyncingInvestorField_Mobile_set(swigCPtr, this, value);
	}

	public String getMobile() {
		return CtpJNI.CThostFtdcSyncingInvestorField_Mobile_get(swigCPtr, this);
	}

	public void setCommModelID(String value) {
		CtpJNI.CThostFtdcSyncingInvestorField_CommModelID_set(swigCPtr, this,
				value);
	}

	public String getCommModelID() {
		return CtpJNI.CThostFtdcSyncingInvestorField_CommModelID_get(swigCPtr,
				this);
	}

	public void setMarginModelID(String value) {
		CtpJNI.CThostFtdcSyncingInvestorField_MarginModelID_set(swigCPtr, this,
				value);
	}

	public String getMarginModelID() {
		return CtpJNI.CThostFtdcSyncingInvestorField_MarginModelID_get(
				swigCPtr, this);
	}

	public CThostFtdcSyncingInvestorField() {
		this(CtpJNI.new_CThostFtdcSyncingInvestorField(), true);
	}

}