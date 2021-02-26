package com.cours.jonas;

import java.util.List;

public interface Element {
    List<? extends Element> listElement();
    String getName();
}
