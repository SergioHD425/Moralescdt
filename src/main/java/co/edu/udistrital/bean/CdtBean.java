package co.edu.udistrital.bean;

import co.edu.udistrital.dao.CdtDAO;
import co.edu.udistrital.dto.CdtDTO;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class CdtBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private CdtDTO currentCdt;

    private List<CdtDTO> historial;

    @Inject
    private CdtDAO cdtDAO;

    @PostConstruct
    public void init() {

        currentCdt = new CdtDTO();

        historial = new ArrayList<>();
    }

    public String simular() {

        cdtDAO.calcularGanancia(currentCdt);

        CdtDTO clone = new CdtDTO();

        clone.setNombre(currentCdt.getNombre());
        clone.setApellidos(currentCdt.getApellidos());
        clone.setCorreo(currentCdt.getCorreo());
        clone.setTelefono(currentCdt.getTelefono());

        clone.setDias(currentCdt.getDias());
        clone.setValorInversion(currentCdt.getValorInversion());
        clone.setTasaInteres(currentCdt.getTasaInteres());

        clone.setGananciaBruta(currentCdt.getGananciaBruta());
        clone.setValorTotal(currentCdt.getValorTotal());

        historial.add(clone);

        return "resultado.xhtml?faces-redirect=true";
    }

    public String volver() {

        currentCdt = new CdtDTO();

        return "index.xhtml?faces-redirect=true";
    }

    public void limpiar() {

        historial.clear();

        currentCdt = new CdtDTO();
    }

    public CdtDTO getCurrentCdt() {
        return currentCdt;
    }

    public void setCurrentCdt(CdtDTO currentCdt) {
        this.currentCdt = currentCdt;
    }

    public List<CdtDTO> getHistorial() {
        return historial;
    }

    public void setHistorial(List<CdtDTO> historial) {
        this.historial = historial;
    }
}
