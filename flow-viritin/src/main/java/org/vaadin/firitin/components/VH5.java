package org.vaadin.firitin.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.H5;
import org.vaadin.firitin.fluency.ui.FluentClickNotifierWithoutTypedSource;
import org.vaadin.firitin.fluency.ui.FluentHtmlContainer;

public class VH5 extends H5 implements FluentHtmlContainer<VH5>, FluentClickNotifierWithoutTypedSource<VH5> {
    public VH5() {
        super();
    }

    public VH5(Component... components) {
        super(components);
    }

    public VH5(String text) {
        super(text);
    }
}
