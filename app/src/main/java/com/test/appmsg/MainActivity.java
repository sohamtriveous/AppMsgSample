package com.test.appmsg;

/*
 * Copyright 2012 Evgeny Shishkin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.devspark.appmsg.AppMsg;

import static android.view.Gravity.BOTTOM;
import static com.devspark.appmsg.AppMsg.LENGTH_STICKY;

/**
 * Sample of AppMsg library.
 *
 * @author Evgeny Shishkin
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Button onClick listener.
     *
     * @param v
     */
    public void buttonClick(View v) {
        switch (v.getId()) {
            case R.id.show:
                // this is how you show a message
                MessageUtils.showAppMsg(this, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "I have clicked the app message", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case R.id.cancel_all:
                // this is how you can cancel a message
                MessageUtils.cancelAll(this);
                break;
            default:
                return;
        }
    }


}