package com.example;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.PhoneAccountHandle;

import androidx.annotation.Nullable;

public class MyConnectionService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void ConnectionService (){

    }

    public Connection onCreateOutgoingConnection(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request){
        return null;
    }
}
