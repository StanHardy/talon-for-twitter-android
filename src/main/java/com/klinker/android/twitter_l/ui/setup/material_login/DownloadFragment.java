package com.klinker.android.twitter_l.ui.setup.material_login;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

public class DownloadFragment extends Fragment {

    private MaterialLogin activity;

    public static DownloadFragment getInstance() {
        return new DownloadFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activity = (MaterialLogin) getActivity();

        CookieSyncManager.createInstance(getActivity());
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookie();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return null;
    }

    public void start(final MaterialLogin.Callback callback) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                callback.onDone();
            }
        }, 2000);
    }
}