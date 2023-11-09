package com.example.designpattern.state;

public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("SELECTION icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
    
}
