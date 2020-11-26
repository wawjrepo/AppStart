package com.performance.appstart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.performance.appstart.tasks.TestBean22;

import static android.webkit.WebSettings.LOAD_NO_CACHE;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        WebView webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebContentsDebuggingEnabled(true);
        webView.getSettings().setCacheMode(LOAD_NO_CACHE);
        webView.getSettings().setUserAgentString("Mozilla/5.0 (iPhone; CPU iPhone OS 9_3_5 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Mobile/13G36 Appended Custom User Agent");
//        webView.loadUrl("https://www.baidu.com");
        webView.loadUrl("https://mactivity.5i5j.com/bj/event/eleven/?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImp0aSI6IjEifQ.eyJpc3MiOiJ6aGFuZ3NhbiIsImp0aSI6IjEiLCJpYXQiOjE2MDUyNTM2MTEsImF1ZCI6IntcInVpZFwiOlwiNjAxMjM5OFwiLFwibG9naW5uYW1lXCI6bnVsbCxcIm5pY2tuYW1lXCI6XCIxODIzNjg4MjU4NFwiLFwiZW1haWxcIjpudWxsLFwiZ2VuZGVyXCI6bnVsbCxcInJlZ2lvblwiOm51bGwsXCJjaXR5XCI6bnVsbCxcImhlYWRpbWdcIjpudWxsLFwiaW52aXRpbmdjb2RlXCI6bnVsbCxcInJlZ2RhdGVcIjpcIjE1NTA2NTMzMDFcIixcInN0YXR1c1wiOjEsXCJwYXNzV29yZFwiOlwiZmU4MTYzNjc2YmE5N2IwNzQ4MjhkNmIyNjdjMmM4MGRcIixcInNhbHRcIjpcInlqODNnMlwiLFwidXNlcm1vYmlsZVwiOlwiMTgyMzY4ODI1ODRcIn0iLCJzdWIiOiJzdWJqZWN0In0.Lh5lsC63VlkR1FGmX_gRE5QIr5twIY0tJOofQrzuBTM&version=4.7.1&video_id=ffffffff-c819-e11b-ffff-ffffef05ac4a&location=0&smdeviceId=20200727162113af7ba85363b408de8978e618efb9ad7701ec084c8a9c9f30&apiversion=20201113&appVersion=4.7.1&tddeviceId=305ed24c626e12d66069607627380a90c&dxdeviceId=5fae285bFCesXT3zqNxI10GcNpivmpyrbW5bPJf3&dxfingerprint=5fae285bWedGAmsj5oUKrXUYqgnYzTKiedcBxAk3&smgdeviceId=DugDeb8RnIiNBmeo7ForMU/q823tvpKvsF1N9DPjIzBr61e+eb0epMLm42stuZDcpjar7B4k+UE4zO4OXz84widg&deviceId=ffffffff-c819-e11b-ffff-ffffef05ac4a&deviceSource=1&recommendDeviceid=&city=1&from=app");
        TestBean22 testBean22=MainActivityKt.getObjectExtra(getIntent(),"d", TestBean22.class);
//        TestBean testBean = (TestBean) getIntent().getSerializableExtra("test");
    }
}