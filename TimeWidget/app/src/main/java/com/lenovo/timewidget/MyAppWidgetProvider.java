package com.lenovo.timewidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.util.Log;
import android.widget.RemoteViews;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyAppWidgetProvider extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        final int N=appWidgetIds.length;
        for (int i = 0; i < N; i++) {
            int appWidgetId=appWidgetIds[i];
            RemoteViews views=new RemoteViews(context.getPackageName(),R.layout.firstappwidget);
            java.text.DateFormat df=new SimpleDateFormat("hh:mm:ss");
            views.setTextViewText(R.id.tvMsg,"当前时间:"+df.format(new Date()));
            appWidgetManager.updateAppWidget(appWidgetId,views);
            Log.v("TAG","MyAppWidgetProvide");
            Log.v("TAG","Test");
            Log.v("TAG","Test1");
        }
    }
}
