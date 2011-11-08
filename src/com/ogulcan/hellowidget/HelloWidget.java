package com.ogulcan.hellowidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.widget.RemoteViews;

public class HelloWidget extends AppWidgetProvider {
	
	RemoteViews rmViews;
	ComponentName cmName;
	AppWidgetManager appWidgetManager;
	
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
		
		rmViews = new RemoteViews(context.getPackageName(), R.layout.main);
		
		appWidgetManager = this.appWidgetManager;
		
		cmName = new ComponentName(context, HelloWidget.class);

		rmViews.setTextViewText(R.id.hello, "Hello Widget");

		appWidgetManager.updateAppWidget(cmName, rmViews);
		
	}
}
