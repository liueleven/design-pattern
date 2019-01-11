package com.liuleven.designpattern.headfirst.decorate.lower;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-10 17:33
 * @author: 十一
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }


    @Override
    public int read() throws IOException{
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] b ,int offset, int len) throws IOException{
        int result = super.read(b,offset,len);
        for(int i=offset; i<b.length; i++) {
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
