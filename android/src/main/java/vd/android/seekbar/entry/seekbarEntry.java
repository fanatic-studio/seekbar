package vd.android.seekbar.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.vd.framework.extend.annotation.ModuleEntry;
import vd.android.seekbar.component.AppSeekBar;

@ModuleEntry
public class seekbarEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {

        try {
            WXSDKEngine.registerComponent("vdSeekbar", AppSeekBar.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

}
