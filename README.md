AppMsgSample
============

Shows how one can use the AppMsg library to create a persistent toast/notification-like-view at the bottom.

- To see how to create such a notification please have a look at https://github.com/triveous/AppMsgSample/blob/master/app/src/main/java/com/test/appmsg/MainActivity.java


###Sample

```java
MessageUtils.showAppMsg(this, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "I have clicked the app message", Toast.LENGTH_SHORT).show();
                    }
                });
```
