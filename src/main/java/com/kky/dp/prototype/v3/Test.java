package com.kky.dp.prototype.v3;

/*
String 类型直接克隆。
StringBuffer 和 StringBuilder 类型需要特殊处理。
 */
public class Test {
    public static void main(String[] args) throws Exception {
        StringTest test1 = new StringTest(
                new String("abc"), new StringBuffer("abc"), new StringBuilder("abc"));
        StringTest test2 = (StringTest) test1.clone();

        test1.str1 = "cba";
        System.out.println(test2.str1);

        test1.str2.reverse();
        System.out.println(test2.str2);

        test1.str3.reverse();
        System.out.println(test2.str3);
    }
}

class StringTest implements Cloneable {
    String str1;
    StringBuffer str2;
    StringBuilder str3;

    public StringTest(String str1, StringBuffer str2, StringBuilder str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

        //return new StringTest(this.str1, new StringBuffer(this.str2), new StringBuilder(this.str3));
    }
}
