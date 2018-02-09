package com.lexing360.app.lexingupdate.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.lexing360.app.lexingupdate.Api;
import com.lexing360.app.lexingupdate.R;
import com.lexing360.app.lexingupdate.SPUtil;
import com.lexing360.app.lexingupdate.base.BaseBindingActivity;
import com.lexing360.app.lexingupdate.base.RouterConstants;
import com.lexing360.app.lexingupdate.databinding.ActivityUpdataBinding;
import com.lexing360.app.lexingupdate.model.JwtModel;
import com.lexing360.app.lexingupdate.model.ResponseModel;
import com.lexing360.app.lexingupdate.model.UpDateModel;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

@Route(path = RouterConstants.UPDATA)
public class UpdataActivity extends BaseBindingActivity<ActivityUpdataBinding> implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {

    String[] channelArr = {"app", "product", "productTest", "dev", "staging", "stagingTest"};

    String mAccount;
    String mPassword;
    String mCurrrentVersion;
    String mUpdateVersion;
    String mChannel = "app";
    Gson gson;
    String jwt;

    @Override
    protected void bindData(ActivityUpdataBinding binding, Bundle savedInstanceState) {
        initView();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_updata;
    }

    private void initView() {
        binding.etAccount.setText(SPUtil.getString(this, SPUtil.ACCOUNT));
        binding.etPassword.setText(SPUtil.getString(this, SPUtil.PASSWORD));   //默认初始密码
        binding.etCurrrentVersion.setText(SPUtil.getString(this, SPUtil.CURRENT_VERSION));
        binding.etUpdateVersion.setText(SPUtil.getString(this, SPUtil.UPDATE_VERSION));
        binding.rgChannelInner.setOnCheckedChangeListener(this);
        binding.rgChannelOut.setOnCheckedChangeListener(this);

    }

    private void setViewValue() {
        mAccount = binding.etAccount.getText().toString();
        mPassword = binding.etPassword.getText().toString();
        mCurrrentVersion = binding.etCurrrentVersion.getText().toString();
        mUpdateVersion = binding.etUpdateVersion.getText().toString();
        //存值
        SPUtil.putString(this, SPUtil.ACCOUNT, mAccount);
        SPUtil.putString(this, SPUtil.PASSWORD, mPassword);
        SPUtil.putString(this, SPUtil.CURRENT_VERSION, mCurrrentVersion);
        SPUtil.putString(this, SPUtil.UPDATE_VERSION, mUpdateVersion);
        SPUtil.putString(this, SPUtil.CHANNEL, mChannel);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_jwt:
                getJwt();
                break;

            case R.id.bt_upDate:
                upDate();
                break;
            default:
                break;
        }
    }

    //点击进行升级
    public void upDate() {
        if (jwt == null) {
            getJwt();
            return;
        }
        setViewValue();
        getUpdateUrl();
    }

    public void getJwt() {
        setViewValue();
        OkHttpUtils
                .post()
                .tag(this)
                .url(Api.URL_GET_JWT)
                .addParams("phone", mAccount)
                .addParams("password", mPassword)
                .addParams("device_id", "ac1566d9edf44b0299ec0c33d6621153")
                .addParams("device_type", "Android")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int i) {
                        Toast.makeText(UpdataActivity.this, "获取jwt:" + e.getMessage(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onResponse(String s, int i) {
                        JwtModel jwtModel = gson.fromJson(s, JwtModel.class);
                        jwt = jwtModel.getData().getJwt();
                        Toast.makeText(UpdataActivity.this, "成功：" + jwt, Toast.LENGTH_LONG).show();
                    }
                });

    }

    private void getUpdateUrl() {
        Log.e("666", Api.URL_BASE_UPDATE + mCurrrentVersion + "/" + mChannel);
        OkHttpUtils
                .get()
                .tag(this)
                .url(Api.URL_BASE_UPDATE + mCurrrentVersion + "/" + mChannel)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int i) {
                        Toast.makeText(UpdataActivity.this, "获取升级链接失败:" + e.toString(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onResponse(String s, int i) {
                        Log.e("666", i + s);
                        putUpDate(s);

                    }
                });
    }

    private void putUpDate(String s) {
        UpDateModel upDateModel = gson.fromJson(s, UpDateModel.class);
        String updateUrl = upDateModel.getData().getUpdateUrl();
        Log.e("666", "{\"downloadUrl\":" + '"' + updateUrl + '"' + "}");
        OkHttpUtils.put()
                .tag(this)
                .url(Api.URL_BASE_UPDATE + mCurrrentVersion + "/" + mChannel)
                .addHeader("Authorization", jwt)
                .requestBody("{\"downloadUrl\":" + '"' + updateUrl + '"' + "}")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int i) {
                        Toast.makeText(UpdataActivity.this, "put升级:" + e.toString(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onResponse(String s, int i) {
                        ResponseModel responseModel = gson.fromJson(s, ResponseModel.class);
                        Toast.makeText(UpdataActivity.this, "put升级:" + responseModel.getMessage(), Toast.LENGTH_LONG).show();
                        Log.e("6661", s);
                    }
                });
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (group != null && checkedId > 0) {
            if (group == binding.rgChannelOut) {
                binding.rgChannelInner.clearCheck();
                switch (checkedId) {
                    case R.id.rb_1:
                        mChannel = channelArr[0];
                        break;
                    case R.id.rb_2:
                        mChannel = channelArr[1];
                        break;
                    case R.id.rb_3:
                        mChannel = channelArr[2];
                        break;
                }
            } else {
                binding.rgChannelOut.clearCheck();
                switch (checkedId) {
                    case R.id.rb_4:
                        mChannel = channelArr[3];
                        break;
                    case R.id.rb_5:
                        mChannel = channelArr[4];
                        break;
                    case R.id.rb_6:
                        mChannel = channelArr[5];
                        break;
                }
            }
            group.check(checkedId);
            Log.e("666", mChannel);
        }
    }

}
