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
package org.jbpm.console.ng.cm.backend.server;


import java.util.function.Function;

import org.jbpm.console.ng.cm.model.CaseMilestoneSummary;
import org.kie.server.api.model.cases.CaseMilestone;

public class CaseMilestoneMapper implements Function<CaseMilestone, CaseMilestoneSummary> {

    @Override
    public CaseMilestoneSummary apply(CaseMilestone cm) {
        if (cm == null) {
            return null;
        }

        return CaseMilestoneSummary.builder()
                .name(cm.getName())
                .identifier(cm.getIdentifier())
                .achieved(cm.isAchieved())
                .achievedAt(cm.getAchievedAt())
                .status(cm.getStatus())
                .build();
    }

}
