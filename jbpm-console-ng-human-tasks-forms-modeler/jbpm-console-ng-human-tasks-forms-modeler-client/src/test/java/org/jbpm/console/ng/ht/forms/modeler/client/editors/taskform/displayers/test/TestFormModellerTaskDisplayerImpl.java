/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.console.ng.ht.forms.modeler.client.editors.taskform.displayers.test;

import javax.enterprise.event.Event;

import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.security.shared.api.identity.User;
import org.jbpm.console.ng.ga.forms.display.view.FormContentResizeListener;
import org.jbpm.console.ng.gc.forms.client.display.displayers.util.JSNIHelper;
import org.jbpm.console.ng.ht.forms.modeler.client.editors.taskform.displayers.FormModellerTaskDisplayerImpl;
import org.jbpm.console.ng.ht.forms.modeler.display.impl.FormModelerFormRenderingSettings;
import org.jbpm.console.ng.ht.forms.modeler.service.FormModelerProcessStarterEntryPoint;
import org.jbpm.console.ng.ht.model.events.TaskRefreshedEvent;
import org.jbpm.console.ng.ht.service.TaskService;
import org.jbpm.formModeler.renderer.client.FormRendererWidget;

public class TestFormModellerTaskDisplayerImpl extends FormModellerTaskDisplayerImpl {

    public TestFormModellerTaskDisplayerImpl( FormRendererWidget formRenderer, Caller<FormModelerProcessStarterEntryPoint> renderContextServices ) {
        super( formRenderer, renderContextServices );
    }

    public void setRenderingSettings( FormModelerFormRenderingSettings settings ) {
        this.renderingSettings = settings;
    }

    public void setResizeListener( FormContentResizeListener listener ) {
        this.resizeListener = listener;
    }

    public void setJSNIHelper( JSNIHelper JSNIHelper ) {
        this.jsniHelper = JSNIHelper;
    }

    public void setTaskService( Caller<TaskService> taskService ) {
        this.taskService = taskService;
    }

    public void setTaskRefreshedEvent( Event<TaskRefreshedEvent> taskRefreshed ) {
        this.taskRefreshed = taskRefreshed;
    }

    public void setIdentity( User identity ) {
        this.identity = identity;
    }
}
