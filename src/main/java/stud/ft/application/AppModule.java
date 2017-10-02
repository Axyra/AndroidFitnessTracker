package stud.ft.application;

import android.app.Application;

import com.google.inject.AbstractModule;

import org.greenrobot.greendao.database.Database;

import stud.ft.dal.DaoMaster;
import stud.ft.dal.DaoSession;
import stud.ft.dal.HeartRateEntryDao;
import stud.ft.dal.StepCountDao;
import stud.ft.services.Greeter;
import stud.ft.services.GreeterImpl;

public class AppModule extends AbstractModule {

    Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Override
    protected void configure() {
        bind(Greeter.class).to(GreeterImpl.class);
        configureDatabase();
    }

    private void configureDatabase() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(application.getApplicationContext(), "ft-db");
        Database database = helper.getWritableDb();
        DaoSession session = new DaoMaster(database).newSession();

        bind(HeartRateEntryDao.class).toInstance(session.getHeartRateEntryDao());
        bind(StepCountDao.class).toInstance(session.getStepCountDao());
    }
}
