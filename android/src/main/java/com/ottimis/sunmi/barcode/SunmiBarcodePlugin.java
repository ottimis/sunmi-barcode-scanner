package com.ottimis.sunmi.barcode;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.result.ActivityResult;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.ActivityCallback;
import com.getcapacitor.annotation.CapacitorPlugin;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@CapacitorPlugin(name = "SunmiBarcode")
public class SunmiBarcodePlugin extends Plugin {
    private SunmiBarcode implementation = new SunmiBarcode();

    @PluginMethod
    public void hasScanner(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("value", implementation.hasScanner(getContext()));
        call.resolve(ret);
    }

    @PluginMethod
    public void scan(PluginCall call) {
        // Create the ScanOptions object with the options passed in the call
        ScanOptions options = new ScanOptions();
        Boolean playSound = call.getBoolean("playSound");
        options.setPlaySound(playSound != null ? playSound : true);

        Boolean playVibrate = call.getBoolean("playVibrate");
        options.setPlayVibrate(playVibrate != null ? playVibrate : false);

        Boolean identifyMoreCode = call.getBoolean("identifyMoreCode");
        options.setIdentifyMoreCode(identifyMoreCode != null ? identifyMoreCode : false);

        Boolean isShowSetting = call.getBoolean("showSettings");
        options.setShowSetting(isShowSetting != null ? isShowSetting : true);

        Boolean isShowAlbum = call.getBoolean("showAlbum");
        options.setShowAlbum(isShowAlbum != null ? isShowAlbum : true);

        Boolean identifyInverse = call.getBoolean("identifyInverse");
        options.setIdentifyInverse(identifyInverse != null ? identifyInverse : true);

        JSArray optionsArray = call.getArray("codeTypes");

        if (optionsArray != null) {
            for (int i = 0; i < optionsArray.length(); i++) {
                String codeType;
                try {
                    codeType = optionsArray.get(i).toString();
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
                switch (codeType) {
                    case "EAN_8":
                        options.setEan8Enable(true);
                        break;
                    case "UPC_E":
                        options.setUpcEEnable(true);
                        break;
                    case "ISBN_10":
                        options.setIsbn10Enable(true);
                        break;
                    case "CODE_11":
                        options.setCode11Enable(true);
                        break;
                    case "UPC_A":
                        options.setUpcAEnable(true);
                        break;
                    case "EAN_13":
                        options.setEan13Enable(true);
                        break;
                    case "ISBN_13":
                        options.setIsbn13Enable(true);
                        break;
                    case "INTERLEAVED_2_OF_5":
                        options.setInterleaved2of5Enable(true);
                        break;
                    case "CODE_128":
                        options.setCode128Enable(true);
                        break;
                    case "CODABAR":
                        options.setCodabarEnable(true);
                        break;
                    case "CODE_39":
                        options.setCode39Enable(true);
                        break;
                    case "CODE_93":
                        options.setCode93Enable(true);
                        break;
                    case "DATABAR":
                        options.setDatabarEnable(true);
                        break;
                    case "DATABAR_EXP":
                        options.setDatabarExpEnable(true);
                        break;
                    case "Micro_PDF_417":
                        options.setMicroPDF417Enable(true);
                        break;
                    case "Micro_QR":
                        options.setMicroQREnable(true);
                        break;
                    case "QR_CODE":
                        options.setQrCodeEnable(true);
                        break;
                    case "PDF417":
                        options.setPdf417Enable(true);
                        break;
                    case "DATA_MATRIX":
                        options.setDataMatrixEnable(true);
                        break;
                    case "AZTEC":
                        options.setAztecEnable(true);
                        break;
                    case "Hanxin":
                        options.setHanxinEnable(true);
                        break;
                }
            }
        }

        //Note: for the older version SunmiScanner v1.x.x
        Intent intent = new Intent("com.summi.scan");

        //Note: if the device has ScannerHead v4.4.4 and above versions
        if (implementation.hasScanner(getContext())) {
            intent.setAction("com.sunmi.scanner.qrscanner");
        }

        intent.putExtra("PLAY_SOUND", options.isPlaySound());
        intent.putExtra("PLAY_VIBRATE", options.isPlayVibrate());
        intent.putExtra("IDENTIFY_MORE_CODE", options.isIdentifyMoreCode());
        intent.putExtra("IS_SHOW_SETTING", options.isShowSetting());
        intent.putExtra("IS_SHOW_ALBUM", options.isShowAlbum());
        intent.putExtra("IDENTIFY_INVERSE", options.isIdentifyInverse());
        intent.putExtra("IS_EAN_8_ENABLE", options.isEan8Enable());
        intent.putExtra("IS_UPC_E_ENABLE", options.isUpcEEnable());
        intent.putExtra("IS_ISBN_10_ENABLE", options.isIsbn10Enable());
        intent.putExtra("IS_CODE_11_ENABLE", options.isCode11Enable());
        intent.putExtra("IS_UPC_A_ENABLE", options.isUpcAEnable());
        intent.putExtra("IS_EAN_13_ENABLE", options.isEan13Enable());
        intent.putExtra("IS_ISBN_13_ENABLE", options.isIsbn13Enable());
        intent.putExtra("IS_INTERLEAVED_2_OF_5_ENABLE", options.isInterleaved2of5Enable());
        intent.putExtra("IS_CODE_128_ENABLE", options.isCode128Enable());
        intent.putExtra("IS_CODABAR_ENABLE", options.isCodabarEnable());
        intent.putExtra("IS_CODE_39_ENABLE", options.isCode39Enable());
        intent.putExtra("IS_CODE_93_ENABLE", options.isCode93Enable());
        intent.putExtra("IS_DATABAR_ENABLE", options.isDatabarEnable());
        intent.putExtra("IS_DATABAR_EXP_ENABLE", options.isDatabarExpEnable());
        intent.putExtra("IS_Micro_PDF417_ENABLE", options.isMicroPDF417Enable());
        intent.putExtra("IS_MicroQR_ENABLE", options.isMicroQREnable());
        intent.putExtra("IS_OPEN_LIGHT", options.isOpenLight());
        intent.putExtra("SCAN_MODE", options.isScanMode());
        intent.putExtra("IS_QR_CODE_ENABLE", options.isQrCodeEnable());
        intent.putExtra("IS_PDF417_ENABLE", options.isPdf417Enable());
        intent.putExtra("IS_DATA_MATRIX_ENABLE", options.isDataMatrixEnable());
        intent.putExtra("IS_AZTEC_ENABLE", options.isAztecEnable());
        intent.putExtra("IS_Hanxin_ENABLE", options.isHanxinEnable());

        startActivityForResult(call, intent, "scanResult");
    }

    @ActivityCallback
    public void scanResult(PluginCall call, ActivityResult result) {
        if (call == null)   {
            return;
        }
        if (result.getResultCode() == RESULT_OK) {
            Intent data = result.getData();
            if (data == null) {
                call.reject("No data found");
                return;
            }

            Bundle bundle = data.getExtras();
            if (bundle == null) {
                call.reject("No extras found");
                return;
            }

            ArrayList<HashMap<String, Object>> results =
                    (ArrayList<HashMap<String, Object>>) bundle.getSerializable("data");
            if (results == null || results.isEmpty()) {
                call.reject("Problem with serializing data");
                return;
            }

            HashMap<String, Object> firstResult = results.get(0);
            String type = firstResult.get("TYPE") != null ? firstResult.get("TYPE").toString() : "";
            String value = firstResult.get("VALUE") != null ? firstResult.get("VALUE").toString() : "";

            JSObject ret = new JSObject();
            ret.put("value", value);
            ret.put("type", type);
            call.resolve(ret);
        } else {
            call.reject("User cancelled scan");
        }
    }
}
