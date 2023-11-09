package com.example.designpattern.state;

public class EraserTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("ERASER icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase line");
    }

    
}
