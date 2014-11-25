/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infobase.cordova;

import com.splunk.mint.Mint;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONException;

/**
 *
 * @author Leonardo
 */
public class MintPlugin extends CordovaPlugin {

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException {
        if ("initAndStartSession".equals(action)) {
            try {
                Mint.initAndStartSession(cordova.getActivity(), args.getString(0));
                callbackContext.success();
                return true;
            } catch (Exception e) {
                callbackContext.success(e.getMessage());
                return false;
            }

        }
        return false;
    }

}
