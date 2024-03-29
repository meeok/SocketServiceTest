package com.newgen.util;

public interface Constants {

    String empty = "";
    //Service Names
    String TOKEN_VALIDATION = "TOKENVALIDATION";
    String REMOVE_LIEN = "REMOVELIEN";
    String CP_POSTING ="postRequestToFinacleCp";
    String FETCH_LIEN = "FETCHLIEN";
    String CURRENT_ACCOUNT = "CURRENTACCOUNT";
    String SAVINGS_ACCOUNT = "SAVINGACCOUNT";
    String SPECIAL_ACCOUNT = "SPECIALACCOUNT";
    String SEARCH_TRANSACTION = "CISEARCHTRANSACTION";
    String SEARCH_TRANSACTION1 = "SEARCHTRANSACTIONFI";
    String STAFF_LIMIT = "CIGETUSERLIMIT";
    String BVN_REQUEST = "BVNREQUEST";
    String POSTING = "postRequestToFinacle";
    String DC_STAFF_DETAILS = "FetchStaffDetails";
    String IRAW_POSTING = "postIrawRequestToFinacle";
    String IRAW_OFFICE_ACCOUNT_DETAILS = "fetchIrawOfficeAcctDetails";
    String IRAW_PROD_OFFICE_ACCT_SERVICE_NAME = "fetchIrawAccountDetails";
    String IRAW_STAFF_DETAILS = "fetchIrawstaffDetails";
    String LMT_ENHANCEMENT_STAFF_DETAILS_1 ="Fetch_limit_Enh_Details_INITIATORID";
    String LMT_ENHANCEMENT_STAFF_DETAILS_2 ="Fetch_limit_Enh_Details_VERIFIERID";
    String LMT_ENHANCEMENT_STAFF_DETAILS_3 ="Fetch_limit_Enh_Details_verifier2ID";
    String MEMO_STAFF_DETAILS = "FetchMemoStaffDetails";
    String TEMP_STAFF_DETAILS = "fetchSEStaffDetails";
    String AVR_SEARCH = "AVRSearch";
    String UPDATE_REMOVE_FINACLE_FLAG ="UpdateOrRemoveFinacleFlg";
    String VERIFY_CUSTOMER = "VerifyCustomerRequest";
    String UPDATE_RETAIL_RISK_SCORE = "UpdateRetailCustRiskScore";
    String UPDATE_CORP_RISK_SCORE = "UpdateCorpCustRiskScore";
    String PLACE_LIEN = "placeLien";
    String CI_STAFF_DETAILS = "FetchCIStaffDetails";
    String FREEZE_ACCOUNT = "FREEZEACCOUNT";
    String STAFF_DETAILS= "STAFFDETAILS";
    String LEGACY_ACCOUNT= "LEGACYACCOUNT";
    String FREEZE_UNFREEZE_ACCT = "FREEZEANDUNFREEZEACCT";
    String FETCH_CUST_DTLS_RETAIL="FETCHCUSTDTLRETAIL";
    String FETCH_BVN="FETCHBVN";
    String FETCH_ACCOUNT_BALANCE_DETAILS = "FETCHACCOUNTBALDETAILS";
    String SYSTEM_ONLY_FLAG = "SYSTEMONLYFLAG";

    //AppCode
    String FINACLE_POSTING_APPCODE = "FINACLE_POST";
    String REMOVE_LIEN_APPCODE = "FINACLE_REMOVE_LIEN";
    String FETCH_LIEN_APPCODE = "FINACLE_FETCH_LIEN";
    String CURRENT_ACCT_APPCODE = "FINACLE_ODA_ACCOUNT";
    String SAVINGS_ACCT_APPCODE = "FINACLE_SBA_ACCOUNT";
    String SPECIAL_ACCT_APPCODE = "FINACLE_CAA_ACCOUNT";
    String FINACLE_TRANSACTION_SEARCH_APPCODE = "FINACLE_SEARCH_TRANS";
    String FINACLE_TRANSACTION_SEARCH2_APPCODE = "FINACLE_SEARCH_TRANS2";
    String STAFF_LIMIT_APPCODE = "FINACLE_STAFF_LIMIT";
    String UPDATE_REMOVE_FINACLE_FLAG_APPCODE = "FINACLE_UPDATE_FINACLE_FLAG";
    String VERIFY_CUST_APPCODE = "FINACLE_VERIFY_CUST";
    String UPDATE_RETAIL_RISK_SCORE_APPCODE = "FINACLE_RETAIL_RISK_SCORE";
    String UPDATE_CORP_RISK_SCORE_APPCODE = "FINACLE_UPDATE_CORP_RISK_SCORE";
    String PLACE_LIEN_APPCODE = "FINACLE_PLACE_LIEN";
    String FREEZE_ACCOUNT_APPCODE = "FINACLE_FREEZE_ACCOUNT";
    String FREEZE_UNFREEZE_ACCT_APPCODE = "FINACLE_FREEZE_UNFREEZE_ACCT";
    String CUSTOMER_DTL_RETAIL_APPCODE ="FINACLE_FETCH_CUST_DETAILS_RETAIL";
    String ACCOUNT_BALANCE_DETAILS_APPCODE = "FINACLE_ACCOUNT_BALANCE_DETAILS";
    String SYSTEMONLYFLG_APPCODE ="FINACLE_SYSTEM_ONLY_FLAG";

    //EndpointUrl
    String FINACLEPREPRODBPMURL = "FINACLEPREPRODBPMURL";
    String FINACLEPREPRODFIURL = "FINACLEPREPRODCUSTOMFIURL";
    String FINACLETESTBPMURL = "FINACLETESTBPMURL";
    String FINACLETESTFIURL = "FINACLETESTCUSTOMFIURL";
    String FETCHSTAFFDETAILSURL="STAFFDETAILSURL";
    String FETCHINTERNALACCOUNTURL="INTERNALACCOUNTURL";
    String FETCHNONCORESTAFFDETIALSURL="NONCORESTAFFDETAILSURL";
    String AVRSEARCHURL="AVRSEARCHURL";
    String TOKENAUTHENTICATIONURL="TOKENAUTHENTICATIONURL";
    String ACCOUNTBVNURL = "ACCOUNTBVNURL";
    String LEGACYACCOUNTURL= "LEGACYACCOUNTURL";
    String FETCHBVNURL="FETCHBVNURL";

    //Soap Action
    String TOKENATHENTICATIONACTION = "TOKENVALIDATIONACTION";
    String BVNACTION = "BVNACTION";
    String LEGACYACCOUNTACTION= "LEGACYACCOUNTACTION";
    String INTERNALACCOUNTACTION = "INTERNALACCOUNTACTION";
    String FETCHBVNACTION="FETCHBVNACTION";

    //Config
    String CONFIG_FILE = "config.properties";
}
