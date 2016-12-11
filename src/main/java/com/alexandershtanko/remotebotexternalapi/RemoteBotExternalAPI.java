package com.alexandershtanko.remotebotexternalapi;

import android.content.Context;
import android.content.Intent;

/**
 * @author Alexander Shtanko ab.shtanko@gmail.com
 *
 *         Created on 09/12/2016.
 *         Copyright Remote Bot for Telegram
 *         https://remote-bot-for-telegram.firebaseapp.com/
 */

public class RemoteBotExternalAPI {

    public static final String PACKAGE_NAME = "com.alexandershtanko.androidtelegrambot";
    public static final String CLASS_NAME = "com.alexandershtanko.androidtelegrambot.receivers.ExternalMessageReceiver";
    public static final String ACTION = "com.alexandershtanko.androidtelegrambot.ACTION_EXTERNAL";

    public static void sendLocation(Context context, float lat, float lng)
    {
        Intent intent = getIntent();

        intent.putExtra("message_type","location");
        intent.putExtra("cords",lat+","+lng);

        sendIntent(context, intent);
    }

    public static void sendAudio(Context context,String path)
    {
        Intent intent = getIntent();

        intent.putExtra("message_type","audio");
        intent.putExtra("path",path);

        sendIntent(context, intent);
    }
    public static void sendDocument(Context context,String path)
    {
        Intent intent = getIntent();

        intent.putExtra("message_type","document");
        intent.putExtra("path",path);

        sendIntent(context, intent);
    }

    public static void sendVideo(Context context,String path)
    {
        Intent intent = getIntent();

        intent.putExtra("message_type","video");
        intent.putExtra("path",path);

        sendIntent(context, intent);
    }

    public static void sendPhoto(Context context,String path)
    {
        Intent intent = getIntent();

        intent.putExtra("message_type","photo");
        intent.putExtra("path",path);

        sendIntent(context, intent);
    }

    public static void sendVoice(Context context,String path)
    {
        Intent intent = getIntent();

        intent.putExtra("message_type","voice");
        intent.putExtra("path",path);

        sendIntent(context, intent);
    }

    public static void sendMessage(Context context,String text)
    {
        Intent intent = getIntent();

        intent.putExtra("message_type","message");
        intent.putExtra("text",text);

        sendIntent(context, intent);
    }


    private static void sendIntent(Context context, Intent intent) {
        context.sendBroadcast(intent);
    }

    private static Intent getIntent() {
        Intent intent = new Intent();
        intent.setClassName(PACKAGE_NAME, CLASS_NAME);
        intent.setAction(ACTION);
        return intent;
    }
}
