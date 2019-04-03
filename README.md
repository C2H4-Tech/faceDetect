<img src="logo.png" alt="Overview" width="10%" height="10%"> 
# 以息科技人脸识别安卓库
[![996.icu](https://img.shields.io/badge/link-996.icu-red.svg)](https://996.icu)
[![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg)](https://github.com/996icu/996.ICU/blob/master/LICENSE)

以息科技现提供在手机端利用深度学习进行[人脸识别和关键点定位(MTCNN)](https://arxiv.org/abs/1604.02878)的安卓库。深度学习的计算框架利用[腾讯ncnn](https://github.com/Tencent/ncnn)。该项目参考ElegantGod的[Repo](https://github.com/ElegantGod/ncnn)并在P-net, R-net和O-net所需的CNN处理线程做了优化。利用Android NDK对MTCNN的C++代码进行编译生成动态库并且包含部分OpenCV和ncnn的静态库。这个安卓库的文件大小在3.9MB左右 并且 支持 armeabi and armeabi-v7a CPU。此人脸识别算法在搭载 联发科 MT6755 CPU(2.0GHZ)的手机上处理每帧图片所需时长平均是30-60ms。

C2H4 Tech is pleased to offer the out-of-box android libeary for Joint Face Detection and Alignment using [Multi-task Cascaded Convolutional Neural Networks](https://arxiv.org/abs/1604.02878). 
This dynamic library used in the library is developed by compiling C++ codes using Android NDK, which incorporates some static libraries from opencv and [ncnn](https://github.com/Tencent/ncnn). The size of dymamic library and cnn weights are  3.9MB and supports armeabi and armeabi-v7a CPUs. Our tests show that this face detection algorithm can prcess one frame in 30-60ms using the phone with MediaTek MT6755 CPU(2.0GHZ). 

<p align="center">
<img src="demo.gif" alt="Overview" width="40%" height="40%">
</p>

## faceDetect

#### Add dependencies
dependencies{
   compile 'com.github.C2H4-Tech:faceDetect:1.0'
}

allprojects {
    repositories {
        maven {
            url "https://jitpack.io"
        }
    }
}

#### Initalize the face detector
DetectManager.init(context);

#### Supplied methods

Tips: All below methods return object Bbox which contains eyedistance, 5 points and top left bottom right coordinates of  bounding box.

1.Detect(int width, int height, byte[] NV21FrameData)

This method can be used for situation on which call onPreviewFrame(byte[] data, Camera camera) when camera is in state of preview.Detecting face information from every camera buffer.

2.DetectImage(Bitmap bitmap)

Suit for detecting face information from bitmap.

# ncnn

[![License](https://img.shields.io/badge/license-BSD--3--Clause-blue.svg)](https://raw.githubusercontent.com/Tencent/ncnn/master/LICENSE.txt) 
[![Build Status](https://travis-ci.org/Tencent/ncnn.svg?branch=master)](https://travis-ci.org/Tencent/ncnn)


ncnn is a high-performance neural network inference computing framework optimized for mobile platforms. ncnn is deeply considerate about deployment and uses on mobile phones from the beginning of design. ncnn does not have third party dependencies, it is cross-platform, and runs faster than all known open source frameworks on mobile phone cpu. Developers can easily deploy deep learning algorithm models to the mobile platform by using efficient ncnn implementation, create intelligent APPs, and bring the artificial intelligence to your fingertips. ncnn is currently being used in many Tencent applications, such as QQ, Qzone, WeChat, Pitu and so on.

ncnn 是一个为手机端极致优化的高性能神经网络前向计算框架。ncnn 从设计之初深刻考虑手机端的部署和使用。无第三方依赖，跨平台，手机端 cpu 的速度快于目前所有已知的开源框架。基于 ncnn，开发者能够将深度学习算法轻松移植到手机端高效执行，开发出人工智能 APP，将 AI 带到你的指尖。ncnn 目前已在腾讯多款应用中使用，如 QQ，Qzone，微信，天天P图等。

---

### HowTo

[how-to-build-ncnn-library](https://github.com/Tencent/ncnn/wiki/how-to-build)

[how-to-use-ncnn-with-alexnet](https://github.com/Tencent/ncnn/wiki/how-to-use-ncnn-with-alexnet)

[ncnn 组件使用指北 alexnet](https://github.com/Tencent/ncnn/wiki/ncnn-%E7%BB%84%E4%BB%B6%E4%BD%BF%E7%94%A8%E6%8C%87%E5%8C%97-alexnet)

---

### Features

* Supports convolution neural networks, supports multiple input and multi-branch structure, can calculate part of the branch
* No third-party library dependencies, does not rely on BLAS / NNPACK or any other computing framework
* Pure C ++ implementation, cross-platform, supports android, ios and so on
* ARM NEON assembly level of careful optimization, calculation speed is extremely high
* Sophisticated memory management and data structure design, very low memory footprint
* Supports multi-core parallel computing acceleration, ARM big.LITTLE cpu scheduling optimization
* The overall library size is less than 500K, and can be easily reduced to less than 300K
* Extensible model design, supports 8bit quantization and half-precision floating point storage, can import caffe models
* Support direct memory zero copy reference load network model
* Can be registered with custom layer implementation and extended
* Well, it is strong, not afraid of being stuffed with 卷   QvQ

### 功能概述

* 支持卷积神经网络，支持多输入和多分支结构，可计算部分分支
* 无任何第三方库依赖，不依赖 BLAS/NNPACK 等计算框架
* 纯 C++ 实现，跨平台，支持 android ios 等
* ARM NEON 汇编级良心优化，计算速度极快
* 精细的内存管理和数据结构设计，内存占用极低
* 支持多核并行计算加速，ARM big.LITTLE cpu 调度优化
* 整体库体积小于 500K，并可轻松精简到小于 300K
* 可扩展的模型设计，支持 8bit 量化和半精度浮点存储，可导入 caffe 模型
* 支持直接内存零拷贝引用加载网络模型
* 可注册自定义层实现并扩展
* 恩，很强就是了，不怕被塞卷 QvQ

---

### License

BSD 3 Clause
