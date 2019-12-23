package com.fengzi

import android.app.Application
import com.bytedance.sdk.openadsdk.TTAdManager
import com.bytedance.sdk.openadsdk.TTAdConstant
import com.bytedance.sdk.openadsdk.TTAdConfig
import com.bytedance.sdk.openadsdk.TTAdSdk
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T


/**
 *    author : fenzili
 *    e-mail : 291924028@qq.com
 *    date   : 2019/12/23 23:21
 *    pkn    : com.fengzi
 *    desc   :
 */
class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        TTAdSdk.init(
            this.applicationContext,
            TTAdConfig.Builder()
                .appId("5001121")
                .useTextureView(false) //使用TextureView控件播放视频,默认为SurfaceView,当有SurfaceView冲突的场景，可以使用TextureView
                .appName("APP测试媒体")
                .titleBarTheme(TTAdConstant.TITLE_BAR_THEME_DARK)
                .allowShowNotify(true) //是否允许sdk展示通知栏提示
                .allowShowPageWhenScreenLock(true) //是否在锁屏场景支持展示广告落地页
                .debug(true) //测试阶段打开，可以通过日志排查问题，上线时去除该调用
                .directDownloadNetworkType(
                    TTAdConstant.NETWORK_STATE_WIFI,
                    TTAdConstant.NETWORK_STATE_3G,
                    TTAdConstant.NETWORK_STATE_4G,
                    TTAdConstant.NETWORK_STATE_MOBILE
                ) //允许直接下载的网络状态集合
                .supportMultiProcess(false) //是否支持多进程，true支持
                //.httpStack(new MyOkStack3())//自定义网络库，demo中给出了okhttp3版本的样例，其余请自行开发或者咨询工作人员。
                .build()
        )
    }
}