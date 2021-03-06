package com.example.ignacio.testdesfire;

/**
 * Keys used by the Sample Application are declared here.
 * Created by nxp69547 on 8/3/2016.
 */
public final class SampleAppKeys {

    /**
     * Default key with Value FF.
     */
    public static final byte[] KEY_DEFAULT_FF = {(byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
    /**
     * 16 bytes AES128 Key.
     */
    public static final byte[] KEY_AES128 = {(byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
    /**
     * 16 bytes AES128 Key.
     */
    public static final byte[] KEY_AES128_ZEROS = {(byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00};
    /**
     * 16 bytes AES128 Key.
     */
    public static final byte[] KEY_AES128_ONES = {(byte) 0x11, (byte) 0x11,
            (byte) 0x11, (byte) 0x11, (byte) 0x11, (byte) 0x11, (byte) 0x11,
            (byte) 0x11, (byte) 0x11, (byte) 0x11, (byte) 0x11, (byte) 0x11,
            (byte) 0x11, (byte) 0x11, (byte) 0x11, (byte) 0x11};
    /**
     * 16 bytes AES128 Key.
     */
    public static final byte[] KEY_AES128_TWOS = {(byte) 0x22, (byte) 0x22,
            (byte) 0x22, (byte) 0x22, (byte) 0x22, (byte) 0x22, (byte) 0x22,
            (byte) 0x22, (byte) 0x22, (byte) 0x22, (byte) 0x22, (byte) 0x22,
            (byte) 0x22, (byte) 0x22, (byte) 0x22, (byte) 0x22};
    /**
     * 24 bytes 2KTDES Key.
     */
    public static final byte[] KEY_2KTDES = {(byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00};
    /**
     * 16 bytes 2KTDES_ULC Key.
     */
    public static final byte[] KEY_2KTDES_ULC = {(byte) 0x49, (byte) 0x45,
            (byte) 0x4D, (byte) 0x4B, (byte) 0x41, (byte) 0x45, (byte) 0x52,
            (byte) 0x42, (byte) 0x21, (byte) 0x4E, (byte) 0x41, (byte) 0x43,
            (byte) 0x55, (byte) 0x4F, (byte) 0x59, (byte) 0x46};

    /**
     * Private constructor restricts Implementation.
     */
    private SampleAppKeys() {

    }

    /**
     * Only these types of Keys can be stored by the Helper class.
     */
    public static enum EnumKeyType {
        EnumAESKey,
        EnumDESKey,
        EnumMifareKey
    }
}
