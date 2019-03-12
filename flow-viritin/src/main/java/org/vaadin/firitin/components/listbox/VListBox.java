package org.vaadin.firitin.components.listbox;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.function.SerializablePredicate;
import org.vaadin.firitin.components.VComboBox;
import org.vaadin.firitin.fluency.ui.*;

public class VListBox<T> extends ListBox<T> implements FluentComponent<VListBox<T>>, FluentHasStyle<VListBox<T>>, FluentHasDataProvider<VListBox<T>, T>,
        FluentHasSize<VComboBox<T>>, FluentHasItems<VListBox<T>, T>, FluentFocusable<ListBox<T>, VListBox<T>>, FluentHasValueAndElement<VListBox<T>, AbstractField.ComponentValueChangeEvent<ListBox<T>, T>, T> {


    public VListBox withRenderer(
            ComponentRenderer<? extends Component, T> itemRenderer) {
        setRenderer(itemRenderer);
        return this;
    }

    public VListBox withItemEnabledProvider(
            SerializablePredicate<T> itemEnabledProvider) {
        setItemEnabledProvider(itemEnabledProvider);
        return this;
    }
}
