package org.vaadin.firitin.components;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridSelectionModel;
import org.vaadin.firitin.fluency.ui.FluentFocusable;
import org.vaadin.firitin.fluency.ui.FluentHasDataProvider;
import org.vaadin.firitin.fluency.ui.FluentHasSize;
import org.vaadin.firitin.fluency.ui.FluentHasStyle;

public class VGrid<T> extends Grid<T>
        implements FluentHasDataProvider<VGrid<T>, T>, FluentHasStyle<VGrid<T>>, FluentHasSize<VGrid<T>>,
        FluentFocusable<Grid<T>, VGrid<T>> {

    public VGrid() {
        super();
    }

    public VGrid(int pageSize) {
        super(pageSize);
    }

    public VGrid(Class<T> beanType) {
        super(beanType);
    }

    public VGrid<T> withSelectionMode(Grid.SelectionMode selectionMode) {
        setSelectionMode(selectionMode);
        return this;
    }

    public VGrid<T> withSelectionModel(GridSelectionModel<T> selectionModel, Grid.SelectionMode selectionMode) {
        setSelectionModel(selectionModel, selectionMode);
        return this;
    }
}
