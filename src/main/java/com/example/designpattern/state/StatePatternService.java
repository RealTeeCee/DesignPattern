package com.example.designpattern.state;

import com.example.designpattern.BaseServiceRunner;

public class StatePatternService implements BaseServiceRunner{

    @Override
    public void run() {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
    
}
