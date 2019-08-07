/*
 * Copyright 2019 Viritin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.firitin;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import org.vaadin.firitin.components.Tree;
import org.vaadin.firitin.components.Tree.TreeItem;

/**
 *
 * @author mstahv
 */
@Route
public class TreeExampleView extends VerticalLayout {
    
    public TreeExampleView() {
        
        Tree tree = new Tree();
        Tree.TreeItem child = tree.addChild(new Span("Moro"));
        TreeItem poro = child.addChild(new Span("Poro!"));
        
        poro.addChild(new Span("Vasa"));
        
        add(tree);
        
    }
    
}
