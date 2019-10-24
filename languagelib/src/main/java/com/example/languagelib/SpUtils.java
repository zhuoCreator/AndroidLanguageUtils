package com.example.languagelib;

import android.content.Context;
import android.content.SharedPreferences;

public class SpUtils {
    private static SharedPreferences mSharedPreferences;

    private static SharedPreferences getPreferneces() {
        if (mSharedPreferences == null) {

            mSharedPreferences =MyApp.getApplication().getSharedPreferences("languageUtil", Context.MODE_PRIVATE);
        }
        return mSharedPreferences;
    }

    /**
     * 打印所有
     */
    public static void print() {
        System.out.println(getPreferneces().getAll());
    }

    /**
     * 清空保存在默认SharePreference下的所有数据
     */
    public static void clear() {
        getPreferneces().edit().clear().commit();
    }

    /**
     * 保存字符串
     *
     * @return
     */
    public static void putString(String key, String value) {

        getPreferneces().edit().putString(key, value).commit();
    }

    /**
     * 读取字符串
     *
     * @param key
     * @return
     */
    public static String getString(String key) {
        return getPreferneces().getString(key, null);

    }

    /**
     * 保存整型值
     *
     * @return
     */
    public static void putInt(String key, int value) {
        getPreferneces().edit().putInt(key, value).commit();
    }

    /**
     * 读取整型值
     *
     * @param key
     * @return
     */
    public static int getInt(String key) {
        return getPreferneces().getInt(key, 0);
    }

    /**
     * 保存布尔值
     *
     * @return
     */
    public static void putBoolean(String key, Boolean value) {
        getPreferneces().edit().putBoolean(key, value).commit();
    }

    public static void putLong(String key, long value) {
        getPreferneces().edit().putLong(key, value).commit();
    }

    public static long getLong(String key) {
        return getPreferneces().getLong(key, 0);
    }

    /**
     * t 读取布尔值
     *
     * @param key
     * @return
     */
    public static boolean getBoolean(String key) {
        return getPreferneces().getBoolean(key, false);

    }

    /**
     * 移除字段
     *
     * @return
     */

    public static void remove(String... keys) {
        for (int i = 0; i < keys.length; i++) {
            getPreferneces().edit().remove(keys[i]).commit();
        }

    }

    public static void removeAll() {
        getPreferneces().edit().clear().commit();
    }


}
