/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcQrySuperUserFunctionField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQrySuperUserFunctionField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQrySuperUserFunctionField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcQrySuperUserFunctionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcQrySuperUserFunctionField_UserID_set(swigCPtr, this,
				value);
	}

	public String getUserID() {
		return CtpJNI.CThostFtdcQrySuperUserFunctionField_UserID_get(swigCPtr,
				this);
	}

	public CThostFtdcQrySuperUserFunctionField() {
		this(CtpJNI.new_CThostFtdcQrySuperUserFunctionField(), true);
	}

}