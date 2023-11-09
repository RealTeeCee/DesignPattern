package com.example.designpattern.memento;

public class EditorState {
    private final String content;

    public String getContent() {
        return content;
    }

    public EditorState(String content) {
        this.content = content;
    }
}
