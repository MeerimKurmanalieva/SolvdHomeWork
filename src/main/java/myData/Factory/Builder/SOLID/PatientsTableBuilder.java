package myData.Factory.Builder.SOLID;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PatientsTableBuilder {
    private StringBuilder queryBuilder;
    private String dbUrl;
    private String dbUser;
    private String dbPassword;

    public void MySQLHealthcareFactory() {
        loadConfig();
    }

    private void loadConfig() {
        try (FileInputStream input = new FileInputStream("config.properties")) {
            Properties properties = new Properties();
            properties.load(input);

            dbUrl = properties.getProperty("db.url");
            dbUser = properties.getProperty("db.user");
            dbPassword = properties.getProperty("db.password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PatientsTableBuilder() {
        this.queryBuilder = new StringBuilder();
        this.queryBuilder.append("CREATE TABLE IF NOT EXISTS `mydb`.`Patients` (");
    }

    public PatientsTableBuilder addColumn(String columnName, String dataType, boolean notNull) {
        if (queryBuilder.charAt(queryBuilder.length() - 1) != '(') {
            queryBuilder.append(", ");
        }

        queryBuilder.append("`").append(columnName).append("` ").append(dataType);

        if (notNull) {
            queryBuilder.append(" NOT NULL");
        }

        return this;
    }

    public PatientsTableBuilder addPrimaryKey(String columnName) {
        queryBuilder.append(", PRIMARY KEY (`").append(columnName).append("`)");
        return this;
    }

    public PatientsTableBuilder addIndex(String indexName, String columnName) {
        queryBuilder.append(", INDEX `").append(indexName).append("` (`").append(columnName).append("`)");
        return this;
    }

    public String build() {
        queryBuilder.append(") ENGINE = InnoDB;");
        return queryBuilder.toString();
    }

    public static void main(String[] args) {
        PatientsTableBuilder patientsTableBuilder = new PatientsTableBuilder();
        patientsTableBuilder.addColumn("patient_id", "INT", true);
        patientsTableBuilder.addColumn("name", "VARCHAR(45)", true);
        patientsTableBuilder.addColumn("date_of_birth", "DATE", true);
        patientsTableBuilder.addColumn("address", "VARCHAR(45)", true);
        patientsTableBuilder.addColumn("phone_number", "INT", true);
        patientsTableBuilder.addPrimaryKey("patient_id");
        patientsTableBuilder.addIndex("patient_id_index", "patient_id");
        String patientsTableQuery = patientsTableBuilder.build();
        System.out.println(patientsTableQuery);
    }
}

