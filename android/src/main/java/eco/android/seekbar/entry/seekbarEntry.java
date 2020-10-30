package eco.android.seekbar.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.eco.framework.extend.annotation.ModuleEntry;
import eco.android.seekbar.component.AppSeekBar;

@ModuleEntry
public class seekbarEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {

        try {
            WXSDKEngine.registerComponent("ecoSeekbar", AppSeekBar.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

}
