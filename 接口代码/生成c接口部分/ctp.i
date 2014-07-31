/* File : ctp.i */  
%module ctp  
%{  
#include "ThostFtdcMdApi.h"
%}
%include "ThostFtdcMdApi.h"
%{  
#include "ThostFtdcTraderApi.h"
%}
%include "ThostFtdcTraderApi.h"
%{  
#include "ThostFtdcUserApiDataType.h"
%}
%include "ThostFtdcUserApiDataType.h"
%{  
#include "ThostFtdcUserApiStruct.h"
%}
%include "ThostFtdcUserApiStruct.h"

/* These symbols are NEVER used in original files 
%ignore TThostFtdcVirementTradeCodeType;
%ignore THOST_FTDC_VTC_BankBankToFuture;
%ignore THOST_FTDC_VTC_BankFutureToBank;
%ignore THOST_FTDC_VTC_FutureBankToFuture;
%ignore THOST_FTDC_VTC_FutureFutureToBank;

%ignore TThostFtdcFBTTradeCodeEnumType;
%ignore THOST_FTDC_FTC_BankLaunchBankToBroker;
%ignore THOST_FTDC_FTC_BrokerLaunchBankToBroker;
%ignore THOST_FTDC_FTC_BankLaunchBrokerToBank;
%ignore THOST_FTDC_FTC_BrokerLaunchBrokerToBank;
*/