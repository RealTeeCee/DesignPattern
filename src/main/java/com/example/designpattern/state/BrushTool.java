package com.example.designpattern.state;

public class BrushTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("BRUSH icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
    
}
