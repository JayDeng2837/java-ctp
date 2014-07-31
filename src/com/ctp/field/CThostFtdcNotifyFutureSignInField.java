/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcNotifyFutureSignInField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcNotifyFutureSignInField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcNotifyFutureSignInField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcNotifyFutureSignInField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_TradeCode_set(swigCPtr, this,
				value);
	}

	public String getTradeCode() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_TradeCode_get(swigCPtr,
				this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_BankID_set(swigCPtr, this,
				value);
	}

	public String getBankID() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_BankID_get(swigCPtr,
				this);
	}

	public void setBankBranchID(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_BankBranchID_set(swigCPtr,
				this, value);
	}

	public String getBankBranchID() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_BankBranchID_get(
				swigCPtr, this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_BrokerID_get(swigCPtr,
				this);
	}

	public void setBrokerBranchID(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_BrokerBranchID_set(swigCPtr,
				this, value);
	}

	public String getBrokerBranchID() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_BrokerBranchID_get(
				swigCPtr, this);
	}

	public void setTradeDate(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_TradeDate_set(swigCPtr, this,
				value);
	}

	public String getTradeDate() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_TradeDate_get(swigCPtr,
				this);
	}

	public void setTradeTime(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_TradeTime_set(swigCPtr, this,
				value);
	}

	public String getTradeTime() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_TradeTime_get(swigCPtr,
				this);
	}

	public void setBankSerial(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_BankSerial_set(swigCPtr, this,
				value);
	}

	public String getBankSerial() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_BankSerial_get(
				swigCPtr, this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_TradingDay_set(swigCPtr, this,
				value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_TradingDay_get(
				swigCPtr, this);
	}

	public void setPlateSerial(int value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_PlateSerial_set(swigCPtr,
				this, value);
	}

	public int getPlateSerial() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_PlateSerial_get(
				swigCPtr, this);
	}

	public void setLastFragment(char value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_LastFragment_set(swigCPtr,
				this, value);
	}

	public char getLastFragment() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_LastFragment_get(
				swigCPtr, this);
	}

	public void setSessionID(int value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_SessionID_set(swigCPtr, this,
				value);
	}

	public int getSessionID() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_SessionID_get(swigCPtr,
				this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_InstallID_set(swigCPtr, this,
				value);
	}

	public int getInstallID() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_InstallID_get(swigCPtr,
				this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_UserID_set(swigCPtr, this,
				value);
	}

	public String getUserID() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_UserID_get(swigCPtr,
				this);
	}

	public void setDigest(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_Digest_set(swigCPtr, this,
				value);
	}

	public String getDigest() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_Digest_get(swigCPtr,
				this);
	}

	public void setCurrencyID(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_CurrencyID_set(swigCPtr, this,
				value);
	}

	public String getCurrencyID() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_CurrencyID_get(
				swigCPtr, this);
	}

	public void setDeviceID(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_DeviceID_set(swigCPtr, this,
				value);
	}

	public String getDeviceID() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_DeviceID_get(swigCPtr,
				this);
	}

	public void setBrokerIDByBank(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_BrokerIDByBank_set(swigCPtr,
				this, value);
	}

	public String getBrokerIDByBank() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_BrokerIDByBank_get(
				swigCPtr, this);
	}

	public void setOperNo(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_OperNo_set(swigCPtr, this,
				value);
	}

	public String getOperNo() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_OperNo_get(swigCPtr,
				this);
	}

	public void setRequestID(int value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_RequestID_set(swigCPtr, this,
				value);
	}

	public int getRequestID() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_RequestID_get(swigCPtr,
				this);
	}

	public void setTID(int value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_TID_set(swigCPtr, this, value);
	}

	public int getTID() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_TID_get(swigCPtr, this);
	}

	public void setErrorID(int value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_ErrorID_set(swigCPtr, this,
				value);
	}

	public int getErrorID() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_ErrorID_get(swigCPtr,
				this);
	}

	public void setErrorMsg(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_ErrorMsg_set(swigCPtr, this,
				value);
	}

	public String getErrorMsg() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_ErrorMsg_get(swigCPtr,
				this);
	}

	public void setPinKey(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_PinKey_set(swigCPtr, this,
				value);
	}

	public String getPinKey() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_PinKey_get(swigCPtr,
				this);
	}

	public void setMacKey(String value) {
		CtpJNI.CThostFtdcNotifyFutureSignInField_MacKey_set(swigCPtr, this,
				value);
	}

	public String getMacKey() {
		return CtpJNI.CThostFtdcNotifyFutureSignInField_MacKey_get(swigCPtr,
				this);
	}

	public CThostFtdcNotifyFutureSignInField() {
		this(CtpJNI.new_CThostFtdcNotifyFutureSignInField(), true);
	}

}