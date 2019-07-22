package com.j11.main;

import com.j11.exports.Exports;

import java.lang.reflect.InvocationTargetException;
//import com.j11.open.Open;

public class Main {
    public static void main(String[] args) {
        Exports exports = new Exports();
        exports.export();

        try {
            Class<?> name = Class.forName("com.j11.open.Open");
            System.out.println(name);
            Object open = name.getDeclaredConstructor().newInstance();
            System.out.println(open);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

//        Open open;
    }
}
