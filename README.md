JAVA Setup
--------------
1) Download JDK - https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2) Install JDK
3) Configure Environmental Variables
   JAVA_HOME=C:\Program Files\Java\jdk1.8
   Path=<existing path>;%JAVA_HOME%\bin
4) Open new command prompt and verify Java version
   java -version
   javac -version
5) Java Setup is Success if you see the version details

STS Setup
----------
1) Download STS - https://spring.io/tools
2) Extract STS jar file by executing 'java -jar spring-tool-suite*.jar' to local directory e.g: C:\Programs\STS
3) Navigate to STS directory e.g: C:\Programs\STS\sts-<4.x.x>.RELEASE
4) Create shortcut to Desktop for SpringToolSuite4.exe
5) Launch STS by double clicking SpringToolSuite4.exe
6) Select Workspace directory
7) Launches STS and you can see Welcome Dashboard or Blank Editor

MYSQL Installation
------------------
STEP 1: Download MySQL zip file
STEP 2: Copy into local directory and unzip
STEP 3: Configure environmental variable to add MYSQL_HOME and update Path
STEP 4: Open Commant Prompt as Administrator
STEP 5: mysqld --version
STEP 6: Create 'data' directory inside MySQL_HOME directory
STEP 7: Initialize MySQL Server
mysqld --initialize-insecure
STEP 8: Start MySQL Server
mysqld --console
STEP 9: Open Command Prompt
mysql -u root -p
[Prompt password]

Note: Clean-up data directory if you get any error while executing
'mysqld --initialize-insecure' command


Kafka Installation
------------------
#Installation (Windows)
STEP 1: Download Kafka (v2.8.0) from https://kafka.apache.org/downloads
STEP 2: Extract Kafka to local directory e.g: C:\Programs\Kafka\kafka-2.8.0
STEP 3: Open %KAFKA_HOME%\config\zookeeper.properties and set dataDir=/Programs/Kafka/kafka-2.8.0/data/zookeeper
STEP 4: Open %KAFKA_HOME%\config\server.properties and set log.dirs=/Programs/Kafka/kafka-2.8.0/data/kafka-logs
STEP 5: Create %KAFKA_HOME%\data directory [Optional]
#Starting (Windows)
STEP 6: Open Command Prompt in Admin mode and Navigate to %KAFKA_HOME%
STEP 7: Start Zookeeper> bin\windows\zookeeper-server-start.bat config\zookeeper.properties
STEP 8: Open another Command Prompt in Admin mode and Navigate to %KAFKA_HOME%
STEP 9: Start Kafka> bin\windows\kafka-server-start.bat config\server.properties

==================================================================================

#Kafka Installation (*nix/mac)
STEP 1:
cd ~/Downloads
curl https://archive.apache.org/dist/kafka/2.8.0/kafka_2.13-2.8.0.tgz -o kafka-2.8.0.tgz
STEP 2: sudo tar xzvf kafka-2.8.0.tgz -C ~/kafka-training/programs
cd ~/kafka-training/programs/kafka-2.8.0            (=> verify installation)
STEP 3: Open %KAFKA_HOME%\config\zookeeper.properties and set dataDir=/home/user/kafka-training/programs/kafka-2.8.0/data/zookeeper
STEP 4: Open %KAFKA_HOME%\config\server.properties and set log.dirs=/home/user//kafka-training/programs/kafka-2.8.0/data/kafka-logs
STEP 5: Create %KAFKA_HOME%\data directory [Optional]

#Starting (*nix/mac)
STEP 6: Open Console in Admin mode and Navigate to %KAFKA_HOME%
STEP 7: Start Zookeeper> bin/zookeeper-server-start.sh config/zookeeper.properties
STEP 8: Open another Console in Admin mode and Navigate to %KAFKA_HOME%
STEP 9: Start Kafka> bin/kafka-server-start.sh config/server.properties

====================================================================================

#Kafka Manager (docker image setup)
docker pull hlebalbau/kafka-manager
docker run -d -p 9000:9000 -e ZK_HOSTS="localhost:2181" hlebalbau/kafka-manager:stable -Dpidfile.path=/dev/null
#Kafdrop
docker run -d --rm -p 9000:9001 -e KAFKA_BROKERCONNECT=localhost:9092 -e JVM_OPTS="-Xms32M -Xmx64M" -e SERVER_SERVLET_CONTEXTPATH="/" obsidiandynamics/kafdrop

======================================================================================

#Kafka Commands
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test
kafka-topics.bat --list --bootstrap-server localhost:9092
kafka-console-producer.bat --broker-list localhost:9092 --topic test
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning
kafka-topics.bat --delete --bootstrap-server localhost:2181 --topic test

#Casestudy Setup
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic ORDER_CREATED
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic ORDER_APPROVED
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic ORDER_REJECTED