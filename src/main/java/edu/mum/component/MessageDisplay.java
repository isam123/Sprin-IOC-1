package edu.mum.component;

import org.springframework.stereotype.Service;

import java.io.IOException;

public interface MessageDisplay {
    void display() throws IOException;
     MessageOrigin getMessageSource();
}
