package org.c2h4.facedetect;

/**
 * Created by jinjunjie on 11/29/17.
 */

public class Bbox {
    public float score;
    public float x1;
    public float y1;
    public float x2;
    public float y2;
    public float eyeDistance;

    float ppoints[] = new float[10];

    Bbox() {
    }
}
