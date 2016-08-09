package com.github.markzhai.sample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.github.markzhai.sample.BR;

/**
 * Created by lianghe on 16-8-9.
 */
public class Bindtestdata extends BaseObservable {

    public String strTextView1;
    public String StrtextView2;

    @Bindable
    public String getStrTextView1() {
        return strTextView1;
    }

    public String getStrtextView2() {
        return StrtextView2;
    }


    public void setStrTextView1(String strTextView1) {
        this.strTextView1 = strTextView1;
        notifyPropertyChanged(BR.strTextView1);
    }


    public void setStrtextView2(String strtextView2) {
        StrtextView2 = strtextView2;
    }



    public  void onclickbut(View view)
    {
        setStrTextView1("rrrrrrrrrrrrrrrr");

    }
}
