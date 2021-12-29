package com.design_pattern.structural_pattern.decorator_pattern;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClientTest {
    /*
    装饰器模式在 Java 语言中的最著名的应用莫过于 Java I/O 标准库的设计了。例如，InputStream 的子类 FilterInputStream，OutputStream 的子类 FilterOutputStream，Reader 的子类 BufferedReader 以及 FilterReader，还有 Writer 的子类 BufferedWriter、FilterWriter 以及 PrintWriter 等，它们都是抽象装饰类。

下面代码是为 FileReader 增加缓冲区而采用的装饰类 BufferedReader 的例子：
纯文本复制
BufferedReader in = new BufferedReader(new FileReader("filename.txt"));
String s = in.readLine();
     */
    public static void main(String[] args) throws IOException {
        BumbleBee bumbleBee =new OriginalType();
        bumbleBee.transformance();
        BumbleBee bumbleBee1=new CarType(bumbleBee);
        bumbleBee1.transformance();
        BufferedReader in = new BufferedReader(new FileReader("filename.txt"));
        String s = in.readLine();
    }
}
