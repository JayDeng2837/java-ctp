/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcBrokerUserOTPParamField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcBrokerUserOTPParamField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcBrokerUserOTPParamField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcBrokerUserOTPParamField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcBrokerUserOTPParamField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcBrokerUserOTPParamField_BrokerID_get(swigCPtr,
				this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcBrokerUserOTPParamField_UserID_set(swigCPtr, this,
				value);
	}

	public String getUserID() {
		return CtpJNI.CThostFtdcBrokerUserOTPParamField_UserID_get(swigCPtr,
				this);
	}

	public void setOTPVendorsID(String value) {
		CtpJNI.CThostFtdcBrokerUserOTPParamField_OTPVendorsID_set(swigCPtr,
				this, value);
	}

	public String getOTPVendorsID() {
		return CtpJNI.CThostFtdcBrokerUserOTPParamField_OTPVendorsID_get(
				swigCPtr, this);
	}

	public void setSerialNumber(String value) {
		CtpJNI.CThostFtdcBrokerUserOTPParamField_SerialNumber_set(swigCPtr,
				this, value);
	}

	public String getSerialNumber() {
		return CtpJNI.CThostFtdcBrokerUserOTPParamField_SerialNumber_get(
				swigCPtr, this);
	}

	public void setAuthKey(String value) {
		CtpJNI.CThostFtdcBrokerUserOTPParamField_AuthKey_set(swigCPtr, this,
				value);
	}

	public String getAuthKey() {
		return CtpJNI.CThostFtdcBrokerUserOTPParamField_AuthKey_get(swigCPtr,
				this);
	}

	public void setLastDrift(int value) {
		CtpJNI.CThostFtdcBrokerUserOTPParamField_LastDrift_set(swigCPtr, this,
				value);
	}

	public int getLastDrift() {
		return CtpJNI.CThostFtdcBrokerUserOTPParamField_LastDrift_get(swigCPtr,
				this);
	}

	public void setLastSuccess(int value) {
		CtpJNI.CThostFtdcBrokerUserOTPParamField_LastSuccess_set(swigCPtr,
				this, value);
	}

	public int getLastSuccess() {
		return CtpJNI.CThostFtdcBrokerUserOTPParamField_LastSuccess_get(
				swigCPtr, this);
	}

	public void setOTPType(char value) {
		CtpJNI.CThostFtdcBrokerUserOTPParamField_OTPType_set(swigCPtr, this,
				value);
	}

	public char getOTPType() {
		return CtpJNI.CThostFtdcBrokerUserOTPParamField_OTPType_get(swigCPtr,
				this);
	}

	public CThostFtdcBrokerUserOTPParamField() {
		this(CtpJNI.new_CThostFtdcBrokerUserOTPParamField(), true);
	}

}