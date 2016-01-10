package cobot00.suzukaze.embulk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BigQueryConfigTest {

    @Test
    public void values() {
        final BigQueryConfig target = new BigQueryConfig("project_id", "service_email", "key", "schema_dir",
                "config_dir");

        assertEquals(target.getProjectId(), "project_id");
        assertEquals(target.getServiceEmail(), "service_email");
        assertEquals(target.getP12KeyFilePath(), "key");
        assertEquals(target.getSchemaDir(), "schema_dir");
        assertEquals(target.getConfigDir(), "config_dir");
    }

}
