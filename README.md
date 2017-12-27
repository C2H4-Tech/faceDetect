# faceDetect

# add dependencies
add compile 'com.github.C2H4-Tech:faceDetect:1.0'

# init
DetectManager.init(context)

# supply methods

Tips:all below methods return object Bbox which contains eyedistance、5 points and  one bound 

1.Detect(int width, int height, byte[] NV21FrameData)

this method can be used for situation which call onPreviewFrame(byte[] data, Camera camera) when camera is in state of preview.Detecting face information from every camera buffer

2.DetectImage(Bitmap bitmap)

suit for detecting face information from bitmap
