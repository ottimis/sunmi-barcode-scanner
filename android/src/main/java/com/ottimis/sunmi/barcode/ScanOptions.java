package com.ottimis.sunmi.barcode;

import android.content.Intent;

public class ScanOptions {

    private boolean playSound = true;               // default true
    private boolean playVibrate = false;            // default false
    private boolean identifyMoreCode = false;       // default false
    private boolean isShowSetting = true;           // default true
    private boolean isShowAlbum = true;             // default true
    private boolean identifyInverse = false;         // default false
    private boolean isEan8Enable = false;            // default false
    private boolean isUpcEEnable = false;            // default false
    private boolean isIsbn10Enable = false;         // default false
    private boolean isCode11Enable = false;          // default false
    private boolean isUpcAEnable = false;            // default false
    private boolean isEan13Enable = false;           // default false
    private boolean isIsbn13Enable = false;          // default false
    private boolean isInterleaved2of5Enable = false;   // default false
    private boolean isCode128Enable = false;         // default false
    private boolean isCodabarEnable = false;         // default false
    private boolean isCode39Enable = false;          // default false
    private boolean isCode93Enable = false;          // default false
    private boolean isDatabarEnable = false;         // default false
    private boolean isDatabarExpEnable = false;      // default false
    private boolean isMicroPDF417Enable = false;     // default false
    private boolean isMicroQREnable = false;         // default false
    private boolean isOpenLight = false;             // default false
    private boolean scanMode = false;               // default false
    private boolean isQrCodeEnable = false;          // default false
    private boolean isPdf417Enable = false;          // default false
    private boolean isDataMatrixEnable = false;      // default false
    private boolean isAztecEnable = false;           // default false
    private boolean isHanxinEnable = false;         // default false

    // Default constructor
    public ScanOptions() { }

    // Constructor from Intent
    public ScanOptions(Intent intent) {
        this.playSound = intent.getBooleanExtra("PLAY_SOUND", true);
        this.playVibrate = intent.getBooleanExtra("PLAY_VIBRATE", false);
        this.identifyMoreCode = intent.getBooleanExtra("IDENTIFY_MORE_CODE", false);
        this.isShowSetting = intent.getBooleanExtra("IS_SHOW_SETTING", true);
        this.isShowAlbum = intent.getBooleanExtra("IS_SHOW_ALBUM", true);
        this.identifyInverse = intent.getBooleanExtra("IDENTIFY_INVERSE", true);
        this.isEan8Enable = intent.getBooleanExtra("IS_EAN_8_ENABLE", true);
        this.isUpcEEnable = intent.getBooleanExtra("IS_UPC_E_ENABLE", true);
        this.isIsbn10Enable = intent.getBooleanExtra("IS_ISBN_10_ENABLE", false);
        this.isCode11Enable = intent.getBooleanExtra("IS_CODE_11_ENABLE", true);
        this.isUpcAEnable = intent.getBooleanExtra("IS_UPC_A_ENABLE", true);
        this.isEan13Enable = intent.getBooleanExtra("IS_EAN_13_ENABLE", true);
        this.isIsbn13Enable = intent.getBooleanExtra("IS_ISBN_13_ENABLE", true);
        this.isInterleaved2of5Enable = intent.getBooleanExtra("IS_INTERLEAVED_2_OF_5_ENABLE", true);
        this.isCode128Enable = intent.getBooleanExtra("IS_CODE_128_ENABLE", true);
        this.isCodabarEnable = intent.getBooleanExtra("IS_CODABAR_ENABLE", true);
        this.isCode39Enable = intent.getBooleanExtra("IS_CODE_39_ENABLE", true);
        this.isCode93Enable = intent.getBooleanExtra("IS_CODE_93_ENABLE", true);
        this.isDatabarEnable = intent.getBooleanExtra("IS_DATABAR_ENABLE", true);
        this.isDatabarExpEnable = intent.getBooleanExtra("IS_DATABAR_EXP_ENABLE", true);
        this.isMicroPDF417Enable = intent.getBooleanExtra("IS_Micro_PDF417_ENABLE", true);
        this.isMicroQREnable = intent.getBooleanExtra("IS_MicroQR_ENABLE", true);
        this.isOpenLight = intent.getBooleanExtra("IS_OPEN_LIGHT", true);
        this.scanMode = intent.getBooleanExtra("SCAN_MODE", false);
        this.isQrCodeEnable = intent.getBooleanExtra("IS_QR_CODE_ENABLE", true);
        this.isPdf417Enable = intent.getBooleanExtra("IS_PDF417_ENABLE", true);
        this.isDataMatrixEnable = intent.getBooleanExtra("IS_DATA_MATRIX_ENABLE", true);
        this.isAztecEnable = intent.getBooleanExtra("IS_AZTEC_ENABLE", true);
        this.isHanxinEnable = intent.getBooleanExtra("IS_Hanxin_ENABLE", false);
    }

    // Getters and Setters
    public boolean isPlaySound() { return playSound; }
    public void setPlaySound(boolean playSound) { this.playSound = playSound; }

    public boolean isPlayVibrate() { return playVibrate; }
    public void setPlayVibrate(boolean playVibrate) { this.playVibrate = playVibrate; }

    public boolean isIdentifyMoreCode() { return identifyMoreCode; }
    public void setIdentifyMoreCode(boolean identifyMoreCode) { this.identifyMoreCode = identifyMoreCode; }

    public boolean isShowSetting() { return isShowSetting; }
    public void setShowSetting(boolean isShowSetting) { this.isShowSetting = isShowSetting; }

    public boolean isShowAlbum() { return isShowAlbum; }
    public void setShowAlbum(boolean isShowAlbum) { this.isShowAlbum = isShowAlbum; }

    public boolean isIdentifyInverse() { return identifyInverse; }
    public void setIdentifyInverse(boolean identifyInverse) { this.identifyInverse = identifyInverse; }

    public boolean isEan8Enable() { return isEan8Enable; }
    public void setEan8Enable(boolean isEan8Enable) { this.isEan8Enable = isEan8Enable; }

    public boolean isUpcEEnable() { return isUpcEEnable; }
    public void setUpcEEnable(boolean isUpcEEnable) { this.isUpcEEnable = isUpcEEnable; }

    public boolean isIsbn10Enable() { return isIsbn10Enable; }
    public void setIsbn10Enable(boolean isIsbn10Enable) { this.isIsbn10Enable = isIsbn10Enable; }

    public boolean isCode11Enable() { return isCode11Enable; }
    public void setCode11Enable(boolean isCode11Enable) { this.isCode11Enable = isCode11Enable; }

    public boolean isUpcAEnable() { return isUpcAEnable; }
    public void setUpcAEnable(boolean isUpcAEnable) { this.isUpcAEnable = isUpcAEnable; }

    public boolean isEan13Enable() { return isEan13Enable; }
    public void setEan13Enable(boolean isEan13Enable) { this.isEan13Enable = isEan13Enable; }

    public boolean isIsbn13Enable() { return isIsbn13Enable; }
    public void setIsbn13Enable(boolean isIsbn13Enable) { this.isIsbn13Enable = isIsbn13Enable; }

    public boolean isInterleaved2of5Enable() { return isInterleaved2of5Enable; }
    public void setInterleaved2of5Enable(boolean isInterleaved2of5Enable) { this.isInterleaved2of5Enable = isInterleaved2of5Enable; }

    public boolean isCode128Enable() { return isCode128Enable; }
    public void setCode128Enable(boolean isCode128Enable) { this.isCode128Enable = isCode128Enable; }

    public boolean isCodabarEnable() { return isCodabarEnable; }
    public void setCodabarEnable(boolean isCodabarEnable) { this.isCodabarEnable = isCodabarEnable; }

    public boolean isCode39Enable() { return isCode39Enable; }
    public void setCode39Enable(boolean isCode39Enable) { this.isCode39Enable = isCode39Enable; }

    public boolean isCode93Enable() { return isCode93Enable; }
    public void setCode93Enable(boolean isCode93Enable) { this.isCode93Enable = isCode93Enable; }

    public boolean isDatabarEnable() { return isDatabarEnable; }
    public void setDatabarEnable(boolean isDatabarEnable) { this.isDatabarEnable = isDatabarEnable; }

    public boolean isDatabarExpEnable() { return isDatabarExpEnable; }
    public void setDatabarExpEnable(boolean isDatabarExpEnable) { this.isDatabarExpEnable = isDatabarExpEnable; }

    public boolean isMicroPDF417Enable() { return isMicroPDF417Enable; }
    public void setMicroPDF417Enable(boolean isMicroPDF417Enable) { this.isMicroPDF417Enable = isMicroPDF417Enable; }

    public boolean isMicroQREnable() { return isMicroQREnable; }
    public void setMicroQREnable(boolean isMicroQREnable) { this.isMicroQREnable = isMicroQREnable; }

    public boolean isOpenLight() { return isOpenLight; }
    public void setOpenLight(boolean isOpenLight) { this.isOpenLight = isOpenLight; }

    public boolean isScanMode() { return scanMode; }
    public void setScanMode(boolean scanMode) { this.scanMode = scanMode; }

    public boolean isQrCodeEnable() { return isQrCodeEnable; }
    public void setQrCodeEnable(boolean isQrCodeEnable) { this.isQrCodeEnable = isQrCodeEnable; }

    public boolean isPdf417Enable() { return isPdf417Enable; }
    public void setPdf417Enable(boolean isPdf417Enable) { this.isPdf417Enable = isPdf417Enable; }

    public boolean isDataMatrixEnable() { return isDataMatrixEnable; }
    public void setDataMatrixEnable(boolean isDataMatrixEnable) { this.isDataMatrixEnable = isDataMatrixEnable; }

    public boolean isAztecEnable() { return isAztecEnable; }
    public void setAztecEnable(boolean isAztecEnable) { this.isAztecEnable = isAztecEnable; }

    public boolean isHanxinEnable() { return isHanxinEnable; }
    public void setHanxinEnable(boolean isHanxinEnable) { this.isHanxinEnable = isHanxinEnable; }
}