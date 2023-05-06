package org.learning.design.builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.util.Map;
import java.util.Objects;

@NoArgsConstructor
@Setter
@Getter
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
        new Database(host, port, null, null, 0, type);
    }

    public Database(DatabaseType type) {
        new Database(null, null, type);
    }

    public Database(Map<String, Object> hm) {
        // issue -
        // 1. we dont know what key to set - difficult to maintain and extend
        // 2. no typesafe
        if (hm.containsKey("host")) {
            this.host = (String) hm.get("host");
        }

        if (hm.containsKey("port")) {
            this.port = (Integer) hm.get("port");
        }

        if (hm.containsKey("username")) {
            this.username = (String) hm.get("username");
        }

        if (hm.containsKey("password")) {
            this.password = (String) hm.get("password");
        }

        if (hm.containsKey("id")) {
            this.id = (Long) hm.get("id");
        }

        if (hm.containsKey("type")) {
            this.type = (DatabaseType) hm.get("type");
        }
    }
}
