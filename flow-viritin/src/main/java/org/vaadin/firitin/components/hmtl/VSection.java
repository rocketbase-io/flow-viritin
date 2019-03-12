package org.vaadin.firitin.components.hmtl;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.Section;
import org.vaadin.firitin.fluency.ui.FluentClickNotifierWithoutTypedSource;
import org.vaadin.firitin.fluency.ui.FluentHtmlContainer;

public class VSection extends Section implements FluentHtmlContainer<VSection>, FluentClickNotifierWithoutTypedSource<VSection> {

    public VSection() {
        super();
    }

    public VSection(Component... components) {
        super(components);
    }

}
