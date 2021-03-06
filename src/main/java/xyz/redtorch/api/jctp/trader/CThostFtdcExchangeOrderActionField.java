/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcExchangeOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcExchangeOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_OrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_BranchID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOrderActionField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcExchangeOrderActionField(), true);
  }

}
