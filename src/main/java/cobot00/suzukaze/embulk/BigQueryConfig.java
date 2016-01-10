package cobot00.suzukaze.embulk;

import lombok.Value;

@Value
public class BigQueryConfig {

	private String projectId;
	private String serviceEmail;
	private String p12KeyFilePath;
	private String schemaDir;
	private String configDir;
}
