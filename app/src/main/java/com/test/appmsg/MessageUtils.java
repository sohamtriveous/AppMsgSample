package com.test.appmsg;

import android.app.Activity;
import android.view.View;

import com.devspark.appmsg.AppMsg;

import static android.view.Gravity.BOTTOM;
import static com.devspark.appmsg.AppMsg.LENGTH_STICKY;

/**
 * Created by sohammondal on 04/11/14.
 */
public class MessageUtils {
    public static void showAppMsg(final Activity activity, View.OnClickListener onClickListener) {
        final int priority = AppMsg.PRIORITY_NORMAL;
        final AppMsg.Style style = new AppMsg.Style(LENGTH_STICKY, R.color.sticky);
        AppMsg provided = AppMsg.makeText(activity, activity.getResources().getString(R.string.upgrade_text), style, R.layout.sticky);
        provided.getView().findViewById(R.id.sticky_freeversion).setOnClickListener(onClickListener);

        // create {@link AppMsg} with specify type
        AppMsg appMsg = provided;
        appMsg.setPriority(priority);
        appMsg.setLayoutGravity(BOTTOM);

        appMsg.show();
    }

    public static void cancelAll(final Activity activity) {
        AppMsg.cancelAll(activity);
    }
}
