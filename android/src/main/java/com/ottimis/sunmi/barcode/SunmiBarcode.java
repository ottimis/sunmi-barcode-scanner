package com.ottimis.sunmi.barcode;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class SunmiBarcode {

    private static PackageInfo getPackageInfo(Context context, String pkg) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(pkg, 0);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
            e.printStackTrace();
        }
        return packageInfo;
    }

    private boolean compareVer(String nVer, String oVer, boolean isEq, int bit) {
        if (nVer.isEmpty() || oVer.isEmpty()) return false;
        String[] nArr = nVer.split("[.]");
        String[] oArr = oVer.split("[.]");
        if (nArr.length < bit || oArr.length < bit) return false;
        boolean vup = false;
        for (int i = 0; i < bit; i++) {
            int n = Integer.parseInt(nArr[i]);
            int o = Integer.parseInt(oArr[i]);
            if (n >= o) {
                if (n > o) {
                    vup = true;
                    break;
                } else if (isEq && i == (bit - 1)) {
                    vup = true;
                    break;
                }
            } else {
                break;
            }
        }
        return vup;
    }

    public boolean hasScanner(Context ctx) {
        PackageInfo info = getPackageInfo(ctx, "com.sunmi.scanner");
        return info != null && compareVer(info.versionName, "4.4.4", true, 3);
    }
}
