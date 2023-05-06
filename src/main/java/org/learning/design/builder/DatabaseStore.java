package org.learning.design.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
public class DatabaseStore {
    private String host;
    private Integer port;
    private String username;
    private String password;
    private Long id;
    private DatabaseType type;

    // Step 1: hide the ctor
    private DatabaseStore() {}

    // to avoid creating builder instance like this
    // DatabaseStore.DatabaseStoreBuilder db = new DatabaseStore.DatabaseStoreBuilder();
    // have a utility method
    // this is static initializer
    public static DatabaseStoreBuilder builder() {
        return new DatabaseStoreBuilder();
    }

    @Setter
    // step 2: create the builder class (inner class)
    public static class DatabaseStoreBuilder {
        // step 3: copy the outer class fields
        private String host;
        private Integer port;
        private String username;
        private String password;
        private Long id;
        private DatabaseType type;

        // step 4.0: Add fluent interfaces for setters
        public DatabaseStoreBuilder withHost(String host) {
            this.host = host;
            return this;
        }

        public DatabaseStoreBuilder ofType(DatabaseType type) {
            this.type = type;
            return this;
        }

        // step 4: create the build method
        public DatabaseStore build() {

            boolean isValid = validate();

            if (!isValid) {
                throw new RuntimeException("Object is not valid");
            }

            DatabaseStore db = new DatabaseStore();
            db.host = host;
            db.port = port;
            db.username = username;
            db.password = password;
            db.id = id;
            db.type = type;

            return db;
        }

        public boolean validate() {
            return type != null;
        }
    }
}
