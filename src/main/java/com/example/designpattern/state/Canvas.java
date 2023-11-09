package com.example.designpattern.state;

public class Canvas {
    private Tool currentTool;

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseDown() {
        // if (currentTool == ToolType.SELECTION)
        //     System.out.println("SELECTION icon");
        // else if (currentTool == ToolType.BRUSH)
        //     System.out.println("BRUSH icon");
        // else if (currentTool == ToolType.ERASER)
        //     System.out.println("ERASER icon");
        currentTool.mouseDown();
    }
    
    public void mouseUp() {
        // if (currentTool == ToolType.SELECTION)
        //     System.out.println("SELECTION function");
        // else if (currentTool == ToolType.BRUSH)
        //     System.out.println("BRUSH function");
        // else if (currentTool == ToolType.ERASER)
        //     System.out.println("ERASER function");
        currentTool.mouseUp();
    }
}
