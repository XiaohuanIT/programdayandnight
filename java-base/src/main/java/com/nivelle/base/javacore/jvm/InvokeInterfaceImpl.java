package com.nivelle.base.javacore.jvm;

/**
 * TODO:DOCUMENT ME!
 *
 * @author nivell
 * @date 2020/03/25
 */
public class InvokeInterfaceImpl implements InvokeInterface {

    @Override
    public void invokeInterface() {
        System.out.println("invokeInterface =>invokeInterface");
    }

    public void invokeNormalMethod() {
        System.out.println("invokeNormalMethod=>invokeVirtual");
    }

    public static void invokeStaticMethod() {
        System.out.println("invokeStaticMethod=>invokeStatic");
    }


}
