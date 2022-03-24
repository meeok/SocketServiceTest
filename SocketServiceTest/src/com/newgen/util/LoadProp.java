package com.newgen.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProp implements Constants {

    public static String finaclePreProdBpmUrl;
    public static String finaclePreProdFiUrl;
    public static String finacleTestBpmUrl;
    public static String finacleTestFiUrl;
    public static String fetchStaffDetailsUrl;
    public static String fetchInternalAccountUrl;
    public static String fetchNonCorStaffDetailsUrl;
    public static String avrSearchUrl;
    public static String tokenAuthenticationUrl;
    public static String fetchAccountBvnUrl;
    public static String fetchLegacyAccountUrl;
    public static String fetchBvnUrl;

    public static String postAppCode;
    public static String removeLienAppCode;
    public static String fetchLienAppCode;
    public static String fetchOdaAcctAppCode;
    public static String fetchSbaAcctAppCode;
    public static String fetchCaaAcctAppCode;
    public static String searchTransactionAppCode;
    public static String searchTransaction2AppCode;
    public static String fetchStaffTransactionLimitAppCode;
    public static String updateRemoveFinacleFlagAppCode;
    public static String verifyCustomerAppCode;
    public static String updateRetailRiskScoreAppCode;
    public static String updateCorpRiskScoreAppCode;
    public static String placeLienAppCode;
    public static String freezeAccountAppCode;
    public static String freezeUnfreezeAcctAppCode;
    public static String fetchCustomerDetailsRetailAppCode;
    public static String fetchAccountBalanceAppcode;
    public static String fetchSysOnlyFlgAppcode;
    


    public static String tokenAuthenticationAction;
    public static String bvnAction;
    public static String fetchLegacyAccountAction;
    public static String fetchInternalAccountAction;
    public static String fetchBvnAction;
    static {
        try {
            Properties properties = new Properties();
            InputStream in = new FileInputStream(CONFIG_FILE);
            properties.load(in);

            //EndPoints
            finaclePreProdBpmUrl = properties.getProperty(FINACLEPREPRODBPMURL);
            finaclePreProdFiUrl = properties.getProperty(FINACLEPREPRODFIURL);
            finacleTestBpmUrl = properties.getProperty(FINACLETESTBPMURL);
            finacleTestFiUrl = properties.getProperty(FINACLETESTFIURL);
            fetchStaffDetailsUrl= properties.getProperty(FETCHSTAFFDETAILSURL);
            fetchInternalAccountUrl= properties.getProperty(FETCHINTERNALACCOUNTURL);
            fetchNonCorStaffDetailsUrl= properties.getProperty(FETCHNONCORESTAFFDETIALSURL);
            avrSearchUrl= properties.getProperty(AVRSEARCHURL);
            tokenAuthenticationUrl= properties.getProperty(TOKENAUTHENTICATIONURL);
            fetchAccountBvnUrl= properties.getProperty(ACCOUNTBVNURL);
            fetchLegacyAccountUrl= properties.getProperty(LEGACYACCOUNTURL);
            fetchBvnUrl= properties.getProperty(FETCHBVNURL);

            //AppCode
            postAppCode = properties.getProperty(FINACLE_POSTING_APPCODE);
            removeLienAppCode = properties.getProperty(REMOVE_LIEN_APPCODE);
            fetchLienAppCode = properties.getProperty(FETCH_LIEN_APPCODE);
            fetchOdaAcctAppCode= properties.getProperty(CURRENT_ACCT_APPCODE);
            fetchSbaAcctAppCode = properties.getProperty(SAVINGS_ACCT_APPCODE);
            fetchCaaAcctAppCode= properties.getProperty(SPECIAL_ACCT_APPCODE);
            searchTransactionAppCode= properties.getProperty(FINACLE_TRANSACTION_SEARCH_APPCODE);
            searchTransaction2AppCode= properties.getProperty(FINACLE_TRANSACTION_SEARCH2_APPCODE);
            fetchStaffTransactionLimitAppCode= properties.getProperty(STAFF_LIMIT_APPCODE);
            updateRemoveFinacleFlagAppCode= properties.getProperty(UPDATE_REMOVE_FINACLE_FLAG_APPCODE);
            verifyCustomerAppCode= properties.getProperty(VERIFY_CUST_APPCODE);
            updateRetailRiskScoreAppCode = properties.getProperty(UPDATE_RETAIL_RISK_SCORE_APPCODE);
            updateCorpRiskScoreAppCode = properties.getProperty(UPDATE_CORP_RISK_SCORE_APPCODE);
            placeLienAppCode = properties.getProperty(PLACE_LIEN_APPCODE);
            freezeAccountAppCode = properties.getProperty(FREEZE_ACCOUNT_APPCODE);
            freezeUnfreezeAcctAppCode = properties.getProperty(FREEZE_UNFREEZE_ACCT_APPCODE);
            fetchCustomerDetailsRetailAppCode= properties.getProperty(CUSTOMER_DTL_RETAIL_APPCODE);
            fetchAccountBalanceAppcode = properties.getProperty(ACCOUNT_BALANCE_DETAILS_APPCODE);
            fetchSysOnlyFlgAppcode = properties.getProperty(SYSTEMONLYFLG_APPCODE);

            //Soap Action
            tokenAuthenticationAction = properties.getProperty(TOKENATHENTICATIONACTION);
            bvnAction = properties.getProperty(BVNACTION);
            fetchLegacyAccountAction= properties.getProperty(LEGACYACCOUNTACTION);
            fetchInternalAccountAction = properties.getProperty(INTERNALACCOUNTACTION);
            fetchBvnAction = properties.getProperty(FETCHBVNACTION);

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
