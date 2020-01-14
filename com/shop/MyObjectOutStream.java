package com.shop;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutStream extends ObjectOutputStream {
    public MyObjectOutStream(OutputStream out) throws IOException {
        super(out);
    }

    public void writeStreamHeader() throws IOException{
        return;
    }

}
