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

package org.jbpm.console.ng.cm.model;


import java.util.Objects;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;

@Bindable
@Portable
public class CaseStageSummary {

    private String name;
    private String identifier;
    private String status;

    public CaseStageSummary() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(final String identifier) {
        this.identifier = identifier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaseStageSummary that = (CaseStageSummary) o;
        return Objects.equals(identifier, that.identifier);
    }

    @Override
    @SuppressWarnings("PMD.AvoidMultipleUnaryOperators")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
        result = ~~result;
        return result;
    }

    @Override
    public String toString() {
        return "CaseCommentSummary{" +
                "identifier='" + identifier + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status +
                '}';
    }

    public static class Builder {

        private CaseStageSummary caseStageSummary = new CaseStageSummary();

        public CaseStageSummary build() {
            return caseStageSummary;
        }

        public Builder identifier(final String identifier) {
            caseStageSummary.setIdentifier(identifier);
            return this;
        }

        public Builder name(final String name) {
            caseStageSummary.setName(name);
            return this;
        }

        public Builder status(final String status) {
            caseStageSummary.setStatus(status);
            return this;
        }

    }

}