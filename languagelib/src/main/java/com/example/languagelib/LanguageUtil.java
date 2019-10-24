package com.example.languagelib;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;

import java.util.Locale;

/*-------------------------------------------------------------------------
 * 作者：张渊卓
 * 创建时间： 2019/10/24
 * 版本号：v1.0
 * 本类主要用途描述：
 *
 *-------------------------------------------------------------------------*/
public class LanguageUtil {

    public static String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        if (language.endsWith("zh")) {
            return LanguageConstant.LANGUAGE_ZH;
        } else if (language.endsWith("en")) {
            return LanguageConstant.LANGUAGE_US;
        } else if (language.endsWith("ko")) {
            return LanguageConstant.LANGUAGE_KO;
        }else if (language.endsWith("ja")) {
            return LanguageConstant.LANGUAGE_JAPANESE;
        }
        return null;
    }

    /**
     * 改变语言
     *
     * @param locale
     */
    public static void setLocale(Context context, Locale locale) {
        //getResources()必须用activity的上下文,appContext无效
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            configuration.setLocale(locale);
        } else {
            configuration.locale = locale;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        context.getResources().updateConfiguration(configuration, displayMetrics);
    }
}
