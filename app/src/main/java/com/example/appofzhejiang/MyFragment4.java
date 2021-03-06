package com.example.appofzhejiang;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appofzhejiang.Business.ReceiptActivity;
import com.example.appofzhejiang.Login.LoginActivity;
import com.example.appofzhejiang.Setting.SettingActivity;
import com.example.appofzhejiang.pay.PayActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyFragment4 extends Fragment {

    private View view;
    private TextView txtAddress, txtOrder, txtSetting, txtAbout, txtUsername,
            txtTobePaid,txtPaid,txtFinish;
    private CircleImageView imageUser;

    public MyFragment4() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_my4, container, false);
        txtAddress = view.findViewById(R.id.txt_address);
        txtOrder = view.findViewById(R.id.txt_order);
        txtSetting = view.findViewById(R.id.txt_setting);
        txtAbout = view.findViewById(R.id.txt_about);
        txtUsername = view.findViewById(R.id.user_name);
        imageUser = view.findViewById(R.id.user_image);
        txtTobePaid = view.findViewById(R.id.txt_tobePaid);
        txtPaid = view.findViewById(R.id.txt_paid);
        txtFinish = view.findViewById(R.id.txt_finished);

        //跳转至收货信息界面
        txtAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReceiptActivity.class);
                startActivity(intent);
            }
        });

        //跳转至订单管理界面
        txtOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PayActivity.class);
                startActivity(intent);
            }
        });

        //已完成订单
        txtFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), PayActivity.class);
                intent.putExtra("id",3);    //在这里传递参数
                getActivity().startActivity(intent);
            }
        });

        //已付款订单
        txtPaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), PayActivity.class);
                intent.putExtra("id",2);    //在这里传递参数
                getActivity().startActivity(intent);
            }
        });

        //待付款订单
        txtTobePaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), PayActivity.class);
                intent.putExtra("id",1);    //在这里传递参数
                getActivity().startActivity(intent);
            }
        });

        //跳转至设置界面
        txtSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SettingActivity.class);
                startActivity(intent);
            }
        });
        txtAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        //跳转至登陆界面
        txtUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });

        //跳转至登陆界面
        imageUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}