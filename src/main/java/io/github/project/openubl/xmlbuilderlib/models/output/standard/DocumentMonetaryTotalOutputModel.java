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
package io.github.project.openubl.xmlbuilderlib.models.output.standard;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class DocumentMonetaryTotalOutputModel {

    @Min(0)
    @NotNull
    @Digits(integer = 100, fraction = 2)
    private BigDecimal valorVentaSinImpuestos;

    @Min(0)
    @NotNull
    @Digits(integer = 100, fraction = 2)
    private BigDecimal valorVentaConImpuestos;

    @Min(0)
    @NotNull
    @Digits(integer = 100, fraction = 2)
    private BigDecimal importeTotal;

    @Min(0)
    @Digits(integer = 100, fraction = 2)
    private BigDecimal anticiposTotal;

    public BigDecimal getValorVentaSinImpuestos() {
        return valorVentaSinImpuestos;
    }

    public void setValorVentaSinImpuestos(BigDecimal valorVentaSinImpuestos) {
        this.valorVentaSinImpuestos = valorVentaSinImpuestos;
    }

    public BigDecimal getValorVentaConImpuestos() {
        return valorVentaConImpuestos;
    }

    public void setValorVentaConImpuestos(BigDecimal valorVentaConImpuestos) {
        this.valorVentaConImpuestos = valorVentaConImpuestos;
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

    public BigDecimal getAnticiposTotal() {
        return anticiposTotal;
    }

    public void setAnticiposTotal(BigDecimal anticiposTotal) {
        this.anticiposTotal = anticiposTotal;
    }

    public static final class Builder {
        private BigDecimal valorVentaSinImpuestos;
        private BigDecimal valorVentaConImpuestos;
        private BigDecimal importeTotal;
        private BigDecimal anticiposTotal;

        private Builder() {
        }

        public static Builder aDocumentMonetaryTotalOutputModel() {
            return new Builder();
        }

        public Builder withValorVentaSinImpuestos(BigDecimal valorVentaSinImpuestos) {
            this.valorVentaSinImpuestos = valorVentaSinImpuestos;
            return this;
        }

        public Builder withValorVentaConImpuestos(BigDecimal valorVentaConImpuestos) {
            this.valorVentaConImpuestos = valorVentaConImpuestos;
            return this;
        }

        public Builder withImporteTotal(BigDecimal importeTotal) {
            this.importeTotal = importeTotal;
            return this;
        }

        public Builder withAnticiposTotal(BigDecimal anticiposTotal) {
            this.anticiposTotal = anticiposTotal;
            return this;
        }

        public DocumentMonetaryTotalOutputModel build() {
            DocumentMonetaryTotalOutputModel documentMonetaryTotalOutputModel = new DocumentMonetaryTotalOutputModel();
            documentMonetaryTotalOutputModel.setValorVentaSinImpuestos(valorVentaSinImpuestos);
            documentMonetaryTotalOutputModel.setValorVentaConImpuestos(valorVentaConImpuestos);
            documentMonetaryTotalOutputModel.setImporteTotal(importeTotal);
            documentMonetaryTotalOutputModel.setAnticiposTotal(anticiposTotal);
            return documentMonetaryTotalOutputModel;
        }
    }
}
