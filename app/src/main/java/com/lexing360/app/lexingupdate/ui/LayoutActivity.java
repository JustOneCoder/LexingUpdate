package com.lexing360.app.lexingupdate.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.lexing360.app.lexingupdate.Api;
import com.lexing360.app.lexingupdate.BooleanUtils;
import com.lexing360.app.lexingupdate.R;
import com.lexing360.app.lexingupdate.UpDataSubscriber;
import com.lexing360.app.lexingupdate.base.BaseBindingActivity;
import com.lexing360.app.lexingupdate.databinding.ActivityLayoutBinding;
import com.lexing360.app.lexingupdate.model.LayoutModel;
import com.lexing360.app.lexingupdate.model.ResponseModel;
import com.lexing360.app.lexingupdate.base.RouterConstants;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.Callback;
import retrofit2.Response;

@Route(path = RouterConstants.LAYOUT)
public class LayoutActivity extends BaseBindingActivity<ActivityLayoutBinding> implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    Gson gson;

    String name;
    String checkAvatarurl;
    String checkIntegration;
    String redDot;
    String hide1;
    String hide2;
    String hide3;
    String hide4;
    String fontType1Str;
    String fontType2Str;
    String fontType3Str;
    String fontType4Str;
    String textColor1Str;
    String textColor2Str;
    String textColor3Str;
    String textColor4Str;
    int messageSettingId;

    private boolean isFirst = true;
    LayoutModel.DataBean dataBean;
    List<LayoutModel.DataBean> data;

    @Override
    protected void bindData(ActivityLayoutBinding binding, Bundle savedInstanceState) {
        gson = new Gson();
        getXmlInfo();
        initListener();

    }

    private void initListener() {
        binding.btPut.setOnClickListener(this);
        binding.rgAvatarurl.setOnCheckedChangeListener(this);
        binding.rgIntegration.setOnCheckedChangeListener(this);
        binding.rgFontType1.setOnCheckedChangeListener(this);
        binding.rgFontType2.setOnCheckedChangeListener(this);
        binding.rgFontType3.setOnCheckedChangeListener(this);
        binding.rgFontType4.setOnCheckedChangeListener(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_layout;
    }

    private void initView() {
        if (isFirst) {
            dataBean = data.get(0);
            binding.setModel(dataBean);
            getChecked();
            isFirst = false;
        }
        binding.etMessageSettingId.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s == null || s.length() == 0) {
                    return;
                }
                messageSettingId = Integer.parseInt(s.toString());
                if (messageSettingId == 1) {
                    getXmlInfo();
                    dataBean = data.get(0);
                    binding.setModel(dataBean);
                    return;
                }

                if (messageSettingId == 2) {
                    getXmlInfo();
                    dataBean = data.get(1);
                    binding.setModel(dataBean);
                    return;
                }

                if (messageSettingId == 3) {
                    getXmlInfo();
                    dataBean = data.get(2);
                    binding.setModel(dataBean);
                    return;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    public void getChecked() {
        String fontType = dataBean.getFirstLabelOfLineOne().getFontType();
        if (fontType.equals("LARGE")) {
            binding.rbFontType1Large.setChecked(true);
        } else if (fontType.equals("LARGE")) {
            binding.rbFontType1Middle.setChecked(true);
        } else {
            binding.rbFontType1Small.setChecked(true);
        }
        String fontType2 = dataBean.getSecondLabelOfLineOne().getFontType();
        if (fontType2.equals("LARGE")) {
            binding.rbFontType2Large.setChecked(true);
        } else if (fontType.equals("LARGE")) {
            binding.rbFontType2Middle.setChecked(true);
        } else {
            binding.rbFontType2Small.setChecked(true);
        }

        String fontType3 = dataBean.getFirstLabelOfLineTwo().getFontType();
        if (fontType3.equals("LARGE")) {
            binding.rbFontType3Large.setChecked(true);
        } else if (fontType.equals("LARGE")) {
            binding.rbFontType3Middle.setChecked(true);
        } else {
            binding.rbFontType3Small.setChecked(true);
        }

        String fontType4 = dataBean.getSecondLabelOfLineTwo().getFontType();
        if (fontType4.equals("LARGE")) {
            binding.rbFontType4Large.setChecked(true);
        } else if (fontType.equals("LARGE")) {
            binding.rbFontType4Middle.setChecked(true);
        } else {
            binding.rbFontType4Small.setChecked(true);
        }
    }

    private void getViewValue() {
        name = binding.etName.getText().toString();
        redDot = binding.etReddot.getText().toString();
        textColor1Str = binding.textColor1.getText().toString();
        hide1 = binding.etHide1.getText().toString();
        textColor2Str = binding.textColor2.getText().toString();
        hide2 = binding.etHide2.getText().toString();
        textColor3Str = binding.textColor3.getText().toString();
        hide3 = binding.etHide3.getText().toString();
        textColor4Str = binding.textColor4.getText().toString();
        hide4 = binding.etHide4.getText().toString();
        try {
            messageSettingId = Integer.parseInt(binding.etMessageSettingId.getText().toString());
        } catch (NumberFormatException e) {
            messageSettingId = 1;
        }


    }


    //获取目前的额布局参数
    private void getXmlInfo() {
        apiServices.getXmlInfo().enqueue(new Callback<LayoutModel>() {
            @Override
            public void onResponse(retrofit2.Call<LayoutModel> call, Response<LayoutModel> response) {
                data = response.body().getData();
                initView();
            }

            @Override
            public void onFailure(retrofit2.Call<LayoutModel> call, Throwable t) {
                Toast.makeText(LayoutActivity.this, "获取后台参数错误：" + t.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }


    //推送配置
    private void putXmlInfo() {
        setPutInfo();
        if (apiServices == null) {
            return;
        }
        Flowable<ResponseModel> observable = apiServices.putXmlInfo(dataBean);
        Api.subscribe(observable, new UpDataSubscriber<ResponseModel>() {
            @Override
            public void onSucess(ResponseModel responseModel) {
                Toast.makeText(LayoutActivity.this, responseModel.getMessage(), Toast.LENGTH_LONG).show();
                Log.e("666Next", responseModel.getMessage());
            }

        });
    }


    private void setPutInfo() {
        getViewValue();
        dataBean.setName(name);
        dataBean.setMessageSettingId(messageSettingId);
        dataBean.setRedDot(redDot);
        dataBean.setAvatarUrl(BooleanUtils.convertToBoolean(checkAvatarurl));
        dataBean.setIntegration(BooleanUtils.convertToBoolean(checkIntegration));

        dataBean.getFirstLabelOfLineOne().setTextColor(textColor1Str);
        dataBean.getFirstLabelOfLineOne().setFontType(fontType1Str);
        dataBean.getFirstLabelOfLineOne().setHide(BooleanUtils.convertToBoolean(hide1));

        dataBean.getSecondLabelOfLineOne().setTextColor(textColor2Str);
        dataBean.getSecondLabelOfLineOne().setFontType(fontType2Str);
        dataBean.getSecondLabelOfLineOne().setHide(BooleanUtils.convertToBoolean(hide2));

        dataBean.getFirstLabelOfLineTwo().setTextColor(textColor3Str);
        dataBean.getFirstLabelOfLineTwo().setFontType(fontType3Str);
        dataBean.getFirstLabelOfLineTwo().setHide(BooleanUtils.convertToBoolean(hide3));

        dataBean.getSecondLabelOfLineTwo().setTextColor(textColor4Str);
        dataBean.getSecondLabelOfLineTwo().setFontType(fontType4Str);
        dataBean.getSecondLabelOfLineTwo().setHide(BooleanUtils.convertToBoolean(hide4));
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (group != null && checkedId > 0) {
            if (group == binding.rgAvatarurl) {
                if (checkedId == R.id.rb_avatarurl_true) {
                    checkAvatarurl = "true";
                } else {
                    checkAvatarurl = "false";
                }

            } else if (group == binding.rgIntegration) {
                if (checkedId == R.id.rb_integration_true) {
                    checkIntegration = "true";
                } else {
                    checkIntegration = "false";
                }
            } else if (group == binding.rgFontType1) {
                if (binding.rgFontType1.getCheckedRadioButtonId() == R.id.rb_fontType1_large) {
                    fontType1Str = "LARGE";
                } else if (binding.rgFontType1.getCheckedRadioButtonId() == R.id.rb_fontType1_middle) {
                    fontType1Str = "MIDDLE";
                } else {
                    fontType1Str = "SMALL";
                }
            } else if (group == binding.rgFontType2) {
                if (binding.rgFontType2.getCheckedRadioButtonId() == R.id.rb_fontType2_large) {
                    fontType2Str = "LARGE";
                } else if (binding.rgFontType2.getCheckedRadioButtonId() == R.id.rb_fontType2_middle) {
                    fontType2Str = "MIDDLE";
                } else {
                    fontType2Str = "SMALL";
                }
            } else if (group == binding.rgFontType3) {
                if (binding.rgFontType3.getCheckedRadioButtonId() == R.id.rb_fontType3_large) {
                    fontType3Str = "LARGE";
                } else if (binding.rgFontType3.getCheckedRadioButtonId() == R.id.rb_fontType3_middle) {
                    fontType3Str = "MIDDLE";
                } else {
                    fontType3Str = "SMALL";
                }
            } else if (group == binding.rgFontType4) {
                if (binding.rgFontType4.getCheckedRadioButtonId() == R.id.rb_fontType4_large) {
                    fontType4Str = "LARGE";
                } else if (binding.rgFontType4.getCheckedRadioButtonId() == R.id.rb_fontType4_middle) {
                    fontType4Str = "MIDDLE";
                } else {
                    fontType4Str = "SMALL";
                }
            }
            group.check(checkedId);
        }
    }


    @Override
    public void onClick(View v) {
        putXmlInfo();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
