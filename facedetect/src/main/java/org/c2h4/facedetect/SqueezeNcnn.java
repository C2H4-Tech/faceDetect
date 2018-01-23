// Tencent is pleased to support the open source community by making ncnn available.
//
// Copyright (C) 2017 THL A29 Limited, a Tencent company. All rights reserved.
//
// Licensed under the BSD 3-Clause License (the "License"); you may not use this file except
// in compliance with the License. You may obtain a copy of the License at
//
// https://opensource.org/licenses/BSD-3-Clause
//
// Unless required by applicable law or agreed to in writing, software distributed
// under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
// CONDITIONS OF ANY KIND, either express or implied. See the License for the
// specific language governing permissions and limitations under the License.

package org.c2h4.facedetect;

import android.graphics.Bitmap;

public class SqueezeNcnn
{
    public native boolean Init(byte[] param1, byte[] bin1, byte[] param2, byte[] bin2, byte[] param3, byte[] bin3);

//    public native Bbox Detect(int width, int height, byte[] NV21FrameData);
//    public native Bbox DetectImg(Bitmap bitmap);
    public native float Detect(int width, int height, byte[] NV21FrameData);
    public native float DetectImg(Bitmap bitmap);


    static {
        System.loadLibrary("squeezencnn");
    }
}

