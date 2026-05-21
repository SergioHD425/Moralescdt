package co.edu.udistrital.dao;

import co.edu.udistrital.dto.CdtDTO;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CdtDAO {

    public void calcularGanancia(CdtDTO cdt) {

        double tasa = cdt.getTasaInteres();

        if (tasa >= 1.0) {
            tasa = tasa / 100.0;
        }

        double ganancia =
                cdt.getValorInversion()
                * tasa
                * ((double) cdt.getDias() / 360.0);

        cdt.setGananciaBruta(ganancia);

        cdt.setValorTotal(
                cdt.getValorInversion() + ganancia
        );
    }
}
