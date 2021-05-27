package com.example.subhunter;

/*
These are all the classes of other people's
(Android) code that we use for Sub Hunter
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.Display;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;
import java.util.Random;


public class SubHunter extends Activity {

    /*
    Android runs this code just before
    the player sees the app.
    This makes it a good place to add
    the code for the one-time setup phase.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Log.d("Debugging", "In onCreate");
        newGame();
        draw();
    }

    /*
    This code will execute when a new
    game needs to be started. It will
    happen when the app is first started
    and after the player wins a game.
     */
    void newGame(){
        Log.d("Debugging", "In newGame");
    }

    /*
    Here we will do all the drawing.
    The grid lines, the HUD and
    the touch indicator and the
    "BOOM" when the sub is hit
     */
    void draw(){
        Log.d("Debugging", "In draw");
    }

    /*
    This part of the code will
    handle detecting that the player
    has tapped the screen
     */
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent){
        Log.d("Debugging", "In onTouchEvent");
        takeShot();
        return true;
    }

    /*
    The code here will execute when
    the player taps the screen. It will
    calculate the distance from the sub
    and decide a hit or miss
     */
    void takeShot(){
        Log.d("Debugging", "In takeShot");
        draw();
    }

    // This code says "BOOM!"
    void boom(){

    }

    // This code prints the debugging text
    void printDebuggingText(){

    }
}