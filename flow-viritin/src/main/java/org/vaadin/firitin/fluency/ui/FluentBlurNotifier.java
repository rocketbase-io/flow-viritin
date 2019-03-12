package org.vaadin.firitin.fluency.ui;

import com.vaadin.flow.component.BlurNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;

public interface FluentBlurNotifier<T extends Component, S extends FluentBlurNotifier<T, S>> extends BlurNotifier<T> {

    @SuppressWarnings("unchecked")
    default S withBlurListener(ComponentEventListener<BlurEvent<T>> listener) {
        addBlurListener(listener);
        return (S) this;
    }
}
