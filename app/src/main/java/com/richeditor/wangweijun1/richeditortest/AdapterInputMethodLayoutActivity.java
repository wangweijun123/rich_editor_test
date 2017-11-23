package com.richeditor.wangweijun1.richeditortest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;

import jp.wasabeef.richeditor.RichEditor;

/**
 * Created by wangweijun1 on 2017/11/23.
 *
 * 布局使用weiget的方式就可以适配editor获取到焦点弹出输入法的布局,底部button自动弹上来
 */

public class AdapterInputMethodLayoutActivity extends Activity{
    private RichEditor title, editor;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_adapter_input_method);

        editor = (RichEditor) findViewById(R.id.editor);
        editor.setEditorBackgroundColor(Color.BLUE);
        title = (RichEditor) findViewById(R.id.title);
        title.setEditorBackgroundColor(Color.RED);

    }
}
