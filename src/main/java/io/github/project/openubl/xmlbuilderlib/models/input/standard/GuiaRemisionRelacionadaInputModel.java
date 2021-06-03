/**
 * Copyright 2019 Project OpenUBL, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Eclipse Public License - v 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.project.openubl.xmlbuilderlib.models.input.standard;

import io.github.project.openubl.xmlbuilderlib.models.catalogs.Catalog1_Guia;
import io.github.project.openubl.xmlbuilderlib.models.catalogs.constraints.CatalogConstraint;

import javax.validation.constraints.NotBlank;

public class GuiaRemisionRelacionadaInputModel {

    @NotBlank
    protected String serieNumero;

    @CatalogConstraint(value = Catalog1_Guia.class)
    protected String tipoDocumento;

    public String getSerieNumero() {
        return serieNumero;
    }

    public void setSerieNumero(String serieNumero) {
        this.serieNumero = serieNumero;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public static final class Builder {
        protected String serieNumero;
        protected String tipoDocumento;

        private Builder() {
        }

        public static Builder aGuiaRemisionRelacionadaInputModel() {
            return new Builder();
        }

        public Builder withSerieNumero(String serieNumero) {
            this.serieNumero = serieNumero;
            return this;
        }

        public Builder withTipoDocumento(String tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
            return this;
        }

        public GuiaRemisionRelacionadaInputModel build() {
            GuiaRemisionRelacionadaInputModel guiaRemisionRelacionadaInputModel = new GuiaRemisionRelacionadaInputModel();
            guiaRemisionRelacionadaInputModel.setSerieNumero(serieNumero);
            guiaRemisionRelacionadaInputModel.setTipoDocumento(tipoDocumento);
            return guiaRemisionRelacionadaInputModel;
        }
    }
}
