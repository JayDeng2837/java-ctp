/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcBrokerUserRightAssignField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcBrokerUserRightAssignField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcBrokerUserRightAssignField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcBrokerUserRightAssignField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcBrokerUserRightAssignField_BrokerID_set(swigCPtr,
				this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcBrokerUserRightAssignField_BrokerID_get(
				swigCPtr, this);
	}

	public void setDRIdentityID(int value) {
		CtpJNI.CThostFtdcBrokerUserRightAssignField_DRIdentityID_set(swigCPtr,
				this, value);
	}

	public int getDRIdentityID() {
		return CtpJNI.CThostFtdcBrokerUserRightAssignField_DRIdentityID_get(
				swigCPtr, this);
	}

	public void setTradeable(int value) {
		CtpJNI.CThostFtdcBrokerUserRightAssignField_Tradeable_set(swigCPtr,
				this, value);
	}

	public int getTradeable() {
		return CtpJNI.CThostFtdcBrokerUserRightAssignField_Tradeable_get(
				swigCPtr, this);
	}

	public CThostFtdcBrokerUserRightAssignField() {
		this(CtpJNI.new_CThostFtdcBrokerUserRightAssignField(), true);
	}

}