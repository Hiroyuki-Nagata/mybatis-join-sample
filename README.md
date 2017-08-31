### mybatis-join-sample



## Test

### H2DB

* `h2-maven-plugin` を以下のように実行する

    mvn com.edugility:h2-maven-plugin:1.0:spawn

* これで H2DBを `tcp://localhost:9092` で起動できる

    mvn com.edugility:h2-maven-plugin:1.0:stop

* でデータベースを停止できる

### flyway

* `flyway` を以下のように実行する

	mvn flyway:info -Dflyway.configFile=flyway.properties
	mvn flyway:migrate -Dflyway.configFile=flyway.properties
