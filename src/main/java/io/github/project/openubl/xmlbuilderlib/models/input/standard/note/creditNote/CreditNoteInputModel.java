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
package io.github.project.openubl.xmlbuilderlib.models.input.standard.note.creditNote;

import io.github.project.openubl.xmlbuilderlib.models.catalogs.Catalog9;
import io.github.project.openubl.xmlbuilderlib.models.catalogs.constraints.CatalogConstraint;
import io.github.project.openubl.xmlbuilderlib.models.input.common.ClienteInputModel;
import io.github.project.openubl.xmlbuilderlib.models.input.common.CuotaDePagoInputModel;
import io.github.project.openubl.xmlbuilderlib.models.input.common.FirmanteInputModel;
import io.github.project.openubl.xmlbuilderlib.models.input.common.ProveedorInputModel;
import io.github.project.openubl.xmlbuilderlib.models.input.constraints.CuotaDePagoInputModel_Porcentaje100CollectionConstraint;
import io.github.project.openubl.xmlbuilderlib.models.input.constraints.HighLevelGroupValidation;
import io.github.project.openubl.xmlbuilderlib.models.input.standard.DocumentLineInputModel;
import io.github.project.openubl.xmlbuilderlib.models.input.standard.GuiaRemisionRelacionadaInputModel;
import io.github.project.openubl.xmlbuilderlib.models.input.standard.note.NoteInputModel;

import javax.validation.Valid;
import java.util.List;

public class CreditNoteInputModel extends NoteInputModel {

    @CatalogConstraint(value = Catalog9.class)
    private String tipoNota;

    @Valid
    @CuotaDePagoInputModel_Porcentaje100CollectionConstraint(groups = HighLevelGroupValidation.class)
    private List<CuotaDePagoInputModel> cuotasDePago;

    @Valid
    private List<DocTribRelacionadoInputModel_CreditNote> otrosDocumentosTributariosRelacionados;

    public String getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    public List<CuotaDePagoInputModel> getCuotasDePago() {
        return cuotasDePago;
    }

    public void setCuotasDePago(List<CuotaDePagoInputModel> cuotasDePago) {
        this.cuotasDePago = cuotasDePago;
    }

    public List<DocTribRelacionadoInputModel_CreditNote> getOtrosDocumentosTributariosRelacionados() {
        return otrosDocumentosTributariosRelacionados;
    }

    public void setOtrosDocumentosTributariosRelacionados(List<DocTribRelacionadoInputModel_CreditNote> otrosDocumentosTributariosRelacionados) {
        this.otrosDocumentosTributariosRelacionados = otrosDocumentosTributariosRelacionados;
    }

    public static final class Builder {
        protected String serie;
        private String serieNumeroComprobanteAfectado;
        private String tipoNota;
        private String descripcionSustento;
        private Integer numero;
        private Long fechaEmision;
        private ClienteInputModel cliente;
        private ProveedorInputModel proveedor;
        private FirmanteInputModel firmante;
        private List<DocumentLineInputModel> detalle;
        private List<CuotaDePagoInputModel> cuotasDePago;
        private List<GuiaRemisionRelacionadaInputModel> guiasRemisionRelacionadas;
        private List<DocTribRelacionadoInputModel_CreditNote> otrosDocumentosTributariosRelacionados;

        private Builder() {
        }

        public static Builder aCreditNoteInputModel() {
            return new Builder();
        }

        public Builder withSerieNumeroComprobanteAfectado(String serieNumeroComprobanteAfectado) {
            this.serieNumeroComprobanteAfectado = serieNumeroComprobanteAfectado;
            return this;
        }

        public Builder withTipoNota(String tipoNota) {
            this.tipoNota = tipoNota;
            return this;
        }

        public Builder withDescripcionSustento(String descripcionSustento) {
            this.descripcionSustento = descripcionSustento;
            return this;
        }

        public Builder withSerie(String serie) {
            this.serie = serie;
            return this;
        }

        public Builder withNumero(Integer numero) {
            this.numero = numero;
            return this;
        }

        public Builder withFechaEmision(Long fechaEmision) {
            this.fechaEmision = fechaEmision;
            return this;
        }

        public Builder withCliente(ClienteInputModel cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder withProveedor(ProveedorInputModel proveedor) {
            this.proveedor = proveedor;
            return this;
        }

        public Builder withFirmante(FirmanteInputModel firmante) {
            this.firmante = firmante;
            return this;
        }

        public Builder withDetalle(List<DocumentLineInputModel> detalle) {
            this.detalle = detalle;
            return this;
        }

        public Builder withCuotasDePago(List<CuotaDePagoInputModel> cuotasDePago) {
            this.cuotasDePago = cuotasDePago;
            return this;
        }

        public Builder withGuiasRemisionRelacionadas(List<GuiaRemisionRelacionadaInputModel> guiasRemisionRelacionadas) {
            this.guiasRemisionRelacionadas = guiasRemisionRelacionadas;
            return this;
        }

        public Builder withOtrosDocumentosTributariosRelacionados(List<DocTribRelacionadoInputModel_CreditNote> otrosDocumentosTributariosRelacionados) {
            this.otrosDocumentosTributariosRelacionados = otrosDocumentosTributariosRelacionados;
            return this;
        }

        public CreditNoteInputModel build() {
            CreditNoteInputModel creditNoteInputModel = new CreditNoteInputModel();
            creditNoteInputModel.setSerieNumeroComprobanteAfectado(serieNumeroComprobanteAfectado);
            creditNoteInputModel.setTipoNota(tipoNota);
            creditNoteInputModel.setDescripcionSustentoDeNota(descripcionSustento);
            creditNoteInputModel.setSerie(serie);
            creditNoteInputModel.setNumero(numero);
            creditNoteInputModel.setFechaEmision(fechaEmision);
            creditNoteInputModel.setCliente(cliente);
            creditNoteInputModel.setProveedor(proveedor);
            creditNoteInputModel.setFirmante(firmante);
            creditNoteInputModel.setDetalle(detalle);
            creditNoteInputModel.setCuotasDePago(cuotasDePago);
            creditNoteInputModel.setGuiasRemisionRelacionadas(guiasRemisionRelacionadas);
            creditNoteInputModel.setOtrosDocumentosTributariosRelacionados(otrosDocumentosTributariosRelacionados);
            return creditNoteInputModel;
        }
    }
}
