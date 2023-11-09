package com.example.designpattern.memento;

import com.example.designpattern.BaseServiceRunner;

public class MementoPatternService implements BaseServiceRunner{

    @Override
    public void run() {
        var editor = new Editor();
        var history = new History();

        editor.setContent("Step 1");
        history.push(editor.createState());

        editor.setContent("Step 2");
        history.push(editor.createState());
        
        editor.setContent("Step 3");
        history.push(editor.createState());
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println("Currently at: Step " + history.getCurrentStep());
    }
    
}
