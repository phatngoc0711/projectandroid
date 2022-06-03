package com.example.project_android.Common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.example.project_android.Model.Request;
import com.example.project_android.Model.User;
import com.example.project_android.Remote.APIService;
import com.example.project_android.Remote.RetrofitClient;

public class Common {
    public static User currentUser;
    public static final String  DELETE = "Delete";
    public static final String  USER_KEY = "User";
    public static final String  PWD_KEY = "Password";
    public static Request currentRequest;
    public static final String BASE_URL = "https://fcm.googleapis.com/";

    public static boolean isConnectedToInternet(Context context)
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null)
        {
            NetworkInfo[] info = connectivityManager.getAllNetworkInfo();
            if (info != null )
            {
                for (int i =0; i<info.length; i++)
                {
                    if(info[i].getState() == NetworkInfo.State.CONNECTED)
                        return true;
                }
            }
        }
        return false;
    }
    public static APIService getFCMClient() {
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
