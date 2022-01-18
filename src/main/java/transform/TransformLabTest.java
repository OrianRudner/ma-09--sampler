package transform;

import Models.LabTest;
import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;

import java.util.List;

public class TransformLabTest implements Transform{
    @Override
    public void transformData(List objects) {

        List<LabTest> tests = objects;
        HealthCareInfoProvider healthCareInfoProvider = new HealthCareInfoProvider();

        for (int i = 0; i < tests.size(); i++) {

            if (tests.get(i).getIDNum() == 9) {
                try {
                    PersonInsured person = healthCareInfoProvider.fetchInfo(tests.get(i).getIDNum(), tests.get(i).getIDType());
                    tests.get(i).setJoinDate(person.getJoinDate());
                    tests.get(i).setHealthCareID(person.getHealthCareId());
                    tests.get(i).setHealthCareName(person.getHealthCareName());

                } catch (InvalidIdException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
