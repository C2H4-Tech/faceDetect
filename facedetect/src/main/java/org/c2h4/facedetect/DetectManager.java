package org.c2h4.facedetect;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lixuekang on 2017/12/27.
 */

public class DetectManager {
    static {
        System.loadLibrary("squeezencnn");
    }

    private static SqueezeNcnn mSqueezeNcnn = new SqueezeNcnn();

    public static void init(Context context) {
        byte[] param1 = null;
        byte[] bin1 = null;
        byte[] param2 = null;
        byte[] bin2 = null;
        byte[] param3 = null;
        byte[] bin3 = null;
        byte[] param4 = null;
        byte[] bin4 = null;
        AssetManager assetManager = context.getAssets();
        try {
            {
                InputStream assetsInputStream = null;
                assetsInputStream = assetManager.open("det1.param.bin");
                int available = assetsInputStream.available();
                param1 = new byte[available];
                int byteCode = assetsInputStream.read(param1);
                assetsInputStream.close();
            }
            {
                InputStream assetsInputStream = assetManager.open("det2.param.bin");
                int available = assetsInputStream.available();
                param2 = new byte[available];
                int byteCode = assetsInputStream.read(param2);
                assetsInputStream.close();
            }
            {
                InputStream assetsInputStream = assetManager.open("det3.param.bin");
                int available = assetsInputStream.available();
                param3 = new byte[available];
                int byteCode = assetsInputStream.read(param3);
                assetsInputStream.close();
            }
            {
                InputStream assetsInputStream = assetManager.open("eye.param");
                int available = assetsInputStream.available();
                param4 = new byte[available];
                int byteCode = assetsInputStream.read(param4);
                assetsInputStream.close();
            }
            {
                InputStream assetsInputStream = assetManager.open("det1.bin");
                int available = assetsInputStream.available();
                bin1 = new byte[available];
                int byteCode = assetsInputStream.read(bin1);
                assetsInputStream.close();
            }
            {
                InputStream assetsInputStream = assetManager.open("det2.bin");
                int available = assetsInputStream.available();
                bin2 = new byte[available];
                int byteCode = assetsInputStream.read(bin2);
                assetsInputStream.close();
            }
            {
                InputStream assetsInputStream = assetManager.open("det3.bin");
                int available = assetsInputStream.available();
                bin3 = new byte[available];
                int byteCode = assetsInputStream.read(bin3);
                assetsInputStream.close();
            }
            {
                InputStream assetsInputStream = assetManager.open("eye.bin");
                int available = assetsInputStream.available();
                bin4 = new byte[available];
                int byteCode = assetsInputStream.read(bin3);
                assetsInputStream.close();
            }
            mSqueezeNcnn.Init(param1, bin1, param2, bin2, param3, bin3, param4, bin4);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static float[] Detect(int width, int height, byte[] NV21FrameData) {
        return mSqueezeNcnn.Detect(width, height, NV21FrameData);
    }

    public static float DetectImage(Bitmap bitmap) {
        return mSqueezeNcnn.DetectImg(bitmap);
    }
}
