package com.example.pactical8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;
public class SMSReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        //---get the SMS message passed in---
        Bundle bundle = intent.getExtras();
        SmsMessage[] msgs = null;
        String str = "SMS from ";
        if (bundle != null) {
            //---retrieve the SMS message received---
            // msgs = Telephony.Sms.Intents.getMessagesFromIntent(intent);
            Object[] pdus = (Object[]) bundle.get("pdus");
            msgs = new SmsMessage[pdus.length];

            for (int i = 0; i < msgs.length; i++)
            {
                msgs[i]=SmsMessage.createFromPdu((byte[])pdus[i]);
                if (i==0)
                {// get the sender address/phone number
                    str += msgs[i].getOriginatingAddress();
                    str +=":";}
                // get the message body

                //str += msgs[i].getMessageBody().toString();
            }
            //int i=0;
            for (int i = 0; i < msgs.length; i++)
                str += msgs[i].getMessageBody().toString();
        }
        //---display the new SMS message---
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
        Log.d("SMSReceiver", str);

        //---launch the SMSActivity---
        //Intent mainActivityIntent = new Intent(context, MainActivity.class);
        //mainActivityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //context.startActivity(mainActivityIntent);

        Intent broadcastIntent = new Intent();
        broadcastIntent.setAction("SMS_RECEIVED_ACTION");
        broadcastIntent.putExtra("sms", str);
        context.sendBroadcast(broadcastIntent);

    }
}