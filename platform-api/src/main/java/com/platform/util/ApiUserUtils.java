package com.platform.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * 作者: @author Harmon <br>
 * 时间: 2017-08-11 08:58<br>
 * 描述: ApiUserUtils <br>
 */
@Component
public class ApiUserUtils {


    private static String code;

    private static String webAccessTokenhttps;

    private static String appId;

    private static String secret;

    private static String userMessage;

    private static String accessToken;

    private static String wXACodeUnlimit;

    //替换字符串
    public static String getCode(String APPID, String REDIRECT_URI, String SCOPE) {
        return String.format(code, APPID, REDIRECT_URI, SCOPE);
    }

    //替换字符串
    public static String getWebAccess(String CODE) {
        return String.format(webAccessTokenhttps,appId,secret,CODE);
    }

    //替换字符串
    public static String getUserMessage(String access_token, String openid) {
        return String.format(userMessage, access_token, openid);
    }


    //替换字符串
    public static String getAccessToken() {
        return String.format(accessToken,appId,secret);
    }


    public static String getWXACodeUnlimit(String accessToken, String scene) {
        return String.format(wXACodeUnlimit, accessToken, scene);
    }

    @Value("${wx.code}")
    public  void setCode(String code) {
        ApiUserUtils.code = code;
    }

    @Value("${wx.webAccessTokenhttps}")
    public  void setWebAccessTokenhttps(String webAccessTokenhttps) {
        ApiUserUtils.webAccessTokenhttps = webAccessTokenhttps;
    }

    @Value("${wx.appId}")
    public  void setAppId(String appId) {
        ApiUserUtils.appId = appId;
    }

    @Value("${wx.secret}")
    public  void setSecret(String secret) {
        ApiUserUtils.secret = secret;
    }

    @Value("${wx.userMessage}")
    public  void setUserMessage(String userMessage) {
        ApiUserUtils.userMessage = userMessage;
    }

    @Value("${wx.accessToken}")
    public  void setAccessToken(String accessToken) {
        ApiUserUtils.accessToken = accessToken;
    }

    @Value("${wx.wXACodeUnlimit}")
    public  void setwXACodeUnlimit(String wXACodeUnlimit) {
        ApiUserUtils.wXACodeUnlimit = wXACodeUnlimit;
    }
}
