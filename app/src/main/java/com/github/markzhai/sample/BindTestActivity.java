package com.github.markzhai.sample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.github.markzhai.sample.databinding.ActivityBindtestBinding;

/**
 * Created by lianghe on 16-8-9.
 */
public class BindTestActivity  extends Activity {

    ActivityBindtestBinding mBinding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_bindtest);
        Bindtestdata mBindtestdata = new Bindtestdata();
        mBindtestdata.setStrTextView1("sssssssssssssssss");
        mBinding.setBindtestdata(mBindtestdata);
    }
}
