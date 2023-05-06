package org.learning.design.builder;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.crypto.Data;

@NoArgsConstructor
@Setter
public class Database {
    private String host;
    private Integer port;
    private String username;
    private String password;
    private Long id;
    private DatabaseType type;

    public Database(String host, Integer port, String username, String password, long id, DatabaseType type) {
        this.host = host;

        // validation is difficult and only option is to throw error in case any error present
        if (port < 20000) {
            throw new RuntimeException("Invalid port - port < 20000");
        }

        this.port = port;
        this.username = username;
        this.password = password;
        this.id = id;
        this.type = type;
    }

    // telescoping
    public Database(String host, Integer port, DatabaseType type) {
        new Database(host, port, null, null, null, type);
    }

    public Database(DatabaseType type) {
        new Database(null, null, type);
    }

}
