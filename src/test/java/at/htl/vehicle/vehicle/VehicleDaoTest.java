package at.htl.vehicle.vehicle;


import io.agroal.api.AgroalDataSource;
import io.quarkus.narayana.jta.QuarkusTransaction;
import io.quarkus.test.junit.QuarkusTest;
import org.assertj.db.type.Table;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;


import static org.assertj.db.api.Assertions.assertThat;
import static org.assertj.db.output.Outputs.output;

@QuarkusTest
class VehicleDaoTest {

    @Inject
    VehicleDao vehicleDao;

    @Inject
    EntityManager em;

    @Inject
    AgroalDataSource ds;

    @Test
    //@Transactional
    void name() {
        QuarkusTransaction.begin();
        var vehicle = new Vehicle(
                "Opel"
                , "Primus");
        vehicleDao.persist(vehicle);
        //em.flush();
        QuarkusTransaction.commit();
        //vehicleDao.em.flush();
        var table = new Table(ds, "X_VEHICLE");
        output(table).toConsole();
        assertThat(table).exists().hasNumberOfRows(1);
    }
}