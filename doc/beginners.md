## Beginer's Tutorial on Android

Steps to build an Android app using OpenCV's library.

### Create a new project

The first step is to create an Android project.
On Eclipse select:

	File -> New -> Project... -> Android Application Project

Follow through the wizard and start with a Blank Activity project.

### Layout of the MainActivity

The Blank Activity projects start with a basic Layout. Let's change that.
Open the `activity_main.xml` file and change it by the following snippet:

``` java
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="br.com.anishitani.tracking.MainActivity" >

    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:onClick="startVideo"
        android:text="@string/button_start" />

</LinearLayout>
```

Now what we have is a clean screen with a single button.
 