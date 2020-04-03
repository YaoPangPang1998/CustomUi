package com.example.customui;

import android.app.Dialog;
import android.content.Context;

public class myDialog extends Dialog {
    public myDialog(Context context) {
        super(context);
    }

    public myDialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    protected myDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}
