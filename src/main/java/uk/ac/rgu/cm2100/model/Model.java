/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Provides a base class for MVC models, adding PropertyChangeSupport
 * @author mark
 * Edited by: Teodora Kis 1804944
 */
public abstract class Model {
    
    private final PropertyChangeSupport pcs;
    
    public Model(){
        this.pcs = new PropertyChangeSupport(this);
    }
    
    public final void addPropertyChangeListener(PropertyChangeListener listener){
        this.pcs.addPropertyChangeListener(listener);
    }
    protected final void firePropertyChange(String name){
        PropertyChangeEvent evt = new PropertyChangeEvent(this, name, null, null);
        this.pcs.firePropertyChange(evt);
    }
}
