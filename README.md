Android-L-TintedStatusBarWorkaround
===================================

**FOR API19 ONLY**

------------------

How did I do it?
----------------

in your values/styles.xml folder (**or** in your values-v19.styles.xml folder/file), enter the following:

    <item name="android:fitsSystemWindows">true</item>
    <item name="android:windowTranslucentStatus">true</item>

After that, take a look at my l_statusbar_tint_workaround.xml file.
You'll realize that I have a FrameLayout as the main parent of the RelativeLayout.

The background color of the FrameLayout defines the color above the top of the Actionbar.

Here's an example:

    <FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/l_statusbar_tint_workaround_background_color_framelayout"
    android:fitsSystemWindows="true"
    android:foregroundGravity="fill" >
    </FrameLayout>
    

Put your main layout stuff inside of the FrameLayout.

See how easy that was? ;)


**If you want to quickly download an .apk and try it for yourself, the .apk is inside of the Build/AppVersions folder.**


*If you have any questions, feel free to ask me, as I'll likely be doing more tutorials in the near future.*

Hope this helped!

Screenshot
----------
(Version 0.00.001)

![ScreenShot](http://reinvented.t15.org/Screenshots/Android-L%20StatusBar%20Workaround/App%20Version/0.00.001/Android-L-TintedStatusBarWorkaround-Screenshot1.png)
