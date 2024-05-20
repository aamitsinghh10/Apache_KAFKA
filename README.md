# Apache_KAFKA
# Apache Kafka

Apache Kafka is a distributed event streaming platform capable of handling trillions of events a day. It was originally developed at LinkedIn and later became an open-source Apache project in 2011. Kafka is written in Scala and Java and offers a robust platform for building real-time data pipelines and streaming applications.

## Features

- **High Throughput**: Capable of handling high-velocity and high-volume data.
- **Scalable**: Easily scales horizontally by adding more nodes.
- **Durable**: Data is replicated across multiple nodes for fault tolerance.
- **Distributed**: Supports distributed processing of data streams.
- **Fault-tolerant**: Provides resilience to system failures.

## Installation Guide

### Prerequisites

- Java 8+ installed
- Zookeeper (bundled with Kafka)

### Steps

1. **Download Kafka**

   Download the latest version of Kafka from the official [Apache Kafka Downloads](https://kafka.apache.org/downloads) page.

   ```bash
   wget https://downloads.apache.org/kafka/3.7.0/kafka_2.13-3.7.0.tgz
   tar -xzf kafka_2.13-3.7.0.tgz
   cd kafka_2.13-3.7.0

1. **Start Zookeeper**
   Kafka uses Zookeeper to manage its cluster. Start the Zookeeper server:
   
   bin\windows\zookeeper-server-start.bat config\zookeeper.properties

2. **Start Kafka Server**
   Once Zookeeper is running, start the Kafka server:

   bin\windows\kafka-server-start.bat config\server.properties
   
3. **Create a Topic**
   Create a topic named 'test' with a replication factor of 1 and 1 partition:

   bin\windows\kafka-topics.bat --create --topic test --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1

4. **Send Messages**
   Use the Kafka producer to send messages to the 'test' topic:

   bin\windows\kafka-console-producer.bat --topic test --bootstrap-server localhost:9092

5. **Consume Messages**
   Use the Kafka consumer to read messages from the 'test' topic:

   bin\windows\kafka-console-consumer.bat --topic test --from-beginning --bootstrap-server localhost:9092

6. **Consumer Groups**
   To consume messages from the 'stock-ticks' topic as part of a consumer group (group1):
   
   bin\windows\kafka-console-consumer.bat --booststrap-server localhost:9092 --topic stock-ticks --from-beginning --group group1

8. **Produce Messages from a File**
   To send messages from a file (sample1.csv) to the 'stock-ticks' topic using the Kafka producer:
   
   bin\windows\kafka-console-producer.bat --topic stock-ticks --broker-list localhost:9092 < ..\data\sample1.csv

## Directory Structure

bin/: Contains the scripts for starting Kafka and Zookeeper.

config/: Contains configuration files for Kafka and Zookeeper.

libs/: Contains the libraries required by Kafka.

logs/: Default directory for logs.

## Configuration

Zookeeper: Configured in config/zookeeper.properties.

Kafka Broker: Configured in config/server.properties.
