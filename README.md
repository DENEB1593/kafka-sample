## Start Kafka Zookeeper
    bin/zookeeper-server-start.sh config/zookeeper.properties

## Start Kafka Server
    bin/kafka-server-start.sh config/server.properties

## Start Kafka Consumer
    bin/kafka-console-consumer.sh --topic deneb1593 --from-beginning --bootstrap-server localhost:9092

## Start springboot App